package recursion;

import java.util.ArrayList;

public class subsetusingloops {
    static ArrayList<ArrayList<Integer>> subset(int arr[]){
        ArrayList<ArrayList<Integer>>list =new ArrayList<>();
           list.add(new ArrayList<>());

        for(int num : arr){
          int n = list.size();
          for(int i =0 ; i<n; i++){
            ArrayList<Integer> internal =new ArrayList<>(list.get(i));
            internal.add(num);
            list.add(internal);

          }
        

        }
        return list;

      
        
    }
    public static void main(String[] args) {
    int arr[]={1,2,3};
    ArrayList<ArrayList<Integer>> ans = subset(arr);
    System.out.println("the subset of the given array or set is " + ans);

        
    }
}
