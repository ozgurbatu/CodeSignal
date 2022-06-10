package DivingDeeper;

public class FirstDigit {
    /**
     Find the leftmost digit that occurs in a given string.

     Example

     For inputString = "var_1__Int", the output should be
     solution(inputString) = '1';
     For inputString = "q2q-q", the output should be
     solution(inputString) = '2';
     For inputString = "0ss", the output should be
     solution(inputString) = '0'.
     Input/Output

     [execution time limit] 3 seconds (java)

     [input] string inputString

     A string containing at least one digit.

     Guaranteed constraints:
     3 ≤ inputString.length ≤ 10.

     [output] char
     */
    char solution(String inputString) {
        char sonuc = 0;
        String[] arr=inputString.split("");
        for (int i = 0; i <arr.length ; i++) {
            if (Character.isDigit(arr[i].charAt(0))) {
                sonuc=arr[i].charAt(0);
                break;
            }
        }
        return sonuc;
    }
}
