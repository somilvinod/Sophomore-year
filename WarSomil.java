import java.util.ArrayList;
import java.util.Random;

public class WarSomil {

    public static void main(String[] args) {
        ArrayList<Integer> deck = new ArrayList<Integer>();
        ArrayList<Integer> player1Deck = new ArrayList<Integer>();
        ArrayList<Integer> player2Deck = new ArrayList<Integer>();
        ArrayList<Integer> warChest = new ArrayList<Integer>();


        for (int i = 2; i <= 14; i++) {

            deck.add(i);
            deck.add(i);
            deck.add(i);
            deck.add(i);

        }

        System.out.println(deck);

        Random generator = new Random();

        for (int j = 0; j < 2*deck.size(); j++) {
            int shuffle = generator.nextInt(51);
            int temp = deck.get(0);
            deck.remove(deck.get(0));
            deck.add(deck.get(shuffle));
            deck.add(shuffle, temp);
            deck.remove(deck.get(shuffle+1));
        }

        System.out.println(deck);

        for(int m = 0; m < deck.size(); m+=2) {
            player1Deck.add(deck.get(m));
            player2Deck.add(deck.get(m + 1));
        }


        //preliminary code complete


        int r = 0;

        while (player1Deck.size() >= 1 && player2Deck.size() >= 1) {
            Boolean warHappened = false;
            r++;
            System.out.println("Round " + r);

            System.out.println("Player 1 deck: " + player1Deck);
            System.out.println("Player 2 deck: " + player2Deck +"\n");


            while (player1Deck.get(0) == player2Deck.get(0)) {

                if (player1Deck.size() < 5) {
                    System.out.println("Player 1 doesn't have enough cards for war!");
                    System.exit(1);
                }

                if (player2Deck.size() < 5) {
                    System.out.println("Player 2 doesn't have enough cards for war!");
                    System.exit(1);
                }

                warHappened = true;
                warChest.add(player1Deck.remove(0));
                warChest.add(player1Deck.remove(0));
                warChest.add(player1Deck.remove(0));
                warChest.add(player1Deck.remove(0));

                warChest.add(player2Deck.remove(0));
                warChest.add(player2Deck.remove(0));
                warChest.add(player2Deck.remove(0));
                warChest.add(player2Deck.remove(0));

                System.out.println("\nwar chest: " + warChest);

                int lengthWarchest = warChest.size();

                if (player1Deck.get(0) > player2Deck.get(0)) {


                    for (int a = 0; a < lengthWarchest; a++ ) {
                        player1Deck.add(warChest.remove(0));
                    }
                    System.out.println("Player 1 won the war!\n");
                }

                else {

                    for (int b = 0; b < lengthWarchest; b++ ) {
                        player2Deck.add(warChest.remove(0));
                    }
                    System.out.println("Player 2 won the war!\n");

                }

            }

            if (!warHappened) {

                if (player1Deck.get(0) > player2Deck.get(0)) {
                    player1Deck.add(player2Deck.remove(0));
                    player1Deck.add(player1Deck.remove(0));
                }

                else {
                    player2Deck.add(player1Deck.remove(0));
                    player2Deck.add(player2Deck.remove(0));
                }

            }




        }

    }
}
