import java.util.ArrayList;

public class EndGame {

    public void EndGame (ArrayList<Integer> hand1, ArrayList<Integer> hand2, int r) {

        if (hand1.size() > hand2.size()) {

            WarSomilClassesAndMethods.r++;

            System.out.println("Round " + WarSomilClassesAndMethods.r);

            System.out.println("Player 1 deck: " + hand1);
            System.out.println("Player 2 deck: " + hand2 + "\n");

            System.out.println("Player 1 wins the game!");

        }

        else {

            WarSomilClassesAndMethods.r++;

            System.out.println("Round " + WarSomilClassesAndMethods.r);

            System.out.println("Player 1 deck: " + hand1);
            System.out.println("Player 2 deck: " + hand2 + "\n");

            System.out.println("Player 2 wins the game!");

        }
    }
}
