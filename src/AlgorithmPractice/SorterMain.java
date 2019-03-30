package AlgorithmPractice;

import java.util.Arrays;

public class SorterMain {

	public static void main(String[] args) {
		int[] array = {2,4,9,5,7,1,10,14};
		int[] arr1 = {1,3,5, 17, 28, 39, 47, 58};
		int[] arr2 = {2,4,6,7, 27, 37, 49, 50, 67};
		
		IntegerSorter integer = new IntegerSorter();
		integer.combineArray(arr1, arr2);
		
		System.out.println(Arrays.toString(integer.combinedList));

	}

}
