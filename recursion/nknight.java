package recursion;

public class nknight {
    static void display(boolean matrix[][]) {
        for (boolean[] a : matrix) {
            for (boolean b : a) {
                if (b) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void knight(boolean[][] matrix , int row, int cols, int target){
        if (target==0 ) {
            display(matrix);
            return;

            
        }
        if (row>matrix.length||cols>matrix[0].length) {
            return;
        }
         matrix[row][cols]=true;
        if (cols==matrix[0].length) {
            knight(matrix, row+1, 0, target);

            
        }
        if (issafe(matrix , row , cols )) {
            // matrix[row][cols]=false;
            knight(matrix, row, cols+1, target-1);
             matrix[row][cols]=false;
            
        }

    }
    static boolean issafe(boolean matrix[][] , int row , int cols){
        if (valid(matrix, row+2, cols-1)) {
            if (matrix[row+2][cols-1]) {    
                return false;
            }
            
        }
          if (valid(matrix, row-1, cols+2)) {
            if (matrix[row-1][cols+2]) {    
                return false;
            }
            
        }
          if (valid(matrix, row+1, cols+2)) {
            if (matrix[row+1][cols+2]) {    
                return false;
            }
            
        }
          if (valid(matrix, row+2, cols+1)) {
            if (matrix[row+2][cols+1]) {    
                return false;
            }
            
        }
        return true;

    }

    static boolean valid(boolean matrix[][], int row , int cols){
        return row>=0 && row <matrix.length && cols>=0 && cols<matrix[0].length;
    }
    public static void main(String[] args) {
        boolean matrix[][]={
                        {true,true,true,true},  {true,true,true,true},  {true,true,true,true},  {true,true,true,true}
                    };
                    knight(matrix, 0, 0, 4);
        
    }
    
}
