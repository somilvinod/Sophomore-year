import java.util.Scanner;
import java.util.Random;

public class ChuckaLuckSomil
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int bank = 100;
        int die1, die2, die3;
        String response = "yes";
        System.out.println("You are about to play the dice game Chuck-a-Luck.  Good Luck!!");
        System.out.println("You will have $100 in your bank to start the game.");
        System.out.print("Please enter your name: ");
        String name = input.next();

        while(response.equals("yes") && bank > 0)
        {
            int playoff = 0;

            System.out.println(" ");
            System.out.print("Enter your bet: $");
            int bet = input.nextInt();

            if (bet > bank) {
                System.out.println("You can't bet more money than you have! You have $" + bank + " in the bank. ");
                System.out.print("Enter a new bet: $");
                bet = input.nextInt();
            }

            System.out.print("Enter your number for the round (1 to 6): ");
            int number = input.nextInt();

            die1 = generator.nextInt(6) + 1;;
            die2 = generator.nextInt(6) + 1;
            die3 = generator.nextInt(6) + 1;;

            System.out.println("Die 1 = " + die1 + " Die 2 = " + die2 + " Die 3 = " + die3);

            if (die1 == number || die2 == number || die3 == number) {
                playoff = 1;
            }

            if (die1 == number && die2 == number || die2 == number && die3 == number || die1 == number && die3 == number) {
                if (die1 == number && die2 == number && die3 == number) {
                    playoff = 5;
                }
                else
                    playoff = 2;
            }

            if (playoff == 0)
                bank = bank-bet;

            if (playoff >= 1) {
                bank = bank + (playoff*bet);
            }

            System.out.println(name + ", You now have " + bank + ".");

            if (bank > 0) {
                System.out.print("\nWould you like to roll again? (yes/no):");
                response = input.next();
            }

        }
    }
}
