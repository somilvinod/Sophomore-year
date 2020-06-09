public class moneywithforloops {

    public static void main (String[] args) {

        int money;
        for(int dimes = 1; dimes <= 5; dimes++) {

            for(int nickels = 1; nickels <= 5; nickels++) {

                for(int pennies = 1; pennies <= 5; pennies++)

                {
                    money = 10 * dimes + 5 * nickels + pennies;
                    System.out.println(dimes + " " + nickels + " " + pennies + " " + money);
                }
            }
        }
    }
}
