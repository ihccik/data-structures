package homeworks;

import java.util.Arrays;
import java.util.Iterator;

/**
 * contains solutions for the question in resources/questions/Algo_8_Merge_Overlapping_Interval.pdf
 */
public class Algo8_mergeOverlapping_interval {

    private static  int[][] arbitraryIntervals = new int[][]{{1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}};
    private static int[][] mergedArray;

    public static void main(String[] args) {
        mySol1();
    }

    private static void mySol1(){

        boolean isAnyOverlappingIntervalFound = true;
        int arrayToMerge1 = 0, arrayToMerge2 = 0;

        while(isAnyOverlappingIntervalFound){
            outerArrays: for (int i = 0; i < arbitraryIntervals.length; i++) {
                int[] element0 = arbitraryIntervals[i];
                for (int j = i + 1; j < arbitraryIntervals.length; j++) {
                    int[] element1 = arbitraryIntervals[j];

                    System.out.println("element0: " + Arrays.toString(element0) + " element1:" + Arrays.toString(element1));

                    if (element1[0] <= element0[1] && element0[0] <= element1[1] && element0[0] < element1[0])
                    {
                        isAnyOverlappingIntervalFound = true;
                        arrayToMerge1 = i;
                        arrayToMerge2 = j;
                        System.out.println("ok");
                        break outerArrays;
                    }
                    else if (element0[0] <= element1[1] && element1[0] <= element0[1] && element1[0] < element0[0])
                    {
                        isAnyOverlappingIntervalFound = true;
                        arrayToMerge2 = i;
                        arrayToMerge1 = j;
                        System.out.println("ok");
                        break outerArrays;
                    }
                }
                isAnyOverlappingIntervalFound = false;
            }

            if(isAnyOverlappingIntervalFound){
                mergedArray = new int[arbitraryIntervals.length - 1][2];
                for (int i = 0, j = 0; i < arbitraryIntervals.length; i++) {
                    if (i != arrayToMerge1 && i != arrayToMerge2)
                    {
                        mergedArray[j] = arbitraryIntervals[i];
                        j++;
                    }
                }
                mergedArray[mergedArray.length - 1] = new int[]{
                        arbitraryIntervals[arrayToMerge1][0], arbitraryIntervals[arrayToMerge2][1]};

                arbitraryIntervals = Arrays.copyOf(mergedArray, mergedArray.length);
            }

        }



//        if (isAnyOverlappingIntervalFound){
//            mergedArray = new int[arbitraryIntervals.length - 1][2];
//            for (int i = 0, j = 0; i < mergedArray.length; i++, j++) {
//                if (j == arrayToMerge1)
//                {
//                    mergedArray[i][0] = arbitraryIntervals[j][0];
//                    i--;
//                }
//                else if (j == arrayToMerge2)
//                    mergedArray[i][1] = arbitraryIntervals[j][1];
//                else
//                    mergedArray[i] = arbitraryIntervals[j];
//            }
//            System.out.println(Arrays.deepToString(mergedArray));
//        }

        System.out.println(Arrays.deepToString(mergedArray));
    }

}
