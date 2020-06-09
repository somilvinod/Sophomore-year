import java.util.ArrayList;

public class AddRemove {

    public void addRemove(ArrayList<Integer> hand1, ArrayList<Integer> hand2) {
        if (hand1.get(0) > hand2.get(0)) {
            hand1.add(hand2.remove(0));
            hand1.add(hand1.remove(0));

        }
        else {
            hand2.add(hand1.remove(0));
            hand2.add(hand2.remove(0));

        }
    }
}
