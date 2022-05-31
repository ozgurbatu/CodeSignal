package IslandOfKnowledge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMaximalAdjacentDifference {
    /**
     Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

     Example

     For inputArray = [2, 4, 1, 0], the output should be
     solution(inputArray) = 3.

     Input/Output

     [execution time limit] 3 seconds (java)

     [input] array.integer inputArray

     Guaranteed constraints:
     3 ≤ inputArray.length ≤ 10,
     -15 ≤ inputArray[i] ≤ 15.

     [output] integer

     The maximal absolute difference
     */

    int solution(int[] inputArray) {
        int[] arr = new int[inputArray.length-1];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < inputArray.length-1; i++) {
            int minus = Math.abs(inputArray[i] - inputArray[i+1]);
            list.add(minus);
        }

        for(int i = 0; i< arr.length; i++) {
            arr[i] = list.get(i);
        }

        Arrays.sort(arr);

        int result = arr[arr.length-1];

        return result;
    }
}
