import java.lang.reflect.Array;
import java.util.ArrayList;

public class AnotherMethodExample {

    public static void main (String [] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list2.add(0);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("List 1 - " + list1);
        System.out.println("List 2 - " + list2);
        addRemove(list1, list2);
        System.out.println("List 1 - " + list1);
        System.out.println("List 2 - " + list2);
        addRemove(list2, list1);
        System.out.println("List 1 - " + list1);
        System.out.println("List 2 - " + list2);

    }

    public static void addRemove (ArrayList<Integer> hand1, ArrayList<Integer> hand2) {
        hand1.add(hand2.remove(0));
        hand1.add(hand1.remove(0));
    }
}
