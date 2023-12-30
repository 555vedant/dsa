// this ceil and floar are the application of the binary Search 

import java.util.Scanner;


public class ceilandfloar {
    public static void choice(String choice ,int arr[]){
           
          
       
        
        
        switch (choice) {
            case "ceil":
            
             
                // return ceil(null);
                int c=ceil(arr);
                System.out.println("the value of ceil fuction is" + arr[c]);
                 
                break;
        
            default:
            
                // return ceil(null);
                int d=floar(arr);
                System.out.println("the value of ceil fuction is" + arr[d]);
                break;
        }
        
    }
     public static int ceil(int arr[]){
    Scanner sc =new Scanner(System.in);
        // input number wherer we have to find ceil and floar of that fuction
        int target =sc.nextInt();
     int size =8;
    int left =0;
        int right =size-1;
       boolean assending=arr[left]<arr[right];
    while (target>0) {
        
            int mid = left + (right - left) / 2;
            if (assending) {
                     if (arr[mid] == target) {
                return mid+1; // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } 
            else {
                right = mid - 1; // Search in the left half
            }
                
            }
            else{
                     if (arr[mid] == target) {
                return mid-1; // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid - 1; // Search in the right half
            } 
            else {
                right = mid + 1; // Search in the left half
            }
            }

       
        }
        return right;

}
 public static int floar(int arr[]){
    Scanner sc =new Scanner(System.in);
        // input number wherer we have to find ceil and floar of that fuction
        int target =sc.nextInt();
     int size =8;
    int left =0;
        int right =size-1;
       boolean assending=arr[left]<arr[right];
    while (left<= right) {
        
            int mid = left + (right - left) / 2;
            if (assending) {
                     if (arr[mid] == target) {
                return mid+1; // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } 
            else {
                right = mid - 1; // Search in the left half
            }
                
            }
            else{
                     if (arr[mid] == target) {
                return mid-1; // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid - 1; // Search in the right half
            } 
            else {
                right = mid + 1; // Search in the left half
            }
            }

       
        }
        return right;

}

    public static void main(String[] args) {
        // i am just assuming this fuctions for the sorted array not any randomised array
        int arr[]={ 1,2,3,4,8,9,12};
        int size =8;
        Scanner sc =new Scanner(System.in);
        floar(arr);
        ceil(arr);
        choice("ceil" ,arr);

       
        
        

        

        
    }
}

