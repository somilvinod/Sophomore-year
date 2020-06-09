
import java.util.Scanner;

public class FactorialMethodsSomil
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String playAgain = "yes";
        while (playAgain.equals("yes"))
        {
            System.out.print("Would you like to compute a factorial recursively or implicitly: ");
            String whichWay = input.next( );

            if (whichWay.equals("implicitly"))
            {
                long i, product = 1;
                System.out.print("input an integer (<= 20): ");
                i = input.nextLong();
                System.out.print(i + "! = ");
                while(i > 0)
                {
                    if(i == 1)
                    {
                        System.out.print(i + " = " + product);
                        System.out.println(" ");
                    }
                    else
                        System.out.print(i + " * ");
                    product = product * i;
                    i--;
                }
            }
            if(whichWay.equals("recursively"))
            {
                long i;
                System.out.print("input an integer (<= 20): ");
                i = input.nextLong();
                System.out.println(factorial(i) + " = " + i + "!");
            }

            System.out.print("\n");
            System.out.print("Would you like to calculate another factorial? (yes or no): ");
            playAgain = input.next( );
        }
    }


    public static long factorial( long n )
    {
        if(n <= 1)
        {
            System.out.print(n + " = ");
            return 1;
        }
        else
        {
            System.out.print(n + " * ");
            return n * factorial(n - 1);
        }
    }
}



