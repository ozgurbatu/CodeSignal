package LandOfLogic;

import java.util.ArrayList;
import java.util.List;

public class DifferentSquares {
    /**
     Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.

     Example

     For

     matrix = [[1, 2, 1],
     [2, 2, 2],
     [2, 2, 2],
     [1, 2, 3],
     [2, 2, 1]]
     the output should be
     solution(matrix) = 6.

     Here are all 6 different 2 × 2 squares:

     1 2
     2 2
     2 1
     2 2
     2 2
     2 2
     2 2
     1 2
     2 2
     2 3
     2 3
     2 1
     Input/Output

     [execution time limit] 3 seconds (java)

     [input] array.array.integer matrix

     Guaranteed constraints:
     1 ≤ matrix.length ≤ 100,
     1 ≤ matrix[i].length ≤ 100,
     0 ≤ matrix[i][j] ≤ 9.

     [output] integer

     The number of different 2 × 2 squares in matrix.
     */
    int solution(int[][] matrix) {
        int counter = 0;
        List<String> squares = new ArrayList<>();
        for(int i=0; i<matrix.length-1; i++) {
            for(int j=0; j<matrix[0].length-1; j++) {
                String square = getSquare(matrix[i][j], matrix[i][j+1], matrix[i+1][j], matrix[i+1][j+1]);
                if(isSquareDifferent(squares, square)==true)
                    counter++;
                squares.add(square);
            }
        }
        return counter;
    }

    String getSquare(int a, int b, int c, int d) {
        return Integer.toString(a) + Integer.toString(b) + Integer.toString(c) +Integer.toString(d);
    }

    boolean isSquareDifferent(List<String> squares, String square) {
        for(int i=0; i<squares.size(); i++)
            if(square.equals(squares.get(i)))
                return false;
        return true;
    }
}
