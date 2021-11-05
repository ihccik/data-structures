package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * contains solutions for the question in resources/questions/Algo_6_Three_Number_Sum.pdf
 */
public class Algo6_threeNumber_sum {

    private final static int[] arrayToProcess = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
    private final static int targetSum = 0;

    public static void main(String[] args) {
        mySol1();
        System.out.println(Arrays.deepToString(mySol1()));
    }

    //original : 12, 3, 1, 2, -6, 5, -8, 6
    //sorted : -8, -6, 1, 2, 3, 5, 6, 12
    //c        21  15  10 6  3  1  count

    private static int[][] mySol1(){
        int counter = 0;
        Arrays.sort(arrayToProcess);

        System.out.println(Arrays.toString(arrayToProcess));

        ArrayList<MatchingNumbers> matchingNumbers = new ArrayList<>();
        for (int i = 0; i < arrayToProcess.length; i++) {
            int element1 = arrayToProcess[i];
            for (int j = i + 1; j < arrayToProcess.length; j++) {
                int element2 = arrayToProcess[j];
                for (int k = j + 1; k < arrayToProcess.length; k++) {
                    int element3 = arrayToProcess[k];

                    if (element1 + element2 + element3 == targetSum)
                        matchingNumbers.add(new MatchingNumbers(element1, element2, element3));
                    counter++;
                    System.out.println("element1 :" + element1 + " element2:" + element2 + " element3:" + element3);
                }
            }
        }
        System.out.println(counter);

        int[][] matchingNumbersArray = new int[matchingNumbers.size()][];
        for (int i = 0; i < matchingNumbers.size(); i++) {
            matchingNumbersArray[i] = matchingNumbers.get(i).getNumbersAsArray();
        }
        return matchingNumbersArray;
    }

    // O(n^2) time | O(n) space
    public static List<Integer[]> optimalSolution(int[] array, int targetSum){
        Arrays.sort(array);// nlog n
        List<Integer[]> triplets = new ArrayList<Integer[]>();
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == targetSum) {
                    Integer[] newTriplet = {array[i], array[left], array[right]};
                    triplets.add(newTriplet);
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                } else if (currentSum > targetSum) {
                    right--;
                }
            }
        }
        return triplets;
    }
}


class MatchingNumbers{
    int element1, element2, element3;

    public MatchingNumbers(int element1, int element2, int element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public int[] getNumbersAsArray(){
        return new int[]{element1, element2, element3};
    }
}
