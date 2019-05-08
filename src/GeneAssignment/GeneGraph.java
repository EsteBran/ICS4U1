package GeneAssignment;

import java.util.Arrays;
import java.util.LinkedList;


//implementation of a graph using an adjacency matrix

public class GeneGraph {

	private int edges;
	private int vertices;
	private boolean[][] adj;
	protected String[] nodes;
	protected int[] v;

	//creates empty graph
	public GeneGraph(int V) {
		this.vertices = V;
		this.edges = 0;
		this.adj = new boolean[vertices][vertices];
		this.nodes = new String[vertices];
		this.v = new int[vertices];
	}

	//assigns node s to vertex at given index
	public void addNodes(int index, String s) {
		if (index > nodes.length) {System.out.println("index out of bounds");}
		else { nodes[index] = s; }
	}

	//gets edges and vertices
	public int getVertices() {
		return vertices;
	}
	public int getEdges() {
		return edges;
	}

	//adds an edge v-w
	public void addEdge(int v, int w) {
		if (!adj[v][w]) {edges += 1; }
		adj[v][w] = true;
		adj[w][v] = true;
	}

	//removes an edge v-w
	public void removeEdge(int v, int w) {
		adj[v][w] = false;
		adj[w][v] = false;
	}

	//checks if there's an edge v-w
	public boolean hasEdge(int v, int w) {
		return adj[v][w];
	}

	//string representation of the graph
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(vertices + " " + edges + "\n");

		s.append("\n");
		for (int v = 0; v < adj.length; v++) {
			if (v < 10) s.append(nodes[v] + ":  ");
			if (v >= 10) s.append(nodes[v] + ": ");

			for (int w= 0; w < adj[v].length; w++) {
				if (adj[v][w])  s.append(1 + " ");
				if (!adj[v][w]) s.append(0 + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}

	//returns true if geneA is a valid mutation of geneB according to the rules
	public boolean validMutation(String a, String b) {

		if (a.equals(b)) return true;
		char[] geneA = a.toCharArray();
		char[] geneB = b.toCharArray();

		//difference between one gene to another
		//one swapped//different chemical would result in a value of 1
		//if there are two or more swapped/different chemicals, mutation is invalid
		int difference = 0;
		int swaps = 0;

		//checks how many differences there are between geneA and geneB
		for (int i = 0; i < geneB.length; i++) {
			if (geneA[i] != geneB[i]) difference += 1;
		}

		//checks if geneA has any swapped chemicals
		for (int i = 0; i < geneB.length - 1; i++) { 
			if (geneA[i] == geneB[i+1] && geneA[i+1] == geneB[i]) swaps += 1;
		}

		//mutations are only valid if differences and number of swaps is 1
		if (difference == 1 && swaps == 0) {return true;}
		else if (difference == 2 && swaps == 1) {return true;}
		else {return false;}
	}

	//makes links between nodes that are valid mutations of each other
	public void makeLinks() {
		for (int u = 0; u < nodes.length ; u++) {
			for (int v = 0; v < nodes.length ; v++) {
				if (validMutation(nodes[u], nodes[v])) addEdge(u, v);
			}
		}
	}

	//takes in the graph and the index of the starting node and 
	//returns an array of distances from source node
	//to all other nodes
	public int[] BFS(int start) 
	{ 
		
		//marks which nodes have been visited
		boolean[] visited = new boolean[nodes.length];
		
		// Create a queue for BFS and mark the 
		LinkedList<String> queue = new LinkedList<String>(); 
		int[] distances = new int[nodes.length];
		Arrays.fill(distances, -1);
		
		queue.add(nodes[start]);
		visited[start] = true;
		distances[start] = 0;
		
		while (!queue.isEmpty()) {
			//dequeue the vertex and print it
			String visitedNode = queue.remove();
			int nodeIndex = findIndex(visitedNode);
			
			
			//get all adjacent vertices, if they aren't visited
			//mark it and add it to the queue
			for (int i = 0; i < adj[nodeIndex].length; i++) {
				
				if (adj[nodeIndex][i] == true && !visited[i]) {
					visited[i] = true;
					queue.add(nodes[i]);
					distances[i] = distances[nodeIndex] + 1;
					
				}
			}
		}
		return distances;
		
	} 
	
	//returns the shortest distance between source and target nodes
	public int shortestDistance(String source, String target) {
		int startIndex = 0, targetIndex = 0, distance = 0;
		targetIndex = findIndex(target);
		startIndex = findIndex(source);
		int[] distances = BFS(startIndex);
		distance = distances[targetIndex];
		
		return distance;
	}
	
	//finds the index in the nodes array of a given string
	public int findIndex(String node) {
		int index = 0; 
		for (int i = 0; i < nodes.length; i++) {
			if (nodes[i].equals(node)) index = i;
			}
		return index;
	}


}
