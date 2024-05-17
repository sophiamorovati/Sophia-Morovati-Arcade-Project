import java.util.Scanner; 

public class GameShow {
    // Instance Variables
    private double points;
    private String playerName; 
    
    // Final Variables    
    final String QUESTION_ONE = "What is Sophia's last name?";
    final String ANSWER_QUESTION_ONE = "Morovati";
        
    final String QUESTION_TWO = "How old is Sophia?";
    final int ANSWER_QUESTION_TWO = 17;
    
    final String QUESTION_THREE = "What is Sophia's favorite dessert?";
    final String ANSWER_QUESTION_THREE = "Pizookie";
    
    final String QUESTION_FOUR = "What is Sophia's favorite letter?";
    final char ANSWER_QUESTION_FOUR = 'S';
    
    final String QUESTION_FIVE = "Sophia has 2 brothers. True or false?";
    final boolean ANSWER_QUESTION_FIVE = false;
    
    final String QUESTION_SIX = "How many fingers does Sophia have?";
    final int ANSWER_QUESTION_SIX = 10;
    
    final double NUMBER_OF_QUESTIONS = 6;
    
    // Intro
    public GameShow() {
        points = 0;
        System.out.println("Hi! Welcome to the Sophia Show. What's your name?");
        Scanner scanner = new Scanner(System.in);
        playerName = scanner.nextLine();
        System.out.println("Nice to meet you, " +playerName+ ", let's get started!");
        System.out.println("");
    }
    
    // Are You Ready? Function
    public void areYouReady(String questionNumber)
    {
        System.out.println("Okay, " + playerName + ", are you ready for " + questionNumber + "?");
        Scanner scanner = new Scanner(System.in);
        String playerReady = scanner.nextLine();
        while ( !playerReady.equalsIgnoreCase("Yes") ) {
            System.out.println("Are you ready now?");
            playerReady = scanner.nextLine();
        System.out.println("");
        }
    }
    
    // Ask Question Function
    public void askQuestion(String number, String question) 
    {
        System.out.println("Question " + number +": " + question);
    }
    
    // Right Answer Function
    public void rightAnswer() 
    {
        points++;
        System.out.println("Yay! You got it right slayyy. You get a point! " + "You have " + points + " points!");
        System.out.println("");
    }
    
    // Wrong Answer Function
    public void wrongAnswer() 
    {
        System.out.println("BOOOO! You got it wrong. You don't get any points. You have " + points + " points. ");
        System.out.println("");
    }
    
    // Ask First Question
    public void askQuestionOne() {
        areYouReady("Question 1");
        askQuestion("1", QUESTION_ONE);
        Scanner scanner = new Scanner(System.in);
        String playerAnswerOne = scanner.nextLine();
        
        if ( playerAnswerOne.equalsIgnoreCase(ANSWER_QUESTION_ONE) ) {
            rightAnswer();
        }
        else {
            wrongAnswer(); 
        }
    }
    
    // Ask Second Question
    public void askQuestionTwo() {
        areYouReady("Question 2");
        askQuestion("2", QUESTION_TWO);
        Scanner scanner = new Scanner(System.in);
        int playerAnswerTwo = scanner.nextInt();
        scanner.nextLine();
        
        if ( ( playerAnswerTwo == ANSWER_QUESTION_TWO ) ) {
            rightAnswer();
        }
        else {
            wrongAnswer(); 
        }
    }
    
    // Ask Third Question
    public void askQuestionThree() {
        areYouReady("Question 3");
        askQuestion("3", QUESTION_THREE);
        Scanner scanner = new Scanner(System.in);
        String playerAnswerThree = scanner.nextLine();
        
        if ( playerAnswerThree.equalsIgnoreCase(ANSWER_QUESTION_THREE) ) {
            rightAnswer();
        }
        else {
            wrongAnswer(); 
        }
    }
    
    // Ask Fourth Question
    public void askQuestionFour() {
        areYouReady("Question 4");
        askQuestion("4", QUESTION_FOUR);
        Scanner scanner = new Scanner(System.in);
        char playerAnswerFour = scanner.next().charAt(0);
        scanner.nextLine();
         
        if ( Character.toUpperCase(playerAnswerFour) == ANSWER_QUESTION_FOUR ) {
            rightAnswer();
        }
        else {
            wrongAnswer(); 
        }
    }
    
    // Ask Fifth Question
    public void askQuestionFive() {
        areYouReady("Question 5");
        askQuestion("5", QUESTION_FIVE);
        Scanner scanner = new Scanner(System.in);
        boolean playerAnswerFive = scanner.nextBoolean();
        scanner.nextLine();
         
        if (playerAnswerFive == ANSWER_QUESTION_FIVE) {
            rightAnswer();
        }
        else {
            wrongAnswer(); 
        }
    }
    
    // Ask Sixth Question
    public void askQuestionSix() {
        areYouReady("Question 6");
        askQuestion("6", QUESTION_SIX);
        Scanner scanner = new Scanner(System.in);
        int playerAnswerSix = scanner.nextInt();
        scanner.nextLine();
         
        if (playerAnswerSix == ANSWER_QUESTION_SIX) {
            rightAnswer();
        }
        else {
            wrongAnswer(); 
        }
    }
    
    // Final Summary & Score   
    public String finalSummary() {
        double scoreRatio = points/NUMBER_OF_QUESTIONS * 100;
        
        double percentage = Math.round(scoreRatio * 100) / 100.0;
        String summary = "You got " + points + "/" + NUMBER_OF_QUESTIONS +  " questions right! Your total score is " + percentage + "%. Bye.";
        System.out.println(summary);
        return summary;
    }
    
}