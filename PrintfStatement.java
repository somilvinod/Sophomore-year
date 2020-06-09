import java.util.Scanner;
public class PrintfStatement {

    public static void main (String [] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("What is your first name? : ");
        String fname = input.next();
        System.out.print("What is your last name? : ");
        String lname = input.next();
        System.out.print("Enter your uniform number: ");
        int number = input.nextInt();
        System.out.print("Enter your shoe size: ");
        double shoesize = input.nextDouble();

        System.out.printf("%-15s%-15s%-12s%-15s\n", "First Name", "Last Name", "Number", "Shoe Size");
        System.out.printf("%-15s%-15s%-12s%-15s\n", "----------", "---------", "------", "---------");
        System.out.printf("%-15s%-15s%-12s%-15.2f\n", fname, lname, number, shoesize);

        Double x = 5.64E-13;


    }
}
