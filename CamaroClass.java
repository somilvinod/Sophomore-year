import java.util.Scanner;
public class CamaroClass {

    int addCost = 0;
    Scanner input = new Scanner(System.in);

    public String transmission() {
        System.out.print("Choose your transmission (auto or manual): ");
        String tranny = input.next();
        if (tranny.equals("auto")) {
            addCost = addCost + 1000;
        }
        return tranny;
    }

    public String roof() {
        System.out.print("Choose body style (hardtop or convertible): ");
        String body = input.next();
        if (body.equals("convertible")) {
            addCost = addCost + 2500;
        }
        return body;
    }

    public String pack() {
        System.out.print("Choose trim package (IRock or Z28): ");
        String pack = input.next();
        if (pack.equals("IRock")) {
            addCost = addCost + 2500;
        }
        if (pack.equals("Z28")) {
            addCost = addCost + 7500;
        }
        return pack;
    }

    public String color() {
        System.out.print("Choose car color (red, white, or blue): ");
        String color = input.next();
        if (color.equals("blue")) {
            addCost = addCost + 250;
        }
        return color;
    }

    public int cost() {
        int cost = 25000;
        return cost + addCost;
    }

}

