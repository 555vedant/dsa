// import java.util.Scanner;

// public class firstandlastindex {
//     public static int find( int arr[] , boolean firstelement ){
//         Scanner sc =new Scanner(System.in);
//         int target =sc.nextInt();
//         int left =0;
//         int right =arr.length -1;
        
//         while (target>0) {
//             int mid = left + (right - left) / 2;

//             if (arr[mid] == target) {
//                 int pa = mid;// Element found, return its index
//                 if (firstelement) {
//                     left =mid+1;
//                 }
//                 else{
//                     right =mid-1;
//                 }
//                 return pa;
//             } else if (arr[mid] < target) {
//                 left = mid + 1; // Search in the right half
//             } 
//             else {
//                 right = mid - 1; // Search in the left half
//             }
//         }
//         sc.close();
//         return -1;
       
        


//     }
//     public static void main(String[] args) {
//         // we have to find first occurace of 3 and also last occurance of 3
//         int arr[]={ 1,2,3,3,3,4};
//         find(arr, false);
        


//     }
// }

// gptfi

import java.util.Scanner;

public class firstandlastindex {
    public static int find(int arr[], boolean firstElement) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                int pa = mid; // Element found, return its index
                if (firstElement) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                sc.close(); // Close the Scanner here
                return pa;
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        
        sc.close(); // Close the Scanner in case the target is not found
        // Return -1 if the target is not found
        return -1;
    }

    public static void main(String[] args) {
        // We have to find the first occurrence of 3 and also the last occurrence of 3
        int arr[] = {1, 2, 3, 3, 3, 4};
        int firstOccurrence = find(arr, true);
        int lastOccurrence = find(arr, false);

        if (firstOccurrence != -1) {
            System.out.println("First occurrence of 3 is at index: " + firstOccurrence);
        } else {
            System.out.println("3 not found in the array.");
        }

        if (lastOccurrence != -1) {
            System.out.println("Last occurrence of 3 is at index: " + lastOccurrence);
        } else {
            System.out.println("3 not found in the array.");
        }
    }
}

