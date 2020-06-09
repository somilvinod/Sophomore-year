import java.util.Random;
public class Die2 {

        public int secondNumber() {
            Random generator = new Random();
            int x = generator.nextInt(6)+1;
            return x;

        }
    }

