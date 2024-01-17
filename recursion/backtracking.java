package recursion;
//this is just used for when we are trying to go into 4 diffrent ways in maze that time there is huge possiblity for stack overflow so we need backtracking
//backtracking mince apan jya box madun nigalo titthe false lawyche pan recursion call madun wapas yachya wles it should be true so it is callid as backtracking


public class backtracking 
{
    static void back(String path , boolean maze[][] ,  int row , int cols){
    



        if (row==maze.length-1 && cols == maze[0].length-1 ) {
            System.out.println(path);
            return;
            
        }
        if (!maze[row][cols]) {
            return;
            
        }
        maze[row][cols]=true;

        if (row<maze.length) {
            back(path+"D", maze, row+1, cols);
            
        }
        if (row<maze[0].length) {
            back(path+"R", maze, row, cols+1);
        }
        if (row!=0) {
            back(path+"U", maze, row+1, cols);
        }
        if (cols!=0) {
            back(path+"L", maze, row, cols+1);
            
        }
        maze[row][cols]=false;

    }
    public static void main(String[] args) {
        boolean maze [][]={
           { true , true , true },{ true , true , true}, {true , true , true}
         };
         System.out.println("the answer of the question is as below");
         back("", maze, 0, 0);

        
    }
    
}
