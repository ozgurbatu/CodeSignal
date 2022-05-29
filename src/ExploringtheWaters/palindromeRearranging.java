package ExploringtheWaters;

public class palindromeRearranging {
    /**
     * Given a string, find out if its characters can be rearranged to form a palindrome.
     * <p>
     * Example
     * <p>
     * For inputString = "aabb", the output should be
     * solution(inputString) = true.
     * <p>
     * We can rearrange "aabb" to make "abba", which is a palindrome.
     * <p>
     * Input/Output
     * <p>
     * [execution time limit] 3 seconds (java)
     * <p>
     * [input] string inputString
     * <p>
     * A string consisting of lowercase English letters.
     * <p>
     * Guaranteed constraints:
     * 1 ≤ inputString.length ≤ 50.
     * <p>
     * [output] boolean
     * <p>
     * true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
     */

    boolean solution(String inputString) {

        int arr[] = new int[25];

        for (int i = 0; i < inputString.length(); i++) {
            arr[inputString.charAt(i) - 'a']++;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                cnt++;
            }
        }
        return cnt <= 1;

    }

}
