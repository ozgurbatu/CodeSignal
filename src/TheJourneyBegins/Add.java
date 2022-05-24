package TheJourneyBegins;

import java.util.Scanner;

public class Add {
    //Write a function that returns the sum of two numbers.
    //
    //Example For param1 = 1 and param2 = 2, the output should be
    //solution(param1, param2) = 3.
    //Input/Output
    //
    //[execution time limit] 3 seconds (java)
    //
    //[input] integer param1
    //
    //Guaranteed constraints:
    //-1000 ≤ param1 ≤ 1000.
    //
    //[input] integer param2
    //
    //Guaranteed constraints:
    //-1000 ≤ param2 ≤ 1000.
    //
    //[output] integer
    //
    //The sum of the two inputs.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int param1=scan.nextInt();
        int param2=scan.nextInt();
        System.out.println(solution(param1,param2));
    }
    static int solution(int param1, int param2) {

        return (param1+param2);
    }
}
