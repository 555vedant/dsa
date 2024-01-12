// import java.util.Arrays;

// public class insersionsortnew {
//     static int[] insersion(int arr[], int size) {
//         for (int i = 1; i < size; i++) {
//                  int a = arr[i];
    
           
//             for (int j = i - 1; j >= 0; j--) {
//                 if (arr[i] < arr[j]) {
//                     // int temp = arr[j];
//                     arr[j+1] = arr[j];

                    
//                      // Update the index to check against previous elements
//                 } else {
//                     break;
//                 }
               
//                     arr[j+1]=a;

               
              
//             }
//         }
//         return arr;
//     }

//     public static void main(String[] args) {
//         int arr[] = {6, 5, 3, 1, 8, 7, 2, 4};
//         int ans[] = insersion(arr, arr.length);
//         System.out.println("The ans of sorting is " + Arrays.toString(ans));
//     }
// }
import java.util.Arrays;

public class insersionsortnew {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2};

        System.out.println("Original array: " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

