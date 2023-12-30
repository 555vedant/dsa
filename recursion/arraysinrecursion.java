package recursion;

public class arraysinrecursion {
    static boolean sort (int arr[] , int index){
        if (index == arr.length-1) {
            return true; 
        }
        return arr[index]<arr[index+1]&&sort(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,8,4,5};
        boolean ans =sort(arr, 0);
        System.out.println("the boolanen value of the given question is " + ans);
        
    }
}
