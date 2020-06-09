// Somil Vinod, Project #1, This program will convert numbers

import java.util.Scanner;
import java.text.DecimalFormat;
public class MemoryConv {

        public static void main(String [] args) {
            while(true) {

                DecimalFormat df = new DecimalFormat("0");
                DecimalFormat df2 = new DecimalFormat("0.0000000000000");

                Scanner myObj = new Scanner(System.in);
                System.out.println("Enter memory unit you would like to convert (TB, GB, MB, KB, B, b): ");
                String whichUnit = myObj.nextLine();
                System.out.println("Enter the number of " + whichUnit + " you would like to convert: " );
                Double numberUnit = myObj.nextDouble();

                if (whichUnit.equals("TB")) { //complete
                    System.out.println(numberUnit + " Terabytes(s) is equivalent to " + df2.format(numberUnit * 1024) + " gigabytes");
                    System.out.println(numberUnit + " Terabytes(s) is equivalent to " + df2.format(numberUnit * 1024 * 1024) + " megabytes");
                    System.out.println(numberUnit + " Terabytes(s) is equivalent to " + df2.format(numberUnit * 1024 * 1024 * 1024) + " kilobytes");
                    System.out.println(numberUnit + " Terabytes(s) is equivalent to " + df2.format(numberUnit * 1024 * 1024 * 1024 * 1024) + " bytes");
                    System.out.println(numberUnit + " Terabytes(s) is equivalent to " + df2.format(numberUnit * 1024 * 1024 * 1024 * 1024 * 8) + " bits");
                }

                if (whichUnit.equals("GB")) { //complete
                    System.out.println(numberUnit + " Gigabytes(s) is equivalent to " + df2.format(numberUnit / 1024) + " terabytes");
                    System.out.println(numberUnit + " Gigabytes(s) is equivalent to " + df2.format(numberUnit * 1024) + " megabytes");
                    System.out.println(numberUnit + " Gigabytes(s) is equivalent to " + df2.format(numberUnit * 1024 * 1024) + " kilobytes");
                    System.out.println(numberUnit + " Gigabytes(s) is equivalent to " + df2.format(numberUnit * 1024 * 1024 * 1024) + " bytes");
                    System.out.println(numberUnit + " Gigabytes(s) is equivalent to " + df2.format(numberUnit * 1024 * 1024 * 1024 *  8) + " bits");
                }

                if (whichUnit.equals("MB")) { //complete
                    System.out.println(numberUnit + " Megabytes(s) is equivalent to " + df2.format(numberUnit / (1024 * 1024)) + " terabytes");
                    System.out.println(numberUnit + " Megabytes(s) is equivalent to " + df2.format(numberUnit / 1024) + " gigabytes");
                    System.out.println(numberUnit + " Megabytes(s) is equivalent to " + df2.format(numberUnit * 1024) + " kilobytes");
                    System.out.println(numberUnit + " Megabytes(s) is equivalent to " + df2.format(numberUnit * 1024 * 1024) + " bytes");
                    System.out.println(numberUnit + " Megabytes(s) is equivalent to " + df2.format(numberUnit * 1024 * 1024 * 8) + " bits");
                }

                if (whichUnit.equals("KB")) { //complete
                    System.out.println(numberUnit + " Kilobytes(s) is equivalent to " + df2.format(numberUnit / (1024 * 1024 * 1024)) + " terabytes");
                    System.out.println(numberUnit + " Kilobytes(s) is equivalent to " + df2.format(numberUnit / (1024 * 1024)) + " gigabytes");
                    System.out.println(numberUnit + " Kilobytes(s) is equivalent to " + df2.format(numberUnit / 1024) + " megabytes ");
                    System.out.println(numberUnit + " Kilobytes(s) is equivalent to " + df2.format(numberUnit * 1024 * 1024) + " bytes");
                    System.out.println(numberUnit + " Kilobytes(s) is equivalent to " + df2.format(numberUnit * 1024 * 1024 * 8)  + " bits");
                }

                if (whichUnit.equals("B")) {
                    System.out.println(numberUnit + " Bytes(s) is equivalent to " + df2.format(numberUnit / (1024 * 1024 * 1024 * 1024)) + " terabytes");
                    System.out.println(numberUnit + " Bytes(s) is equivalent to " + df2.format(numberUnit / (1024 * 1024 * 1024)) + " gigabytes");
                    System.out.println(numberUnit + " Bytes(s) is equivalent to " + df2.format(numberUnit / (1024 * 1024)) + " megabytes");
                    System.out.println(numberUnit + " Bytes(s) is equivalent to " + df2.format(numberUnit / 1024) + " kilobytes");
                    System.out.println(numberUnit + " Bytes(s) is equivalent to " + df2.format(numberUnit * 8)  + " bits");
                }

                if (whichUnit.equals("b")) {
                    System.out.println(numberUnit + " Bits(s) is equivalent to " + df2.format(numberUnit / (1024 * 1024 * 1024 * 1024 * 1024)) + " terabytes");
                    System.out.println(numberUnit + " Bits(s) is equivalent to " + df2.format(numberUnit / (1024 * 1024 * 1024 * 1024)) + " gigabytes");
                    System.out.println(numberUnit + " Bits(s) is equivalent to " + df2.format(numberUnit / (1024 * 1024 * 1024)) + " megabytes");
                    System.out.println(numberUnit + " Bits(s) is equivalent to " + df2.format(numberUnit / (1024 * 1024)) + " kilobytes");
                    System.out.println(numberUnit + " Bits(s) is equivalent to " + df2.format(numberUnit / 1024) + " bytes");
                }
                System.out.println("Would you like to continue converting? (yes/no): ");
                String yesNo = myObj.next();
                if (yesNo.equals("no")) {
                    System.out.println("Process complete! Thank you!");
                    break;
                }
        }
    }

}


