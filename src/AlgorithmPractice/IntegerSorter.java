package AlgorithmPractice;

import java.util.Arrays;

public class IntegerSorter implements Sorter {

    protected int[] list, sortedList, combinedList;

    @Override
    public void setList(int[] list) {
        this.list = list;
        sortedList = list.clone();
    }

    @Override
    public void sort(int type) {

        if (type == 1) {

            for (int i = 0; i < sortedList.length - 1; i++) {

                for (int j = 0; j < sortedList.length- 1 - i; j++) {

                    if (sortedList[j] > sortedList[j+1]) {

                        int a = sortedList[j];
                        sortedList[j] = sortedList[j+1];
                        sortedList[j+1] = a;
                        //System.out.println(Arrays.toString(sortedList));
                    }
                }
            }

        }
        else {

            if (type == 2) {

                for (int i = 0; i < sortedList.length - 1; i++) {

                    for (int j = i + 1 ; j < sortedList.length - 1 ; j++) {

                        if (sortedList[j] < sortedList[i]) {

                            int a = sortedList [i];
                            sortedList[i] = sortedList[j];
                            sortedList[j] = a;
                            //System.out.println(Arrays.toString(sortedList));
                        }

                    }
                }

            }
            else if (type == 3) {



            }
        }

    }

    public int[] combineArray (int[] listA, int[] listB) {

        combinedList = new int[listA.length + listB.length];
        
        int pointerA = 0;
        int pointerB = 0;
        
        for (int i = 0; i < combinedList.length; i++) {
        	if (pointerA > listA.length - 1) {
        		combinedList[i]= listB[pointerB];
        		pointerB++;
        		
        	}
        	else if (pointerB > listB.length - 1) {
        		combinedList[i] = listA[pointerA];
        		pointerA++;
        		
        	}
        	else if (listA[pointerA] < listB[pointerB]) {
        		combinedList[i] = listA[pointerA];
        		pointerA++;
        		
        	}
        	else {
        		combinedList[i] = listB[pointerB];
        		pointerB++;
        		
        	}
        }

        return combinedList;
    }

}
