import java.util.Scanner;
public class CorvetteClass {

    int addCost = 0;
    Scanner input = new Scanner(System.in);
    public String transmission() {
        System.out.print("Choose your transmission (auto or manual): ");
        String tranny = input.next();
        if (tranny.equals("auto")) {
            addCost = addCost + 2750;
        }
        return tranny;
    }
    public String roof() {
        System.out.print("Choose body style (hardtop or convertible): ");
        String body = input.next();
        if(body.equals("convertible")) {
            addCost = addCost + 3000;
        }
        return body;
    }
    public String pack() {
        System.out.print("Choose trim package (anniversary) addition only: ");
        String pack = input.next();
            addCost = addCost + 5000;
        return pack;
    }
    public String color() {
        System.out.print("Choose car color (red, white, or blue): ");
        String color = input.next();
        if(color.equals("white")) {
            addCost = addCost + 677;
        }
        return color;
    }
    public int cost() {
        int cost = 40000;
        return cost + addCost;
    }

}