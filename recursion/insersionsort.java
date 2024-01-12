package recursion;

import java.util.Arrays;

public class insersionsort {

    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 1, 8, 7, 2, 4};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("The sorted array after insertion sort is " + Arrays.toString(arr));
    }
}
