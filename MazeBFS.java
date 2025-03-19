import java.util.*;

public class MazeBFS {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length, cols = maze[0].length;

        // Queue for BFS: stores [row, col, steps]
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1], 0});

        
        maze[entrance[0]][entrance[1]] = '+';

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0], col = current[1], steps = current[2];

            // Move Up
            if (row > 0 && maze[row - 1][col] == '.') {
                if (row - 1 == 0 || col == 0 || col == cols - 1 || row - 1 == rows - 1) return steps + 1;
                maze[row - 1][col] = '+';
                queue.offer(new int[]{row - 1, col, steps + 1});    
            }

            // Move Down
            if (row < rows - 1 && maze[row + 1][col] == '.') {
                if (row + 1 == rows - 1 || col == 0 || col == cols - 1 || row + 1 == 0) return steps + 1;
                maze[row + 1][col] = '+';
                queue.offer(new int[]{row + 1, col, steps + 1});
            }

            // Move Left
            if (col > 0 && maze[row][col - 1] == '.') {
                if (col - 1 == 0 || row == 0 || row == rows - 1 || col - 1 == cols - 1) return steps + 1;
                maze[row][col - 1] = '+';
                queue.offer(new int[]{row, col - 1, steps + 1});
            }

            // Move Right
            if (col < cols - 1 && maze[row][col + 1] == '.') {
                if (col + 1 == cols - 1 || row == 0 || row == rows - 1 || col + 1 == 0) return steps + 1;
                maze[row][col + 1] = '+';
                queue.offer(new int[]{row, col + 1, steps + 1});
            }
        }

        // If no exit is reachable
        return -1;
    }

    public static void main(String[] args) {
        MazeBFS solution = new MazeBFS();
        char[][] maze = {
            {'+', '+', '.', '+'},
            {'.', '.', '.', '+'},
            {'+', '+', '+', '.'}
        };
        int[] entrance = {1, 0};

        int result = solution.nearestExit(maze, entrance);
        System.out.println("Nearest Exit Steps: " + result);  // Output: 2
    }
}
