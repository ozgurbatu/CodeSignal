package EruptionOfLight;

public class BuildPalindrome {
    /**
     Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.

     Example

     For st = "abcdc", the output should be
     solution(st) = "abcdcba".

     Input/Output

     [execution time limit] 3 seconds (java)

     [input] string st

     A string consisting of lowercase English letters.

     Guaranteed constraints:
     3 ≤ st.length ≤ 10.

     [output] string
     */
    String solution(String st) {
        String str=new StringBuffer(st).reverse().toString();
        for(int i=0;i<st.length();i++) {
            if((st.substring(0,i)+str).equals(new StringBuffer(st.substring(0,i)+str).reverse().toString()))
            {
                return (st.substring(0,i)+str);
            }
        }
        return "a";
    }
}
