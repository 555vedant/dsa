
import java.util.*;


public class binarysearch {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] myArray = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));

        System.out.println("Enter the number you want to find in the array:");
        int number = sc.nextInt();

        int result = binarySearch(myArray, number);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + result + " and the element is: " + myArray[result]);
        }

        sc.close();
    }

    // Binary Search method
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (target>0) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } 
            else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }
}
