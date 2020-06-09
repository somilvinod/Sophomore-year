//Somil Vinod

import java.util.Scanner;
public class MuscleCarsMain {

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        MustangClass MstgObject = new MustangClass();
        CamaroClass CamObject = new CamaroClass();
        ChallengerClass ChallObject = new ChallengerClass();
        CorvetteClass CorvObject = new CorvetteClass();

        System.out.print("Choose the car you wish to purchase (Mustang, Camaro, Corvette, Challenger): ");
        String choice = input.next();
        if (choice.equals("Mustang")) {
            System.out.println("Mustang: " + MstgObject.transmission() + ", " + MstgObject.roof() + ", " + MstgObject.pack() + ", " + MstgObject.color() + ", $" + MstgObject.cost());
        }
        if (choice.equals("Camaro")) {
            System.out.println("Camaro: " + CamObject.transmission() + ", " + CamObject.roof() + ", " + CamObject.pack() + ", " + CamObject.color() + ", $" + CamObject.cost());
        }
        if (choice.equals("Corvette")) {
            System.out.println("Corvette: " + CorvObject.transmission() + ", " + CorvObject.roof() + ", " + CorvObject.pack() + ", " + CorvObject.color() + ", $" + CorvObject.cost());
        }
        if (choice.equals("Challenger")) {
            System.out.println("Challenger: " + ChallObject.transmission() + ", " + ChallObject.roof() + ", " + ChallObject.pack() + ", " + ChallObject.color() + ", $" + ChallObject.cost());
        }
    }
}
