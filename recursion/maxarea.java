package recursion;

public class maxarea {
    
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j) {
        int row = grid.length;
        int cols = grid[0].length;

        if (i < 0 || i >= row || j < 0 || j >= cols || grid[i][j] == 0) {
            return 0;
        }

        grid[i][j] = 0; // Mark as visited

        int area = 1;

        area += dfs(grid, i + 1, j); // Down
        area += dfs(grid, i - 1, j); // Up
        area += dfs(grid, i, j + 1); // Right
        area += dfs(grid, i, j - 1); // Left
       

        return area;
    }
}

    
}
