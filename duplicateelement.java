import java.util.Arrays;

public class duplicateelement {
    static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static int main(String[] args) {
        int arr[] = {4, 2, 3, 1, 3, 5};
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != i + 1) {
                if (arr[i] != arr[correct]) {
                    // Correct the second argument to be i+1
                    swap(arr, i, correct);
                } else {
                    // Print the repeated element index (i)
                    
                    return arr[i];
                }
            } else {
                i++;
            }
           
        }
        System.out.println("the adjusted array " + Arrays.toString(arr));
        return -1;
    }
}

