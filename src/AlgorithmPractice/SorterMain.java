package AlgorithmPractice;

import java.util.Arrays;
import java.util.Random;


public class SorterMain {



	public static void main(String[] args) {

		SorterMain s = new SorterMain();
		int[] genArr = s.generateArray(65536);
		
		IntegerSorter integer = new IntegerSorter();
		integer.setList(genArr);

		long startTime = System.nanoTime();

		integer.sort(3);

		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;


		System.out.println("Array size is " + genArr.length);
		System.out.println("sorted array: " + Arrays.toString(integer.sortedList));
		System.out.println("Execution time in nanoseconds: " + timeElapsed);
		System.out.println("Execution time in seconds: " + (double)timeElapsed/1e+9);
	}

	//creates an array of size n filled with random numbers between 1 and 10,000 with a given seed
	public int[] generateArray(int size) {

		int[] arr = new int[size];
		Random r = new Random(2130);

		for (int i = 0; i < size; i ++) {
			arr[i] = r.nextInt(1000000);
		}
		return arr;
	}

}
