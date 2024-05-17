import java.util.Scanner; 
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to the Arcade!");
        System.out.println("What game would you like play?");
        System.out.println("1 - Trivia Game");
        System.out.println("2 - Number Guessing Game");
        System.out.println("3 - NYT Connections");
        System.out.println("4 - Tic Tac Toe");
        System.out.println("5 - Quit");
        int userChoice = scanner.nextInt();
        
        while (userChoice != 1 && userChoice != 2 && userChoice != 3 && userChoice != 4 && userChoice != 5) {
            System.out.println("You must either enter 1, 2, 3, 4, or 5. Try Again.");
            userChoice = scanner.nextInt();
        }
        
        if (userChoice == 1) {
            GameShow game = new GameShow();
            
            game.askQuestionOne();
            game.askQuestionTwo();
            game.askQuestionThree();
            game.askQuestionFour();
            game.askQuestionFive();
            game.askQuestionSix();
            game.finalSummary();
        }
        
        if ( userChoice == 2)  {
            GuessingGame gameTwo = new GuessingGame();

            gameTwo.play();
        }
        
        if ( userChoice == 3 ) {
            Connections gameThree = new Connections();
            
            gameThree.play();
        }
        
        if ( userChoice == 4) {
            TicTacToeTester gameFour = new TicTacToeTester();
            
            gameFour.play();
        }
        
        if ( userChoice == 5) {
            System.out.println("Okay, bye!");
        }
    }
}