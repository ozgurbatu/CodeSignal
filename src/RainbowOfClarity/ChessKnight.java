package RainbowOfClarity;

public class ChessKnight {
    /**
     * Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.
     * <p>
     * The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.
     * <p>
     * <p>
     * <p>
     * Example
     * <p>
     * For cell = "a1", the output should be
     * solution(cell) = 2.
     * <p>
     * <p>
     * <p>
     * For cell = "c2", the output should be
     * solution(cell) = 6.
     * <p>
     * <p>
     * <p>
     * Input/Output
     * <p>
     * [execution time limit] 3 seconds (java)
     * <p>
     * [input] string cell
     * <p>
     * String consisting of 2 letters - coordinates of the knight on an 8 × 8 chessboard in chess notation.
     * <p>
     * Guaranteed constraints:
     * cell.length = 2,
     * 'a' ≤ cell[0] ≤ 'h',
     * 1 ≤ cell[1] ≤ 8.
     * <p>
     * [output] integer
     */

    int solution(String cell) {
        int i = getX(cell), cols = 8;
        int j = getY(cell), rows = 8;
        int counter = 0;

        // top-right
        if ((i < cols - 1) && (j > 1)) {
            counter++;
        }
        if ((i < cols - 2) && (j > 0)) {
            counter++;
        }

        // top-left
        if ((i > 0) && (j > 1)) {
            counter++;
        }
        if ((i > 1) && (j > 0)) {
            counter++;
        }

        // bottom-right
        if ((i < cols - 1) && (j < rows - 2)) {
            counter++;
        }
        if ((i < cols - 2) && (j < rows - 1)) {
            counter++;
        }

        // bottom-left
        if ((i > 0) && (j < rows - 2)) {
            counter++;
        }
        if ((i > 1) && (j < rows - 1)) {
            counter++;
        }

        return counter;
    }

    int getX(String pos) {
        return (int) pos.charAt(0) - 97;
    }

    int getY(String pos) {
        return (int) pos.charAt(1) - 49;
    }
}
