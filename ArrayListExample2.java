import java.util.ArrayList;

public class ArrayListExample2 {

    public static void main (String [] args) {

        ArrayList<String> sample = new ArrayList<>();
        System.out.println(sample.size());
        sample.add("Moe");
        System.out.println(sample);
        System.out.println(sample.size());
        sample.add("Curly");

        String [] [] m = new String[6][3];

        System.out.println(m.length);

        sample.get(1);


    }
}
