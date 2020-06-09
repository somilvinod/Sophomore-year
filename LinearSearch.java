import java.util.Scanner;

public class LinearSearch {
    public static void main (String args []) {
        String array [] = {"Bob", "Sue", "Ann", "Kip", "Cat", "Bud"};
        System.out.println("Data Values:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a name: ");
        String name = input.next();
        String test = "false";
        int i;
        for (i = 0; i < array.length; i++) {
            if(name.equals(array[i])) {
                System.out.println("The name " + name + " is located at index " + (i) + " in the list");
                test = "true";
            }
        }
        if(test.equals("false"))
            System.out.println("The name" + name + " is not in the list");
    }

}