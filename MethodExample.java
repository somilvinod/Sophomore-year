import java.util.Scanner;
import java.util.Random;
public class MethodExample {

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(dieRoll() + dieRoll());
        int die1 = dieRoll();
        System.out.println("Die 1 = " + die1);
        int die2 = dieRoll();
        System.out.println("Die 1 = " + die2);
        int sumdice = die1 + die2;
        System.out.println("The sum of the dice = " + sumdice);
        System.out.println("Would you like to play again? (y/n): ");
        String response = input.next();
        playAgain(response);
    }

    public static int dieRoll () {
        Random generator = new Random();
        int die = generator.nextInt(6) + 1;
        return die;
    }

    public static void playAgain(String answer) {
        if (answer.equalsIgnoreCase("y"))
            main(null);
        else
            System.exit(0);

        }
    }


