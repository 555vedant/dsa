public class BacktrackingVisualization {
    public static void traverseMatrix(int[][] matrix, boolean[][] visited, int i, int j) {
        // Base case: Check if out of bounds or already visited
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || visited[i][j]) {
            return;
        }

        // Mark the current cell as visited
        visited[i][j] = true;

        // Print the current cell (to visualize traversal)
        System.out.println("Visiting cell (" + i + ", " + j + ") with value: " + matrix[i][j]);

        // Direction arrays for moving up, down, left, right
        int[] dirX = {-1, 1, 0, 0};
        int[] dirY = {0, 0, -1, 1};

        // Explore all neighbors
        for (int d = 0; d < 4; d++) {
            traverseMatrix(matrix, visited, i + dirX[d], j + dirY[d]);
        }

        // Backtrack: Unmark the cell
        System.out.println("Backtracking from cell (" + i + ", " + j + ")");
        visited[i][j] = false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int m = matrix.length;
        int n = matrix[0].length;

        // To keep track of visited cells
        boolean[][] visited = new boolean[m][n];

        // Start traversal from the top-left corner (0, 0)
        traverseMatrix(matrix, visited, 0, 0);
    }
}
