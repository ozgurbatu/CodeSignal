package SmoothSailing;

public class CommonCharacterCount {
    /**
     Given two strings, find the number of common characters between them.

     Example

     For s1 = "aabcc" and s2 = "adcaa", the output should be
     solution(s1, s2) = 3.

     Strings have 3 common characters - 2 "a"s and 1 "c".

     Input/Output

     [execution time limit] 3 seconds (java)

     [input] string s1

     A string consisting of lowercase English letters.

     Guaranteed constraints:
     1 ≤ s1.length < 15.

     [input] string s2

     A string consisting of lowercase English letters.

     Guaranteed constraints:
     1 ≤ s2.length < 15.

     [output] integer
     */
    int commonCharacterCount(String s1, String s2) {
        int count = 0;

        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();

        for (int i = 0; i < s1Char.length; i++) {
            for (int j = 0; j < s2Char.length; j++) {
                if (s1Char[i] == s2Char[j]) {
                    count++;
                    s1Char[i] = ' ';
                    s2Char[j] = ' ';
                    break;
                }
            }
        }
        return count;
    }
}

