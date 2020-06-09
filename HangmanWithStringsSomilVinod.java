import java.util.Scanner;
public class HangmanWithStringsSomilVinod {

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String playAgain = "yes";

        while (playAgain.equals("yes")) {

        int numberWrong = 0;
        String replacedPhrase = "";
        System.out.println("Player 1 - Input a word to play hangman (No capital letters!): ");
        String word = input.next();
        boolean matchedLetter = false;
        String guessedWords = "";


        for(int i = 0; i < word.length(); i++) {
            replacedPhrase = replacedPhrase + "_ ";
        }

        System.out.println("\nPlayer 2 - The word you are trying to guess has " + word.length() + " letters");
        System.out.println(replacedPhrase);
            while (numberWrong < 6) {

                if (replacedPhrase.indexOf('_') < 0) {
                    System.out.println("You have won! The word to guess was " + word);
                    System.exit(0);
                }



                System.out.println("\nPlayer 2 - Guess a letter (lowercase): ");
                String guess = input.next();
                for (int i = 0; i < word.length(); i++) {
                    if (guess.equalsIgnoreCase(word.substring(i, i + 1))) {
                        replacedPhrase = replacedPhrase.substring(0, 2 * i) + guess + replacedPhrase.substring(2 * i + 1);
                        matchedLetter = true;
                    }
                }
                System.out.println(replacedPhrase);
                if (matchedLetter == false)
                    numberWrong++;
                matchedLetter = false;

                System.out.println("The amount of incorrect answers is : " + numberWrong);
                guessedWords = guessedWords.concat(guess + " ");
                System.out.println("Letters you have guessed: " + guessedWords);
            }

            System.out.println("\nSorry, you've got too many wrong! Would you like to play the game again? (yes/no)");
            playAgain = input.next();
        }
    }

}
