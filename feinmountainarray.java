// //finding element into the mountain array
// public class feinmountainarray {
//     public static int peak(int arr[]){
        
//         int left=0;
//         int right =arr.length-1;
//         while (left<right) {
//             int mid =left +(right-left)/2;
//             if (arr[mid] > arr[mid+1]) {
//                 right =mid;
                
//             }
//             else{
//                 left =mid+1;
//             }
            
//         }
//         return right;

//     }
//     public static int finding(int arr[] , int target){
//         int partialans=peak(arr);
//         int start =0;
//         int semi =partialans;
//         int end = arr.length-1;
//         while (true){
//              while (start <= semi) {
//             int mid =start+(semi -start)/2;
//             if (target ==mid ) {
//                 mid =target;
                
//             }
//             else if (target <mid) {
//                 semi =mid-1;
                
//             }
//             else if (target > mid) {
//                 start =mid+1;
                
//             }
            
//         }
//          while (semi <= end) {
//             int mid =semi+(end -semi)/2;
//             if (target ==mid ) {
//                 mid =target;
                
//             }
//             else if (target <mid) {
//                 end =mid-1;
                
//             }
//             else if (target > mid) {
//                 semi =mid+1;
                
//             }
//             return mid;
            
//         }
            
//         }
       
        

        
        


//     }

//     public static void main(String[] args) {
//         int arr[]={1,5,6,4,2,};
//         int fans=finding(arr, 6);
//         System.out.println("the final anser of the given question is " + fans);
       
        
//     }
// }
public class feinmountainarray {

    public static int peak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int binarySearch(int[] arr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                if (ascending) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (ascending) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int finding(int[] arr, int target) {
        int peakIndex = peak(arr);

        // Search in the left (ascending) part of the mountain
        int leftResult = binarySearch(arr, target, 0, peakIndex, true);
        if (leftResult != -1) {
            return leftResult;
        }

        // Search in the right (descending) part of the mountain
        int rightResult = binarySearch(arr, target, peakIndex + 1, arr.length - 1, false);
        return rightResult;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 4, 2};
        int result = finding(arr, 2);
        System.out.println("The final answer of the given question is " + result);
    }
}
