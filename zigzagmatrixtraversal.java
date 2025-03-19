

import java.util.*;

class zigzagmatrixtraversal {
    public static void traverseMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[][] visited = new boolean[rows][cols];

        int row = 0, col = 0;
        boolean movingRight = true, movingDown = false, movingLeft = false, movingUp = false;

        while (true) {
            if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col]) {
                break;
            }

            
            System.out.print(matrix[row][col] + " ");
            visited[row][col] = true;

            if (movingRight) {
                if (col + 1 < cols && !visited[row][col + 1]) {
                    col++;
                } else {
                    movingRight = false;
                    movingDown = true;
                    row++;
                }
            } else if (movingDown) {
                if (row + 1 < rows && !visited[row + 1][col]) {
                    row++;
                } else {
                    movingDown = false;
                    movingLeft = true;
                    col--;
                }
            } else if (movingLeft) {
                if (col - 1 >= 0 && !visited[row][col - 1]) {
                    col--;
                } else {
                    movingLeft = false;
                    movingUp = true;
                    row--;
                }
            } else if (movingUp) {
                if (row - 1 >= 0 && !visited[row - 1][col]) {
                    row--;
                } else {
                    movingUp = false;
                    movingRight = true;
                    col++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        traverseMatrix(matrix);
    }
}
