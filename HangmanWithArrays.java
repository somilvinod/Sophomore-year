import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.Scanner;

public class HangmanWithArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Player 1 - Input the word to be guessed (lower case letters only): ");
        String word = input.next();
        String[] Player1Word = new String[word.length()];
        String[] Player2Guess = new String[word.length()];
        String lettersGuessed = "";
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlayer 2 - The word you are trying to guess has " + word.length() + " letters in it.");
        for (int i = 0; i < word.length(); i++) {
            Player2Guess[i] = "___";
            System.out.print(Player2Guess[i] + "   ");
            if (i == word.length() - 1)
                System.out.println(" ");
        }
        for (int k = 0; k < word.length(); k++) {
            Player1Word[k] = word.substring(k, k + 1);
            // System.out.print(Player1Word[k] + "   ");
        }
        int numberCorrect = 0;
        int numberWrong = 0;

        while (numberWrong < 6 && numberCorrect < word.length()) {

            System.out.print("\nPlayer 2 - Enter a letter (lowercase): ");
            String guess = input.next();
            lettersGuessed += guess + " ";
            int count = 0;

            for (int q = 0; q < word.length(); q++) {


                if (guess.equals(Player1Word[q])) {
                    Player2Guess[q] = guess;
                    numberCorrect++;
                }
                else {
                    count++;

                }

                if (count == word.length()) {
                    numberWrong++;
                }



            }
            System.out.println(Arrays.toString(Player2Guess));
            System.out.println("Letters used: " + lettersGuessed + ". ");
            System.out.println("Number wrong so far: " + numberWrong + " ");

        }

            if (numberWrong == 6)
                System.out.println("\nSorry, you have lost. The word was " + word + ". ");

            else
                System.out.println("\nCongratulation! You won! The word is " + word + " ");



    }
}
