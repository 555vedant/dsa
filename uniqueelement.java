import java.util.Arrays;

public class uniqueelement {
      static int ue(int arr[]){
        
        int i=0;
        while (i<arr.length-1) {
                if (arr[i]!=arr[i+1]) {
                    return arr[i];

                    
                }

                
                i=i+2;
        }
        return arr[arr.length-1];
        
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,1,2,1,3,4,5,5,8,7,7,8};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } 
            }
        }
        int ans =ue(arr);
        System.out.println("repeted element in the array is "+ ans);

        System.out.println("The sorted array is " + Arrays.toString(arr));


        
    }
}
