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

        int a = 0;
        int b = 0;


        return combinedList;
    }

}
