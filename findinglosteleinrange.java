import java.util.Arrays;

public class findinglosteleinrange {
    static void totalmissing(int arr[]) {
        Arrays.sort(arr);
       
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] - arr[j] != 1) {
                    for (int k = 1; k < arr[j + 1] - arr[j]; k++) {
                        System.out.println("The missing element in the array is: " + (arr[j] + k));
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {-9,6,4,2,3,5,7,0,1};
        totalmissing(arr);
    }
}

