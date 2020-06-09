import java.util.ArrayList;

public class WarMain {

    public void WarMain (ArrayList<Integer> hand1, ArrayList<Integer> hand2, ArrayList<Integer> warChest) {
        AddRemoveWar addRemoveWarObj = new AddRemoveWar();
        AddRemove addRemoveObj = new AddRemove();

        WarSomilClassesAndMethods.r = 0;


        while (hand1.size() >= 1 && hand2.size() >= 1) {

            Boolean warHappened = false;
            WarSomilClassesAndMethods.r++;
            System.out.println("Round " + WarSomilClassesAndMethods.r);

            System.out.println("Player 1 deck: " + hand1);
            System.out.println("Player 2 deck: " + hand2 + "\n");


            while (hand1.get(0) == hand2.get(0)) {
                warHappened = true;
                addRemoveWarObj.addRemoveWar(hand1, hand2, warChest);
            }

            if (!warHappened)
                addRemoveObj.addRemove(hand1, hand2);

        }
    }
}
