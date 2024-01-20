package recursion;

public class peri {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Find the first land cell to start the recursion
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    // Start recursion from the first land cell
                    return calculatePerimeter(grid, i, j);
                }
            }
        }

        return 0;  // No land cell found
    }

    private int calculatePerimeter(int[][] grid, int i, int j) {
        // Base cases for recursion
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 1;  // Return 1 for water cells and cells outside the grid
        }

        // Mark the cell as visited
        grid[i][j] = -1;

        int perimeter = 0;

        // Recur in all four directions
        perimeter += calculatePerimeter(grid, i + 1, j);
        perimeter += calculatePerimeter(grid, i - 1, j);
        perimeter += calculatePerimeter(grid, i, j + 1);
        perimeter += calculatePerimeter(grid, i, j - 1);

        return perimeter;
    }

    public static void main(String[] args) {
        peri solution = new peri();

        int[][] grid1 = {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };
        System.out.println(solution.islandPerimeter(grid1));  // Output: 16

        int[][] grid2 = {{1}};
        System.out.println(solution.islandPerimeter(grid2));  // Output: 4

        int[][] grid3 = {{1, 0}};
        System.out.println(solution.islandPerimeter(grid3));  // Output: 4
    }
}

