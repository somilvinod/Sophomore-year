// Somil Vinod
import java.util.Scanner;

public class PascalsTriangleSomilVinod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many rows of pascals triangle do you want?: ");
        int rows = input.nextInt();
        long n, r;
        String padded = String.format("%-5s", " "); // I tried this and it didn't really work but it looks kinda nice so i'm keeping it!

        if (rows == 0) {
            System.out.print(" ");
            System.exit(0);
        }
        else if (rows < 0)
            System.out.print("Sorry, this isn't possible!");

        for (n = 0; n < rows; n++) {


            for (r = 0; r <= n; r++) {

                System.out.print(padded + combRecursive(n) / (combRecursive(n - r) * combRecursive(r))+ " ");

            }

            System.out.println();

        }
    }

    public static long combRecursive(long i) {
        if (i == 1 || i == 0)
            return 1;
        else
            return i * combRecursive((i - 1));

    }
}

