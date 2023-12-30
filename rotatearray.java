// import java.util.Arrays;
// import java.util.Scanner;

// /**
//  * rotatearray
//  */
// public class rotatearray {
//     public static void shiftarray( int arr[] , int target ,boolean isrightshift){
//          int a =target % arr.length-1;
       
//         for(int i =1 ; i<=a; i++){
//             if (isrightshift) {
//                   int temp =arr[arr.length-1];
//             arr[i+1] =arr[i];
//             arr[i]=temp;
                
//             }
//             //left shift
          
//             else{
//                   int temp =arr[i];
//             arr[i]=arr[arr.length-1];
//             arr[arr.length-1]=temp; 
//             }

           

//         }
            
       

       

//     }

//     public static void main(String[] args) {
//          Scanner sc =new Scanner(System.in);
//         //target mice how much times you wanted to rotate the given array 
//         int target=sc.nextInt();
//         int arr[]={1,2,3,4};
//         shiftarray(arr, target, false);
//         System.out.println("rotated array is" + Arrays.toString(arr));
//         sc.close();

        
//     }
// }


//modified code

import java.util.Arrays;
import java.util.Scanner;

public class rotatearray {
    public static void shiftarray(int arr[], int target, boolean isRightShift) {
        int n = arr.length;
        int a = target % n;

        for (int k = 0; k < a; k++) {
            if (isRightShift) {
                int temp = arr[n - 1];
                for (int i = n - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = temp;
            } else {
                int temp = arr[0];
                for (int i = 0; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[n - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int arr[] = {1, 2, 3, 4};
        shiftarray(arr, target, false);
        System.out.println("Rotated array is " + Arrays.toString(arr));
        sc.close();
    }
}
