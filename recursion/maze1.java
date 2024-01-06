package recursion;
//now in this problem we have to print the path of we are travalin in the maze in terms of up and right only -> exaple RRDD

public class maze1 {
    static void maze(String path , int row , int cols){
        if (row ==1 && cols ==1) {
            System.out.println(path);
            return;

        }
        if (row>1) {
            maze(path+"D", row-1, cols);
            
        }
        if (cols >1) {
             maze(path+"R", row, cols-1);
            
        }
       
        



    }

    public static void main(String[] args) {
        maze( "" , 3 , 3);
        
    }
    
}
