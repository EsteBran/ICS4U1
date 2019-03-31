package AlgorithmPractice;


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
            /*
             * Splits methods iteratively until there are n arrays with size one
             * (I did it preemptivey), then iteratively combines
             * arrays until there is one sorted array of size n.
             */
            else if (type == 3) {

               sortedList = sort_method3(list);


            }
        }

    }
    /*
     * combines two sorted lists of arbitrary size (within int bounds)
     * into one sorted list. Input lists must be sorted. Returns the combined list.
     */
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

    /**
     * Splits the array list in half, returning the 2 parts as an array of 2 arrays
     * @param list
     * @return
     */
    private int[][] splitArray(int[] list)
    {
        int[] A = new int[list.length/2];
        int[] B = new int[list.length/2];
        int[][] C = new int[2][];

        for(int i=0; i<list.length/2; i++)
        {
            A[i] = list[i];
            B[i] = list[i+list.length/2];
        }
        C[0] = A;
        C[1] = B;
        return C;
    }


    protected int[]  sort_method3(int[] list)
    {
        int[][] split = new int[2][];
        int[] A=null;
        int[] B=null;
        int[] C=null;
        if(list.length>1) {
            split = splitArray(list);
            A = sort_method3(split[0]);
            B = sort_method3(split[1]);

        }else
            return list;

        if(A!=null && B!=null)
            C = combineArray(A, B);

        return C;

    }


}
