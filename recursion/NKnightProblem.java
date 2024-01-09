// package recursion;

// public class NKnightProblem {
//     static int nknight(boolean matrix[][], int row , int cols, int target){
//         if (target ==1) {
//                 display(matrix);
//                 return 1;
//         }
//         matrix[row][cols]=false;
//         int count =0;
        
//         if (issafe(matrix, row, cols, target)) {
//             count+=nknight(matrix, row+1, cols+1, target-1);
            
//             matrix[row][cols]=true;
            
            
//         }
//         return count;

//     }
//     static boolean issafe(boolean matrix[][],int row , int cols ,int targrt){
     
//         int botoom = Math.max(row, cols);
//         for(int i =0 ; i<botoom; i++){
//             if (matrix[row+2][cols-1]) {
//                 return false;
//             }
            
//             int upperright=Math.max(row,cols);
//             for(int  j=0 ; j<upperright; j++){
//                 if (matrix[row-1][cols+2]) {
//                     return false;

//                 }

//             }
//             int leftbottom=Math.min(row,cols);
//             for(int k =0 ; k<leftbottom; k++){
//                 if (matrix[row+1][cols+2]) {
//                     return false;

//                 }
//             }
//             int b = Math.min(row, cols);
//             for(int h=0 ; h<b ; h++){
//                 if (matrix[row+2][cols+1]) {
//                     return false;
//                 }
//             }

      
      
//       }
//         return true;
       


        



//     }
//     static void display(boolean matrix[][]){
//         for(boolean[] a :matrix){
//             for(boolean b : a){
//                 if (b) {
//                     System.out.println("K");
//                 }
//                 else{
//                     System.out.println("X");
//                 }
//             }
            
//         }
//     }
    
//     public static void main(String[] args) {
//         boolean matrix[][]={
//             {true,true,true,true},  {true,true,true,true},  {true,true,true,true},  {true,true,true,true}
//         };
//         int ans =nknight(matrix, 0, 0, 4);
//         System.out.println("the count is " + ans);
  
      
        
//     }
    
// }
package recursion;

public class NKnightProblem {

    static void nknight(boolean matrix[][], int row, int cols, int target) {
        if (target == 0) {
            display(matrix);
            return ;
        }

     

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (issafe(matrix, r, c)) {
                    matrix[r][c] = true;
                 nknight(matrix, r, c, target - 1);
                    matrix[r][c] = false;
                }
            }
        }

        
    }

    static boolean issafe(boolean matrix[][], int row, int cols) {
        // Check if the cell is valid for placing a knight
        return row >= 0 && row < matrix.length && cols >= 0 && cols < matrix[0].length && !matrix[row][cols];
    }

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

    public static void main(String[] args) {
        boolean matrix[][] = {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}
        };
        nknight(matrix, 0, 0, 4);
       
    }
}

