// this is for sorting and only applicable for the sorted array but not in sorted manner when we have given element in the form of the 1 to n compariston as such

import java.util.Arrays;

public class cyclesort {
       static void swap(int arr[] , int start , int end) {
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int arr[]={3,4,1,2,6,5,9,8,7};
        int i=0;
        while (i<arr.length) {
            int correct =arr[i]-1;
            if (arr[i]!=arr[correct]) {
                swap(arr , i , correct);
            }
            else{
                i++;
            }

            
        }
        System.out.println("the elements of the sorted arrays are " + Arrays.toString(arr));
    }
}

