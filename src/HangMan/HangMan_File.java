package HangMan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangMan_File {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(System.getProperty("user.dir") + "/src/HangMan/Names.txt");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Scanner readFile = new Scanner(file);
        ArrayList words = new ArrayList();


        while (readFile.hasNext()) {
            words.add(readFile.nextLine());
        }

        String wordToGuess = (String) words.get(random.nextInt(words.size()));

        boolean[] guessedLetters = new boolean[wordToGuess.length()];

        //deneme hakkı tahmin edilecek kelimenin harf sayısının 2 katı oldu
        int remainingGuess = wordToGuess.length() * 2;


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
