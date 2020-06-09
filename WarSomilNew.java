import javafx.concurrent.ScheduledService;

import java.util.ArrayList;
import java.util.Random;

public class WarSomilNew {


    public static void main(String[] args) {
        ArrayList<Integer> deck = new ArrayList<Integer>();
        ArrayList<Integer> player1Deck = new ArrayList<Integer>();
        ArrayList<Integer> player2Deck = new ArrayList<Integer>();
        ArrayList<Integer> warChest = new ArrayList<Integer>();

        shuffleAndDistribute(player1Deck, player2Deck, deck);

        //preliminary code complete


        int r = 0;

        while (player1Deck.size() >= 1 && player2Deck.size() >= 1) {

            Boolean warHappened = false;
            r++;
            System.out.println("Round " + r);

            System.out.println("Player 1 deck: " + player1Deck);
            System.out.println("Player 2 deck: " + player2Deck + "\n");


            while (player1Deck.get(0) == player2Deck.get(0)) {

                warHappened = true;
                addRemoveWar(player1Deck, player2Deck, warChest);

            }

            if (!warHappened) {

                addRemove(player1Deck, player2Deck);

            }
        }
    }


// MAIN METHOD COMPLETE



    public static void shuffleAndDistribute (ArrayList<Integer> hand1, ArrayList<Integer> hand2, ArrayList<Integer> mainDeck) {

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


    public static void addRemoveWar(ArrayList<Integer> hand1, ArrayList<Integer> hand2, ArrayList<Integer> chest) {
        if (hand1.size() < 5) {
            System.out.println("Player 1 doesn't have enough cards for war!");
            System.exit(1);
        }

        if (hand2.size() < 5) {
            System.out.println("Player 2 doesn't have enough cards for war!");
            System.exit(1);
        }

        for (int k = 0; k < 4; k++) {
            chest.add(hand1.remove(0));
            chest.add(hand2.remove(0));
        }

        System.out.println(chest);

        int lengthWarchest = chest.size();

        if (hand1.get(0) > hand2.get(0)) {
            for (int a = 0; a < lengthWarchest; a++) {
                hand1.add(chest.remove(0));
            }
            System.out.println("Player 1 won the war!\n");
        }
        else {
            for (int b = 0; b < lengthWarchest; b++) {
                hand2.add(chest.remove(0));
            }
            System.out.println("Player 2 won the war!\n");

        }
    }


    public static void addRemove(ArrayList<Integer> hand1, ArrayList<Integer> hand2) {
        if (hand1.get(0) > hand2.get(0)) {
            hand1.add(hand2.remove(0));
            hand1.add(hand1.remove(0));

        } else {
            hand2.add(hand1.remove(0));
            hand2.add(hand2.remove(0));

        }
    }
}



