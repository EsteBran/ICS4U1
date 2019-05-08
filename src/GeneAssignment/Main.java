package GeneAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	//main method takes in input and prints out answer
	public static void main(String[] args) {
		Scanner s;
		try {
			//takes in new file
			s = new Scanner(new File("DATA_10K.txt"));
			
			//stores the parameters for the inputs and scans accordingly
			int geneLength;
			int validGenes;
			int maxMutations;
			int numTest;
			String[] testGenes;
		
			
			geneLength = Integer.parseInt(s.nextLine());
			validGenes = Integer.parseInt(s.nextLine());
			
			//number of valid genes is the number of vertices in the graph
			GeneGraph genes = new GeneGraph(validGenes);
			
			//assign each gene to a position on the nodes array
			for (int i = 0; i < validGenes; i++) {
				genes.addNodes(i, s.nextLine());
			}
			
			maxMutations = Integer.parseInt(s.nextLine());
			numTest = Integer.parseInt(s.nextLine());
			
			testGenes = new String[numTest];
			
			for(int i = 0; i < numTest; i++) {
				testGenes[i] = s.nextLine();
			}
			
			//now each node is linked to another node 
			//if one node can mutate into another
			genes.makeLinks();
			
			
			//now test to see if the genes can mutate within m mutations
			//tester array always has size 2 since we are comparing two genes
			//then print the output as specified in the assignment sheet
			for (int i = 0; i < numTest; i++) {
				String[] compare = testGenes[i].split("\\s+");
				int distance = genes.shortestDistance(compare[0], compare[1]);
				if (distance > maxMutations || distance == -1) {
					System.out.println("NO");
					System.out.println(distance);
				}
				else {
					System.out.println("YES");
					System.out.println(distance);
				}
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
	

	
	
}
