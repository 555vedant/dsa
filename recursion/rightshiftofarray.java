package recursion;

import java.util.Arrays;

/**
 * rightshiftofarray
 */
public class rightshiftofarray {
    static int[] right(int arr[], int target) {
        int r = target % arr.length;

        for (int i = 0; i < r; i++) {
            int lastElement = arr[arr.length - 1];

            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = lastElement;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 1;
        int ans[] = right(arr, target);
        System.out.println("the array after right shift is " + Arrays.toString(ans));
    }
}
