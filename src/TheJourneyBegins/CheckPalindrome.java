package TheJourneyBegins;

import java.util.Scanner;

public class CheckPalindrome {
    //Given the string, check if it is a palindrome.
    //
    //Example
    //
    //For inputString = "aabaa", the output should be
    //solution(inputString) = true;
    //For inputString = "abac", the output should be
    //solution(inputString) = false;
    //For inputString = "a", the output should be
    //solution(inputString) = true.
    //Input/Output
    //
    //[execution time limit] 3 seconds (java)
    //
    //[input] string inputString
    //
    //A non-empty string consisting of lowercase characters.
    //
    //Guaranteed constraints:
    //1 ≤ inputString.length ≤ 105.
    //
    //[output] boolean
    //
    //true if inputString is a palindrome, false otherwise.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String inputString=scan.next();
        System.out.println(solution(inputString));

    }
    static boolean solution(String inputString) {

        String ters="";
        for(int i=inputString.length()-1; i>=0; i--){
            ters+=inputString.charAt(i);
        }

        if(inputString.equals(ters)){
            return true;
        }else{
            return false;
        }
    }
}
