public class CrapsGameplay {

    Die1 Die1Object = new Die1();
    Die2 Die2Object = new Die2();
    DiceSum DSObject = new DiceSum();

    public void basicCraps (int sum) {
        if(sum == 7 || sum == 11)
            System.out.println("You rolled " + sum + ". You win!");
        else if(sum == 2 || sum == 3 || sum == 12)
            System.out.println("You rolled " + sum + ". You lose!");
        else {
            System.out.println("You rolled " + sum + ". This is your point for the game!");
        int point = sum;
        int n1 = Die1Object.firstNumber();
        int n2 = Die2Object.secondNumber();
        sum = DSObject.addDice(n1, n2);
        System.out.println("Die 1 = " + n1);
        System.out.println("Die 2 = " + n2);
        System.out.println("Dicesum = " + sum);
        if (point == sum)
            System.out.println("You win!");
        else if (sum == 7)
            System.out.println("You lose!");
        }
    }

}

