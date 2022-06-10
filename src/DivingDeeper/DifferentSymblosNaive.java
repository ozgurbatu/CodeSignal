package DivingDeeper;

import java.util.HashSet;
import java.util.Set;

public class DifferentSymblosNaive {
    /**
     Given a string, find the number of different characters in it.

     Example

     For s = "cabca", the output should be
     solution(s) = 3.

     There are 3 different characters a, b and c.

     Input/Output

     [execution time limit] 3 seconds (java)

     [input] string s

     A string of lowercase English letters.

     Guaranteed constraints:
     3 ≤ s.length ≤ 1000.

     [output] integer
     */

    int solution(String s) {
        Set<String> set=new HashSet<>();
        int length=s.split("").length;
        for (int i = 0; i <length ; i++) {
            set.add(String.valueOf(s.charAt(i)));
        }
        return set.size();
    }

}
