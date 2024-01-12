package recursion;

import java.util.Arrays;

public class insersionsort {

    public static void main(String[] args) {
        int arr[]={ 6,5,3,1,8,7,2,4};
        for(int i =1 ; i< arr.length ; i++){
            int a = arr[i];

            for(int j = i -1 ; j>=0; j-- ){
              
               
                    if(arr[i] < arr[j]){
                        arr[j]=a;
                        a=arr[i-1];
                    }
              
               
                // else{
                //     break;
                // }
               
                

            }
            //  a=arr[i-1];
           

        }
        System.out.println("the sorted array after inserstion sort is " + Arrays.toString(arr));


        
    }
}
