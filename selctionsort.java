import java.util.Arrays;

public class selctionsort {
    static int indexmax(int arr[], int start, int end) {
        int max = start;

        for (int i = start ; i < end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void sorting(int arr[]) {
        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = indexmax(arr, 0, i + 1);

            // Swap the maximum element with the last unsorted element
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {89, -5, 3, 8,-5,6,9,2};
        sorting(arr);
        System.out.println("The elements of the sorted array are " + Arrays.toString(arr));
    }
}
