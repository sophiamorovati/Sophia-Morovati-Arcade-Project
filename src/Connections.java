import java.util.Scanner;
import java.util.Arrays;

public class Connections
{
    private static final String[] currentWords = {"ABUNDANT", "CONTENT", "INDIFFERENT", "SILENT", "BIRDS", "CLOUDS", "PLANES", "SUN", "ASTRONAUT", "DOCTOR", "LAWYER", "SUPERHERO", "DOG", "CAT", "COW", "HORSE"};
    private static final String GUESSED = "-----";
    private static final String[] group1 = {"ABUNDANT", "CONTENT", "INDIFFERENT", "SILENT"}; // sorted! – WORDS THAT END IN 'T'
    private static final String[] group2 = {"BIRDS", "CLOUDS", "PLANES", "SUN"}; // sorted! – THINGS IN THE SKY 
    private static final String[] group3 = {"ASTRONAUT", "DOCTOR", "LAWYER", "SUPERHERO"}; // sorted! – WHAT KIDS WANT TO BE WHEN THEY GROW UP
    private static final String[] group4 = {"CAT", "COW", "DOG", "HORSE"}; // sorted! – FARM ANIMALS
    private static Scanner scanner = new Scanner(System.in);

    // Names of you / your partner: Sophia, Josh
    
    public static void play()
    {
        System.out.println("Welcome to Connections!");
        // Shuffle words
        shuffleArray(currentWords);
        
        // Print on 4 lines
        printArrayOnFourLines(currentWords);
        
        // Get user word guesses
        while (!allStringsMatch(currentWords, GUESSED)) {
            String[] output = getGuesses();
            System.out.println("WORDS TYPED:");
            for (String word : output) {
                System.out.println(word);
            }
        
            // Check if user correctly guessed a group
                // If yes, replace all guessed words with GUESSED string - Noah/Bailey
                // If no, continue loop
            if (checkIfGroup(output)) {
                updateCurrentWords(currentWords, output);
                printArrayOnFourLines(currentWords);
            }
            else {
                System.out.println("Not a group, try again.");
                continue;
            }
            // Check if all words are guessed - Ethan (done with while loop)
        }
        
        System.out.println("Congratulations, you won! You guessed all groups. Game over.");
    }
    
    public static boolean allStringsMatch(String[] array, String target) {
        for (String str : array) {
            if (!str.equals(target)) {
                return false;
            }
        }
        return true;
    }
    
    private static void updateCurrentWords(String[] currentWords, String[] groupToRemove) {
        for (String word : groupToRemove) {
            for (int i=0; i<currentWords.length; i++) {
                if (currentWords[i].equals(word)) {
                    currentWords[i] = GUESSED;
                    break;
                }
            }
        }
    }
    
    private static String[] getGuesses() {
        String[] userGroup;
        while ( true ) {
            System.out.println("Enter your four guesses with a space in between: ");
            String userInput = scanner.nextLine();
            userGroup = userInput.split(" ");
            if ( userGroup.length != 4 ) {
                System.out.println("Invalid input. You must enter four words.");
            }
            else {
                break;
            }
        }
        return userGroup;
    }
    
    private static boolean checkIfGroup(String[] guesses) {
        for(int i = 0; i<4; i++) {
            guesses[i] = guesses[i].toUpperCase();
        }

        //check if equal
        Arrays.sort(guesses);
        if (Arrays.equals(guesses, group1)) {
            return true;
        }
        if (Arrays.equals(guesses, group2)) {
            return true;
        }
        if (Arrays.equals(guesses, group3)) {
            return true;
        }
        if (Arrays.equals(guesses, group4)) {
            return true;
        }
        
        return false;
    }
    
    private static void shuffleArray(String[] array) // used
    {
        for (int i=0; i<array.length; i++)
        {
            int random= (int)(Math.random()*array.length);
            String temp= array[random];
            array[random]= array[i];
            array[i]= temp;
        }

    }
    
    public static void printArrayOnFourLines(String[] array) { // used
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
            if(i % 4 == 3) {
                System.out.println();
            } 
        }
    }
}