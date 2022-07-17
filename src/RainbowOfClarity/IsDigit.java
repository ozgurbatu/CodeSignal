package RainbowOfClarity;

public class IsDigit {
    /**
     Determine if the given character is a digit or not.

     Example

     For symbol = '0', the output should be
     solution(symbol) = true;
     For symbol = '-', the output should be
     solution(symbol) = false.
     Input/Output

     [execution time limit] 3 seconds (java)

     [input] char symbol

     A character which is either a digit or not.

     Guaranteed constraints:
     Given symbol is from ASCII table.

     [output] boolean

     true if symbol is a digit, false otherwise.
     */
    boolean isDigit(char symbol) {
        return ((symbol<='9')&&(symbol>='0'))? true: false;
    }
}
