package AlgorithmPractice;

import java.util.Arrays;

public class SorterMain {

	public static void main(String[] args) {
		int[] array = {2,4,9,5,7,1,10,14};

		IntegerSorter integer = new IntegerSorter();
		integer.setList(array);
		integer.sort(1);
		
		System.out.println(Arrays.toString(integer.sortedList));

	}

}
