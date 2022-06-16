package DarkWilderness;

public class DigitDegree {
    /**
     * Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.
     * <p>
     * Given an integer, find its digit degree.
     * <p>
     * Example
     * <p>
     * For n = 5, the output should be
     * solution(n) = 0;
     * For n = 100, the output should be
     * solution(n) = 1.
     * 1 + 0 + 0 = 1.
     * For n = 91, the output should be
     * solution(n) = 2.
     * 9 + 1 = 10 -> 1 + 0 = 1.
     * Input/Output
     * <p>
     * [execution time limit] 3 seconds (java)
     * <p>
     * [input] integer n
     * <p>
     * Guaranteed constraints:
     * 5 ≤ n ≤ 109.
     * <p>
     * [output] integer
     */
    int solution(int n) {
        int count = 0;
        while (n >= 10) {
            count++;
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return count;
    }
}

