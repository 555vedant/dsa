import java.util.Arrays;

class exchangeSort {
    static void eSort(int arr[], int size) {
        int b = 0;

        if (size == 1) {
            System.out.println("ans is" + Arrays.toString(arr));
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    // Swap elements if they are in the wrong order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int j = 0; j < size - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                b = j;
            }
        }

        // Note: The indices in the copyOfRange method are exclusive
        int startIndex = 0;
        int endIndex = b + 1;
        arr = Arrays.copyOfRange(arr, startIndex, endIndex);
        size = arr.length;
        eSort(arr, size);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 2, 8 };
        int size = arr.length;
        eSort(arr, size);
    }
}
