import java.util.Scanner;

public class Permutations {

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Compute the number of permutations of n objects taken r at a time ");
        System.out.print("Enter n: ");
        long n, r;
        n = input.nextLong();
        System.out.print("Enter r: ");
        r = input.nextLong();
        System.out.println(permRecursive(n) / permRecursive(n - r));
    }

    public static long permRecursive(long i) {
        if(i == 1 || i == 0)
            return 1;
        else
            return i*permRecursive((i-1));

    }
}
