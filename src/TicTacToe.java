public class TicTacToe
{
   //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
   private String[][] ticBoard = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
   
   public String[][] getBoard() {
       return ticBoard;
   }
   
   private int turn;
   
   //this method returns the current turn
   public int getTurn()
   {
       return turn;
   }
   
   public boolean checkTurn() {
       return turn %2 == 0;
   }
   
   /*This method prints out the board array on to the console
   */
   public void printBoard()
   {
       System.out.println("  0 1 2");
       for (int i = 0; i<ticBoard.length; i++) {
           System.out.print(i + " ");
           for (int j = 0; j<ticBoard[i].length; j++) {
               System.out.print(ticBoard[i][j] + " ");
           }
           
           System.out.println();
       }
       
   }
   
   //This method returns true if space row, col is a valid space
   public boolean pickLocation(int row, int col)
   {
       if (row<3) {
           if (col<3) {
               if (ticBoard[row][col].equals("-")) {
                   return true;
               }
           }
       }
       return false;
   }
   
   //This method places an X or O at location row,col based on the int turn
   public void takeTurn(int row, int col)
   {
       if (turn%2 == 0) {
            ticBoard[row][col] = "X";
        }
        else {
            ticBoard[row][col] = "O";
        }
        turn+=1;
   }
   
   //This method returns a boolean that returns true if a row has three X or O's in a row
   public boolean checkRow()
   {
       for (int row = 0; row < 3; row++) {
            if (ticBoard[row][0].equals(ticBoard[row][1]) && ticBoard[row][1].equals(ticBoard[row][2]) && !ticBoard[row][0].equals("-")) {
                return true; // Three consecutive symbols found in a row
            }
        }
        return false; 
   }
   
    //This method returns a boolean that returns true if a col has three X or O's
   public boolean checkCol()
   {
       for (int col = 0; col < 3; col++) {
            if (ticBoard[0][col].equals(ticBoard[1][col]) && ticBoard[2][col].equals(ticBoard[0][col]) && !ticBoard[1][col].equals("-") ) 
            {
                return true; // Three consecutive symbols found in a row
            }
        }
        return false; 
   }
   
    //This method returns a boolean that returns true if either diagonal has three X or O's
   public boolean checkDiag()
   {
       if (ticBoard[0][0].equals(ticBoard[1][1]) && ticBoard[0][0].equals(ticBoard[2][2])  && !ticBoard[1][1].equals("-")){
            return true;
        }
        else if (ticBoard[0][2].equals(ticBoard[1][1]) && ticBoard[0][2].equals(ticBoard[2][0]) && !ticBoard[1][1].equals("-")) {
            return true;
        }
        return false;
   }
   
   public boolean checkFull() {
       for (int i=0; i<ticBoard.length; i++) {
           for (int j=0; j<ticBoard[i].length; j++) {
               if (ticBoard[i][j].equals("-")) {
                   return false;
               }
           }
       }
       return true;
   }
   
   //This method returns a boolean that checks if someone has won the game
   public boolean checkWin()
   {
       return checkRow() || checkCol() || checkDiag();
   }

}