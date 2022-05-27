package SmoothSailing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllLongestStrings {
    //Given an array of strings, return another array containing all of its longest strings.
    //
    //Example
    //
    //For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
    //solution(inputArray) = ["aba", "vcd", "aba"].
    //
    //Input/Output
    //
    //[execution time limit] 3 seconds (java)
    //
    //[input] array.string inputArray
    //
    //A non-empty array.
    //
    //Guaranteed constraints:
    //1 ≤ inputArray.length ≤ 10,
    //1 ≤ inputArray[i].length ≤ 10.
    //
    //[output] array.string
    //
    //Array of the longest strings, stored in the same order as in the inputArray.

    String[] solution(String[] inputArray) {
        int arr[] = new int[inputArray.length];
        List<String> list = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = inputArray[i].length();
        }

        Arrays.sort(arr);

        int max= arr[arr.length - 1];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() == max) {
                list.add(inputArray[i]);
            }
        }

        String[] actual = list.toArray(new String[list.size()]);

        return actual;

    }
}
