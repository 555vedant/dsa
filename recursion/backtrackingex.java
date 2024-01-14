package recursion;

import java.util.ArrayList;
import java.util.List;

public class backtrackingex {

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int[] nums = {1, 2, 3};

        backtrack(result, current, nums, 0);

        System.out.println(result);
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums, int start) {
        // Add the current combination to the result
        result.add(new ArrayList<>(current));

        // Explore all possible options
        for (int i = start; i < nums.length; i++) {
            // Make a choice
            current.add(nums[i]);

            // Explore further
            backtrack(result, current, nums, i + 1);

            // Undo the choice (backtrack)
            current.remove(current.size() -1);
        }
    }
}
