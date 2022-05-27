package SmoothSailing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByHeight {
    /**
     * Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!
     * <p>
     * Example
     * <p>
     * For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
     * solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
     * <p>
     * Input/Output
     * <p>
     * [execution time limit] 3 seconds (java)
     * <p>
     * [input] array.integer a
     * <p>
     * If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.
     * <p>
     * Guaranteed constraints:
     * 1 ≤ a.length ≤ 1000,
     * -1 ≤ a[i] ≤ 1000.
     * <p>
     * [output] array.integer
     * <p>
     * Sorted array a with all the trees untouched.
     */

    int[] solution(int[] a) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> son = new ArrayList<>(a.length);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                list1.add(a[i]);
            } else if (a[i] == -1) {
                list2.add(i);
            }
        }

        int[] arr = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            arr[i] = list1.get(i);
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            son.add(arr[i]);
        }

        for (int i = 0; i < list2.size(); i++) {
            son.add(list2.get(i), -1);
        }

        Integer[] resultArray = son.toArray(new Integer[son.size()]);
        int[] resultArrayReturn = new int[resultArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArrayReturn[i] = resultArray[i].intValue();
        }

        return resultArrayReturn;
    }
}
