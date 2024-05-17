import java.util.Scanner;
public class GuessingGame 
{
    public void play()
    {
        int ANSWER = (int)(Math.random()*100); //DO NOT EDIT THIS LINE
        int tries = 0;
        
        // Start here!
        
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number 1-100");
        int userAnswer = input.nextInt();
        tries++;
        
        while (userAnswer != ANSWER) {
            if ( userAnswer < ANSWER ) {
            System.out.println("The number is greater than " + userAnswer);
            System.out.println("Try again!");
            tries++;
            userAnswer = input.nextInt();
            }
        
            else if (userAnswer > ANSWER ) {
            System.out.println("The number is less than " + userAnswer);
            System.out.println("Try again!");
            tries++;
            userAnswer = input.nextInt();
            }
        }
        
       System.out.println("Congratulations, you guessed correctly! It took you " + tries + " tries!");
    }
}