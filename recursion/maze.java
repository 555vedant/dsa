package recursion;
//in this problem we have to print what is count of that path that we take from any point a to point b

public class maze {
    static int maze(int row , int cols){
        if ( row ==1 || cols ==1) {
           return 1;

            
        }
         int left =maze( row -1 , cols);
         int right =maze(row , cols-1);
         int ans = left +right;
         return ans;



    }

public static void main(String[] args) {
   int a = maze(3 ,3);
   System.out.println(a);


    
}
}
