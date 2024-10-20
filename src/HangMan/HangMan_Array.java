package HangMan;

import java.util.Random;
import java.util.Scanner;

public class HangMan_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        String[] words = {"java", "programing", "book", "computer", "human", "objects"};
        String wordToGuess = words[random.nextInt(words.length)];
        //String wordToGuess = words[0];
        //System.out.println(wordToGuess);

        boolean[] guessedLetters = new boolean[wordToGuess.length()];

        int remainingGuess = 6;

        System.out.println("Welcome to My HangMan Game!");
        System.out.println("Please. Enter a letter...");

        while (remainingGuess > 0) {

            System.out.println();
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (guessedLetters[i]) {
                    System.out.print(wordToGuess.charAt(i) + " ");
                } else {
                    System.out.print("- ");
                }

            }

            System.out.println("");
            System.out.println("Your Remaining Guess: " + remainingGuess);
            System.out.print("Enter a Letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            boolean isFound = false;

            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedLetters[i] = true;
                    isFound = true;
                }
            }

            if (isFound) {
                System.out.println("Letter Guess Correctly !");
            } else {
                remainingGuess--;
                System.out.println("No letters found. Wrong Guess!!!");
            }

            boolean isComplete = true;
            for (boolean letter : guessedLetters) {
                if (!letter) {
                    isComplete = false;
                    break;
                }
            }
            if (isComplete) {
                System.out.println("Congratulations!\nYou Guess the Word Correctly. " + wordToGuess);
                break;
            }

        }
        if (remainingGuess == 0) {
            System.out.println("Your right to guess is over. Game Over !!!");
            System.out.println("Correct Word --> " + wordToGuess);
        }
    }
}
