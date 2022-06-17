package EruptionOfLight;

public class IsBeatifulString {
    /**
     * A string is said to be beautiful if each letter in the string appears at most as many times as the previous letter in the alphabet within the string; ie: b occurs no more times than a; c occurs no more times than b; etc. Note that letter a has no previous letter.
     * <p>
     * Given a string, check whether it is beautiful.
     * <p>
     * Example
     * <p>
     * For inputString = "bbbaacdafe", the output should be solution(inputString) = true.
     * <p>
     * This string contains 3 as, 3 bs, 1 c, 1 d, 1 e, and 1 f (and 0 of every other letter), so since there aren't any letters that appear more frequently than the previous letter, this string qualifies as beautiful.
     * <p>
     * For inputString = "aabbb", the output should be solution(inputString) = false.
     * <p>
     * Since there are more bs than as, this string is not beautiful.
     * <p>
     * For inputString = "bbc", the output should be solution(inputString) = false.
     * <p>
     * Although there are more bs than cs, this string is not beautiful because there are no as, so therefore there are more bs than as.
     * <p>
     * Input/Output
     * <p>
     * [execution time limit] 3 seconds (java)
     * <p>
     * [input] string inputString
     * <p>
     * A string of lowercase English letters.
     * <p>
     * Guaranteed constraints:
     * 3 ≤ inputString.length ≤ 50.
     * <p>
     * [output] boolean
     * <p>
     * Return true if the string is beautiful, false otherwise.
     */
    boolean solution(String inputString) {
        int arr[] = new int[26];
        int k = 0;
        int count = 0;
        for (char y = 'a'; y <= 'z'; y++) {
            count = 0;
            for (int i = 0; i < inputString.length(); i++) {
                if (y == inputString.charAt(i)) {
                    count++;
                }
            }
            arr[k++] = count;
        }
        for (int i = 1; i < 26; i++) {
            if (arr[i - 1] < arr[i]) {
                return false;
            }
        }
        return true;
    }
}
