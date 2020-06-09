// Somil Vinod

import java.util.Scanner;
import java.util.Random;

public class diceRoll {

    public static void main(String[] args) {
        int die1, die2, diceSum;
        int money = 0;
        String name;
        String change;
        int bet;
        Random generator = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the APCS Dice Game!");
        System.out.println("Please enter your name: ");
        name = input.next();
        System.out.print(name + ", how much money do you have to gamble today?: $");
        money = input.nextInt();
        int orgMoney = money;
        System.out.println("Excellent, " + name + ". Here are the rules of the game we will play: \n");
        System.out.println(" 1. Place a bet. \n 2. I, the computer, will roll two dice. \n 3. if the sum of the dice is 7 or 11, you win double your bet. \n 4. If the sum of the dice is 2,3, or 12, then you push (neither win or lose). \n 5. If the sum of the dice is 4, 5, 6, 8, 9 or 10, then you lose your bet. \n");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        String playAgain = "yes";

        System.out.print("Ok, lets begin. ");

        while (playAgain.equals("yes")) {

            System.out.print("How much would you like to bet?: $");
            bet = input.nextInt();
            while (bet > money) {
                System.out.print("Please enter a value less than the amount of money you have! (you have " + money + "): $");
                bet = input.nextInt();
            }
            die1 = generator.nextInt(6) + 1;
            die2 = generator.nextInt(6) + 1;
            System.out.println("die 1: " + die1);
            System.out.println("die 2: " + die2);
            diceSum = die1 + die2;

            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\nsum of the dice: " + diceSum);

            if (diceSum == 7 || diceSum == 11) {
                System.out.println("\nWell done! you have doubled your bet!");
                money = (bet * 2) + money;
                System.out.println("You now have $" + money);
            }

            if (diceSum == 2 || diceSum == 3 || diceSum == 12) {
                System.out.println("\nYou have pushed! You neither win or lose.");
                System.out.println("You now have $" + money);
            }

            if (diceSum == 4 || diceSum == 5 || diceSum == 6 || diceSum == 8 || diceSum == 9 || diceSum == 10) {
                System.out.println("\nOh no! You have lost your bet!");
                money = money - bet;
                System.out.println("You now have $" + money);
            }

            if (money == 0) {
                System.out.println("You are now bankrupt. Thank you for playing!");
                System.exit(1);
            }
            System.out.print("\nWould you like to keep betting? (yes/no): ");
            playAgain = input.next();


            if (playAgain.equals("yes")) {
                System.out.print("\nOk, lets continue. ");
            }
        }
        System.out.println("\nThank you for playing! You leave with $" + money);
        int moneyDifference = orgMoney - money;
        if (money > orgMoney) {
            moneyDifference = Math.abs(-moneyDifference);
            change = "more";
        }
        else {
            change = "less";
        }
        System.out.println("That's $" + moneyDifference + " " + change + " than you started with.");
    }
}