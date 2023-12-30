import java.util.Arrays;

public class reversearray {

    public static void reverse(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n/2; i++) {
            // Swap elements at index i and corresponding index from the end
            int temp = arr[i];
            arr[i] = arr[n -i-1];
            arr[n -i-1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        reverse(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}

