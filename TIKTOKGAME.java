// import java.util.Scanner;
// import java.util.*;

// public class TIKTOKGAME {
//     //making maze for  tiktok game
//     //globally defined 
//     private int[][] map;
//     private int row, col;
//     int x ,y;
    
//     public void makeMaze(int r, int c) {
//         this.row = r;
//         this.col = c;
        
//         map = new int[r][c];
        
//         for (int i=0; i<r; i++) {
//             for (int j=0; j<c; j++) {
//                 map[i][j] =  1;
//             }
//         }
        
//         //put the start point in the top left corner of the maze
//         map[0][0] =  0;
//     }

  

    
//     public void play( StringBuilder sx , StringBuilder ve ){
//         int r =3;
//         int c =3;

        
//         Scanner Sc = new Scanner(System.in);
//         System.out.println("Enter on Which number you wanted to go");

//         System.out.println("Player X turn: ");
       
//         x = Sc.nextInt();
//         System.out.println("Player Y turn: ");
//         y =Sc.nextInt();
//         System.out.println("You are at : "+x+" , "+y);
//         while(!iswin(sx, ve))
//         {
            
//             if(map[x][y]==1){
                
//                System.out.println("Wall in front!");
//                continue;
//             }else{
             
//                 map[x][y]=1;  
//             }
          
//           if(x+1 < r && map[x + 1][y] == 0) {
//               x++;
//               sx.append(x);
//               ve.append(y);
//               System.out.println("You moved down.");
//           } else if (x - 1 >= 0 && map[x - 1][y] == 0) {
//               x--;
//               sx.append(x);
//               ve.append(y);
//               System.out.println("You moved up.");
//           } else if (y + 1 < c && map[x][y +  1] == 0) {
//               y++;
//               sx.append(x);
//               ve.append(y);
//               System.out.println("You moved right.");
//           } else if (y - 1 >= 0 && map[x][y - 1] == 0) {
//               y--;
//               sx.append(x);
//               ve.append(y);
//               System.out.println("You moved left.");
//           } else {
//               System.out.println("No valid move, You Lose!");
//               break;
//           }
//         }
      

    

        
//     }
//     private boolean iswin(StringBuilder sx , StringBuilder ve) {
//         int sum  = 0;
//         int sum1=0;
//         for (int i = 0; i < sx.length(); i++) {
//             int ch = sx.charAt(i);
//             sum = sum+ch;
//         }
//          for (int i = 0; i < ve.length(); i++) {
//             int ch = ve.charAt(i);
//             sum1 = sum1 +ch;
//         }

//         if (sum ==9 || sum == 12 || sum ==15 || sum ==3 || sum == 21) {
//             System.out.println("Winner of game is X ");
//             return true;
//         }
//         else{
//             System.out.println("Winner of game is Y");
//             return true;
//         }


       
//     }

//     public static void main(String[] args) {
//         StringBuilder re = new StringBuilder();
//         StringBuilder ve = new StringBuilder();
//         //simpler form of the XO game 
//         System.out.println("Welcome to TikTok Game!");
//         int size = 3;
//         int count =0;
//         System.out.println("enter your moves according to number mentioned ");
    
//         for (int i = 0; i < size; i++) {
//             for (int j = 0; j < size; j++) {
//                 System.out.print(count++ +"_|_"); // Print the desired character 
//             }
//             System.out.println(); // Move to the next line after each row
//         }
//         TIKTOKGAME ans = new TIKTOKGAME();
//         ans.play(re, ve);
//         ans.iswin(re, ve);

       
//     }
// }

   

import java.util.Scanner;

public class TIKTOKGAME {
    private char[][] board;
    private int size;
    private char currentPlayer;

    public TIKTOKGAME(int size) {
        this.size = size;
        board = new char[size][size];
        currentPlayer = 'X'; // Player X starts the game
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '_'; // Empty cell marker
            }
        }
    }

    private void printBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean makeMove(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size || board[x][y] != '_') {
            System.out.println("Invalid move! Try again.");
            return false;
        }
        board[x][y] = currentPlayer;
        return true;
    }

    private boolean checkWin(char player) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < size; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true; // Row win
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true; // Column win
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true; // Diagonal (\) win
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true; // Diagonal (/) win
        }
        return false; // No win
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        int moves = 0;

        while (!gameWon && moves < size * size) {
            System.out.println("Current Player: " + currentPlayer);
            printBoard();

            System.out.print("Enter row and column (0-" + (size - 1) + "): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (makeMove(x, y)) {
                moves++;
                if (checkWin(currentPlayer)) {
                    gameWon = true;
                    System.out.println("Player " + currentPlayer + " hey hey you won !");
                }
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch player
            }
        }

        if (!gameWon) {
            System.out.println("It's a draw!");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        TIKTOKGAME game = new TIKTOKGAME(3); // 3x3 grid
        game.playGame();
    }
}

