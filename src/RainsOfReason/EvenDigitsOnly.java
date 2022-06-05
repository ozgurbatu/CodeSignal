package RainsOfReason;

public class EvenDigitsOnly {
    /**
     Check if all digits of the given integer are even.

     Example

     For n = 248622, the output should be
     solution(n) = true;
     For n = 642386, the output should be
     solution(n) = false.
     Input/Output

     [execution time limit] 3 seconds (java)

     [input] integer n

     Guaranteed constraints:
     1 ≤ n ≤ 109.

     [output] boolean

     true if all digits of n are even, false otherwise.
     */
    boolean solution(int n) {
        boolean sonuc=false;
        String arr[]=String.valueOf(n).split("");
        for (int i = 0; i < arr.length ; i++) {
            if (Integer.parseInt(arr[i])%2==0) {
                sonuc=true;
            }else{
                sonuc=false;
                break;
            }
        }
      /*
      while (n>1){
            if (n%2==0) {
                sonuc=true;
                n/=10;
            }else{
                sonuc=false;
                break;
            }
        }
        */
        return sonuc;
    }

}
