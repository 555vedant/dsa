import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {

        int arr[]={3,2,5};
        int arr1[]={6,3,8};
        int maxsize=arr.length;
        if (arr1.length>maxsize ) {
            maxsize =arr1.length;
            
        }
        int newarry[]=new int[maxsize];
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i= 0 ; i<maxsize; i++){
            for(int j =0 ; j< maxsize ; j++){
                if (arr[i]>arr1[j]) {
                    newarry[i]=arr1[j];
                    
                }
                else{
                    newarry[i]=arr[j];
                }
            }
        }
        for(int k =0 ; k<maxsize; k++){
            System.out.println("the array is " + newarry[k]);
        }
    }
}
