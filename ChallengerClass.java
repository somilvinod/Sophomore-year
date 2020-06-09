import java.util.Scanner;
public class ChallengerClass {

    int addCost = 0;
    Scanner input = new Scanner(System.in);
    public String transmission() {
        System.out.print("Choose your transmission (auto or manual): ");
        String tranny = input.next();
        if (tranny.equals("auto")) {
            addCost = addCost + 1500;
        }
        return tranny;
    }
    public String roof() {
        System.out.print("Choose body style (hardtop or convertible): ");
        String body = input.next();
        if(body.equals("convertible")) {
            addCost = addCost + 4000;
        }
        return body;
    }
    public String pack() {
        System.out.print("Choose trim package (Hellcat or SRT): ");
        String pack = input.next();
        if (pack.equals("Hellcat")) {
            addCost = addCost + 10000;
        }
        if(pack.equals("SRT")) {
            addCost = addCost + 12000;
        }
        return pack;
    }
    public String color() {
        System.out.print("Choose car color (red, white, or blue): ");
        String color = input.next();
        if(color.equals("red")) {
            addCost = addCost + 999;
        }
        return color;
    }
    public int cost() {
        int cost = 32000;
        return cost + addCost;
    }

}
