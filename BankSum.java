import java.util.Scanner;
public class BankSum {

    Scanner input = new Scanner(System.in);

    public int amtMoney(int sum, int bank) {
        System.out.print("How much do you want to bet?: ");
        int bet = input.nextInt();
        if (sum == 7 || sum == 11) {
            bank = bank + bet;
        }
        else if (sum == 2 || sum == 3 || sum == 12) {
            bank = bank - bet;
        }
        return bank;
    }
}


