package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * reverse order of an unordered int array
 */
public class ReverseOrderOfAnArray_MySol {

    private static int[] unorderedArray = new int[]{ 3, 8, 2, 9, 50, 1 };
    private static int[] orderedArray = new int[unorderedArray.length];

    public static void main(String[] args) {
        printOriginalArray();

        mySol1();

        printSortedArray();
    }

    private static void printOriginalArray(){
        System.out.println("original array : " + Arrays.toString(unorderedArray));
    }

    private static void printSortedArray(){
        System.out.println("original array : " + Arrays.toString(orderedArray));
    }

    private static void mySol1(){
        List<Integer> list = new ArrayList<>();

        for (int i:unorderedArray) {
            list.add(i);
        }

        list.sort((o1, o2) -> o2 > o1 ? 1 : o1 > o2 ? -1 : 0);

        for (int i = 0; i < list.size(); i++) {
            orderedArray[i] = list.get(i);
        }
    }

}
