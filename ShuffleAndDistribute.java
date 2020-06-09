import java.util.ArrayList;
import java.util.Random;

public class ShuffleAndDistribute {

    public void shuffleAndDistribute (ArrayList<Integer> hand1, ArrayList<Integer> hand2, ArrayList<Integer> mainDeck) {

        for (int i = 2; i <= 14; i++) {

            mainDeck.add(i);
            mainDeck.add(i);
            mainDeck.add(i);
            mainDeck.add(i);

        }

        System.out.println(mainDeck);

        Random generator = new Random();

        for (int j = 0; j < 2 * mainDeck.size(); j++) {
            int shuffle = generator.nextInt(51);
            int temp = mainDeck.get(0);
            mainDeck.remove(mainDeck.get(0));
            mainDeck.add(mainDeck.get(shuffle));
            mainDeck.add(shuffle, temp);
            mainDeck.remove(mainDeck.get(shuffle + 1));
        }

        System.out.println(mainDeck + "\n");

        for (int m = 0; m < mainDeck.size(); m += 2) {
            hand1.add(mainDeck.get(m));
            hand2.add(mainDeck.get(m + 1));
        }

    }
}
