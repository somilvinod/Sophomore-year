import java.util.ArrayList;

public class AddRemoveWar {

    public void addRemoveWar(ArrayList<Integer> hand1, ArrayList<Integer> hand2, ArrayList<Integer> chest) {


        if (hand1.size() < 5) {
            System.out.println("Player 1 doesn't have enough cards for war!");
            System.out.println("Player 2 wins the game!");
            System.exit(1);
        }

        if (hand2.size() < 5) {
            System.out.println("Player 2 doesn't have enough cards for war!");
            System.out.println("Player 1 wins the game!");
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
}
