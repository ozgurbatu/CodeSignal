package IslandOfKnowledge;

public class Minesweeper {
    /**
     In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.

     Example

     For

     matrix = [[true, false, false],
     [false, true, false],
     [false, false, false]]
     the output should be

     solution(matrix) = [[1, 2, 1],
     [2, 1, 1],
     [1, 1, 1]]
     Check out the image below for better understanding:



     Input/Output

     [execution time limit] 3 seconds (java)

     [input] array.array.boolean matrix

     A non-empty rectangular matrix consisting of boolean values - true if the corresponding cell contains a mine,
     false otherwise.

     Guaranteed constraints:
     2 ≤ matrix.length ≤ 100,
     2 ≤ matrix[0].length ≤ 100.

     [output] array.array.integer

     Rectangular matrix of the same size as matrix each cell of which contains an integer equal to the number of mines
     in the neighboring cells.
     wo cells are called neighboring if they share at least one corner.

     */
    int[][] solution(boolean[][] matrix) {
        int[][] sonuc = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int sum = 0;

                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {

                        if (x > -1 && y > -1 && x < matrix.length && y < matrix[0].length) {
                            if (matrix[x][y] == true) {
                                sum += 1;
                            }
                        }
                    }
                }

                if (matrix[i][j] == true) {
                    sonuc[i][j] = sum - 1;
                } else {
                    sonuc[i][j] = sum;
                }
            }

        }
        return sonuc;
    }

}
