import java.util.Scanner;

public class HangmanWithArrays2020
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Player 1 - Input the word to be guessed (lower case letters only): ");
        String word = input.next( );
        String [ ] Player1Word = new String [word.length( )];
        String [ ] Player2Guess = new String [word.length( )];
        System.out.println("Player 2 - The word you are trying to guess has " + word.length( ) + " letters in it.");
        for(int i = 0; i < word.length( ); i++)
        {
            Player2Guess[i] = "___";
            System.out.print(Player2Guess[i] + "   ");
            if(i == word.length( ) - 1)
                System.out.println(" ");
        }
        for(int k = 0; k < word.length( ); k++)
        {
            Player1Word[k] = word.substring(k, k + 1);
            //  System.out.print(Player1Word[k] + "   ");
        }
        int numberCorrect = 0;
        int numberWrong = 0;
        while( numberWrong < 6 && numberCorrect < word.length( ))
        {
            System.out.print("Player 2 - Enter a letter (lowercase): ");
            String guess = input.next( );

        }
    }

}
