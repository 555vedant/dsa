package recursion;

public class mazewithdiaginal {
    static void maze (String way , int row , int cols){
        if (row ==1&&cols==1) {
            System.out.println(way);
            return;

        }
        if (row >1) {
            maze(way+"D" , row-1 , cols);

        } 
        if (cols>1) {
              maze(way+"R" , row, cols-1);

            
        }
        if (row==cols) {
            maze(way+"V", row-1, cols-1);
        }
    }
    public static void main(String[] args) {
        maze("", 3, 3);
    }
}
