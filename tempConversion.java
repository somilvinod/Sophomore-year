import java.util.Scanner;
public class tempConversion {

    public static void main(String [] args) {
        Scanner myObj= new Scanner(System.in);

        String response = "yes";
        while (response.equals("yes")) {

            System.out.println("Would you like to convert (CtoF) or (FtoC)?: ");
            String temp = myObj.nextLine();

            if (temp.equals("FtoC")) {
                System.out.println("Enter a fahrenheit temperature: ");
                double fahrenheit = myObj.nextDouble();
                double celsius = (.5555555) * (fahrenheit - 32);
                System.out.println(fahrenheit + " degrees fahrenheit is equal to " + celsius + " degrees celsius");
            }

                if (temp.equals("CtoF")) {
                    System.out.println("Enter a celsius temperature: ");
                    double celsius2 = myObj.nextDouble();
                    double fahrenheit2 = (celsius2 * 9 / 5) + 32;
                    System.out.println(celsius2 + " degrees is equal to " + fahrenheit2 + " degrees fahrenheit");
                }

                    System.out.println("Do you want to continue converting? (y/n): ");
                    String contloop = myObj.nextLine();

                    if (contloop.equals("y")) {
                        continue;
                    }

                    if (contloop.equals("n")) {
                        break;
                    }


            }

        }

    }

