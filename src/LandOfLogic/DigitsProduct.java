package LandOfLogic;

public class DigitsProduct {
    /**
     Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.

     Example

     For product = 12, the output should be
     solution(product) = 26;
     For product = 19, the output should be
     solution(product) = -1.
     Input/Output

     [execution time limit] 3 seconds (java)

     [input] integer product

     Guaranteed constraints:
     0 ≤ product ≤ 600.

     [output] integer
     */

    int solution(int product) {
        int result = 0;
        while(result<10000) {
            result++;
            if(product==getProduct(result))
                return result;
        }
        return -1;
    }

    int getProduct(int number) {
        int divider = 1, result = 1;
        while(divider<=number) {
            result*=number/divider%10;
            divider*=10;
        }
        return result;
    }

}
