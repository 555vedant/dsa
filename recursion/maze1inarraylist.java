package recursion;
import java.util.*;


public class maze1inarraylist {
    static ArrayList<String> maze(String path , int row , int cols ){
        // ArrayList<ArrayList<String>> list =new ArrayList<>();
        if (row ==1 && cols ==1) {
               ArrayList<String> list =new ArrayList<>();
            // System.out.println(list);
            list.add(path);
            return list;

        }
        ArrayList<String> list =new ArrayList<>();
        if (row>1) {
            list.add(maze(path+"D", row-1, cols));
            
        }
        if (cols >1) {
             list.add(maze(path+"R", row, cols-1));
            
        }
        return list;
        



    }

    public static void main(String[] args) {
        ArrayList<String> ans =maze("", 3, 3);
        System.out.println(ans);
        
    }
}
