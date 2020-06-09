import java.util.Scanner;
public class MustangClass {

    int addCost = 0;
    Scanner input = new Scanner(System.in);
    public String transmission() {
        System.out.print("Choose your transmission (auto or manual): ");
        String tranny = input.next();
        if (tranny.equals("auto")) {
            addCost = addCost + 500; // YOU MAY NEED { } HERE FOR THIS IF STATEMENT
        }
        return tranny;
    }
    public String roof() {
        System.out.print("Choose body style (hardtop or convertible): ");
        String body = input.next();
        if(body.equals("convertible")) {
            addCost = addCost + 5000;
        }
        return body;
    }
    public String pack() {
        System.out.print("Choose trim package (GT or Shelby): ");
        String pack = input.next();
        if (pack.equals("GT")) {
            addCost = addCost + 5000;
        }
        if(pack.equals("Shelby")) {
            addCost = addCost + 20000;
        }
        return pack;
        }
    public String color() {
        System.out.print("Choose car color (red, white, or blue): ");
        String color = input.next();
        if(color.equals("red")) {
            addCost = addCost + 500;
        }
        return color;
    }
    public int cost() {
        int cost = 22500;
        return cost + addCost;
    }

}
