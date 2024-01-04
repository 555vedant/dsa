// package recursion;

// import java.util.Arrays;

// /**
//  * quicksort
//  */
// public class quicksort {
//     static void qsort(int arr[] , int start , int end ){
//         if (start >= end) {
//             return;
//         }
//         int initial=start;
//         int last= end;
//         int mid = initial+(last-initial)/2;
//         int pivot = arr[mid];
//         while (start <= end) {
//             while (initial<pivot) {
//                 initial++;

//             }
//             while (last>pivot) {
//                 last--;
//             }

//             if (start > end) {
//                 int temp =arr[initial];
//                 arr[initial]=arr[last];
//                 arr[last]=temp;
//                 initial++;
//                 last--;

                
//             }
//         }
//         qsort(arr, start,last);
//         qsort(arr, initial, end);






//     }

//     public static void main(String[] args) {
//         int arr[]={5,4,3,2,1};
//         int length=arr.length-1;
//         qsort(arr, 0,length);
//         System.out.println("the sorted array is "+ Arrays.toString(arr));
        
//     }
// }
package recursion;

import java.util.Arrays;

/**
 * quicksort
 */
public class quicksort {
    static void qsort(int arr[] , int start , int end ){
        if (start >= end) {
            return;
        }
        int initial=start;
        int last= end;
        int mid = initial+(last-initial)/2;
        int pivot = arr[mid];
        while (initial <= last) {
            while (arr[initial]<pivot) {
                initial++;

            }
            while (arr[last]>pivot) {
                last--;
            }

            if (initial <=last) {
                int temp =arr[initial];
                arr[initial]=arr[last];
                arr[last]=temp;
                initial++;
                last--;

                
            }
        }
        //you will get array like after completion of the while loop -> { 2,1,3,4,5,8,12} and after below recursion call you will get sorted array
        
        qsort(arr, start,last);
        qsort(arr, initial, end);

    }

    public static void main(String[] args) {
        int arr[]={8,5,4,3,1,2,12};
        int length=arr.length-1;
        qsort(arr, 0,length);
        System.out.println("the sorted array is "+ Arrays.toString(arr));
        
    }
}
