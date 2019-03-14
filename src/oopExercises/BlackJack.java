package oopExercises;

import java.util.Arrays;

public class BlackJack {

	public static void main(String[] args) {
		Die d = new Die();
		double[] b = {0.5, 0.1, 0.1, 0.1, 0.1, 0.1};
		
		d.setNumSides(6);
		d.setBias(b);

		for (int i = 1; i <101; i++) {
		System.out.println(d.roll( ) + " ");
		}
		

	}

}
