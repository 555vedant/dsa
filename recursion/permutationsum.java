package recursion;

import java.util.ArrayList;
import java.util.List;

public class permutationsum {

    static List<List<Integer>> permu(List<Integer> currentList, int[] arr, int target, int currentIndex, int currentSum) {
        List<List<Integer>> result = new ArrayList<>();

        if (currentSum == target) {
            result.add(new ArrayList<>(currentList));
            return result;
        }

        for (int i = currentIndex; i < arr.length; i++) {
            if (arr[i] <= target) {
                currentList.add(arr[i]);
                result.addAll(permu(currentList, arr, target, i + 1, currentSum + arr[i]));
                currentList.remove(currentList.size()-1); // Backtrack
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        List<Integer> currentList = new ArrayList<>();
        int target = 4;

        List<List<Integer>> resultList = permu(currentList, arr, target, 0, 0);

        for (List<Integer> combination : resultList) {
            System.out.println(combination);
        }
    }
}
