package DarkWilderness;

public class LogestDigitsPrefix {
    /**
     Given a string, output its longest prefix which contains only digits.

     Example

     For inputString = "123aa1", the output should be
     solution(inputString) = "123".

     Input/Output

     [execution time limit] 3 seconds (java)

     [input] string inputString

     Guaranteed constraints:
     3 ≤ inputString.length ≤ 100.

     [output] string
     */
    String solution(String inputString){
        return inputString.replaceAll("[^0-9]+.*","");
    }
}
