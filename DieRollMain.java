public class DieRollMain {

    public static void main(String [] args) {
        Die1 Die1Object = new Die1();
        Die2 Die2Object = new Die2();
        DiceSum DSObject = new DiceSum();
        CrapsGameplay CGPObject = new CrapsGameplay();
        BankSum BSObject = new BankSum();

        int bank = 1000;
        int n1 = Die1Object.firstNumber();
        int n2 = Die2Object.secondNumber();
        int sum = DSObject.addDice(n1, n2);
        System.out.print("You have $" + bank + " to bet.");
        bank = BSObject.amtMoney(sum, bank);
        System.out.println("die 1 = " + n1);
        System.out.println("die 2 = " + n2);
        System.out.println("die sum = " + sum);
        CGPObject.basicCraps(sum);
        System.out.println("You have $" + bank + " to bet with.");
    }
}
