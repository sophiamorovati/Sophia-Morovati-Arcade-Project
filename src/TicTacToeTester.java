import java.util.Scanner;

public class TicTacToeTester {
    public void play()
    {

        TicTacToe game = new TicTacToe();
        System.out.println("Initial Game Board:");
        game.printBoard();
        
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            
            System.out.println("What row would you like to make your move on?");
            int playerRow = scanner.nextInt();
            System.out.println("What column would you like to make your move on?");
            int playerCol = scanner.nextInt();
            
            if (game.pickLocation(playerRow, playerCol) == false) {
                System.out.println("That spot is taken, try again.");
                continue;
            }
            else {
                game.takeTurn(playerRow, playerCol);
                game.printBoard();
            }
            
            if (game.checkFull() == true) {
                System.out.println("Tie! Game over.");
                break;
            }
            
            if (game.checkWin() == true) {
                System.out.println("Three in a row! Game over.");
                break;
            }
            
            System.out.println("Next player's turn!");
    
        }
    }
    
}