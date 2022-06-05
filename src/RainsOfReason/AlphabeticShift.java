package RainsOfReason;

public class AlphabeticShift {
    /**
     Given a string, your task is to replace each of its characters by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).

     Example

     For inputString = "crazy", the output should be solution(inputString) = "dsbaz".

     Input/Output

     [execution time limit] 3 seconds (java)

     [input] string inputString

     A non-empty string consisting of lowercase English characters.

     Guaranteed constraints:
     1 ≤ inputString.length ≤ 1000.

     [output] string

     The resulting string after replacing each of its characters.
     */
    public static void main(String[] args) {
        System.out.println(solution("crazy"));
    }

    static String solution(String inputString) {
        String arr[]=inputString.split("");
        String str="";
        for(int i=0; i< arr.length; i++){
            if (arr[i].equalsIgnoreCase("z")) {
                arr[i]="a";
                str+=arr[i];
            }else {
                int x = Integer.valueOf(arr[i].charAt(0)) + 1;
                str += (char) x;
            }
        }

        return str;
    }
}
