package RainbowOfClarity;

import java.util.ArrayList;
import java.util.List;

public class DeleteDigit {
    /**
     Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

     Example

     For n = 152, the output should be
     solution(n) = 52;
     For n = 1001, the output should be
     solution(n) = 101.
     Input/Output

     [execution time limit] 3 seconds (java)

     [input] integer n

     Guaranteed constraints:
     10 ≤ n ≤ 106.

     [output] integer
     */
    int solution(int n) {
        int divider = 1, counter = 0, maxNumber = 0;
        List<Integer> numbers = new ArrayList<>();
        while(divider<=n) {
            numbers.add(n/divider%10);
            divider*=10; counter++;
        }
        for(int i=0; i<counter; i++) {
            int tempNumber = 0, tempDivider = 1;
            for(int j=0; j<counter; j++)
                if(j!=i) {tempNumber+=numbers.get(j)*tempDivider; tempDivider*=10;}
            if(tempNumber>maxNumber) maxNumber = tempNumber;
        }
        return maxNumber;
    }
}
