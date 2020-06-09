import java.util.Random;

public class Die1 {

    public int firstNumber() {
        Random generator = new Random();
        int x = generator.nextInt(6)+1;
        return x;

    }
}
