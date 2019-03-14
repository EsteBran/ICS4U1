package oopExercises;

//Tawseef Hanif
//Mr. Radulovic
//February 28, 2019
//Die Class: rolls a biased die if specified, otherwise
//rolls an unbiased die

public class Die {
	

	private int sides , roll;
	private double[] bias;
	private double probability = 1.0;

	
	public int numSides() {
		return sides;
	}
	
	public void setNumSides(int N) {
		sides = N;
		probability /= N;
		bias = new double[N];
		
		for (int i = 0 ; i < N; i++) {
			bias[i] = probability;
		}
	}
	
	public void setBias(double[] biases) {
		int i = biases.length;
		double sum = 0;
		bias = biases;
		for (int a = 0; a < i; a++) {
			sum+= biases[a];
		}
		
		if (sum == 1.0) {
			for (int a = 1; a < i; a++) {
				bias[a] += bias[a-1];
			}
		}else {
			System.out.println("invalid array, sum is not 1");
			return;
		}
		
	}
	
	public int roll() {
		double num = Math.random();
		
		for (int i = 0; i < bias.length-1; i++) {		
			if (num < bias[i]) {
				roll = i+1;
				break;
			}
		}
		return roll;
		
	}
	
	

}
