import java.util.Scanner;
public class MakeChangeSomilVinod {

    public static void main(String[] args) {

        int p, n, d, q;
        int representations = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many cents would you like to convert?: ");
        int cents = input.nextInt();
        for (q = 0; 25*q <= cents; q++) {
            for (d = 0; 10*d <= cents; d++) {
                for (n = 0; 5*n <= cents; n++) {
                    for (p = 0; p <= cents; p++) {
                        if ((25 * q) + (10 * d) + (5 * n) + (p) == cents) {
                            System.out.println(cents + " cents = " + q + " quarters + " + d + " dimes " + n + " nickels + " + p + " pennies");
                            representations = representations + 1;
                        }

                    }

                    }

                }

            }
        System.out.println("There are " + representations + " ways you can represent " + cents + " cents!");
        }
    }

