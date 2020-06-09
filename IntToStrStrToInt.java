public class IntToStrStrToInt {

    public static void main (String [] args) {

        int x = 100;
        String x2 = Integer.toString(x);
        System.out.println(x + 100);
        System.out.println(x2 + 100);

        double y = 100.5;
        String y2 = Double.toString(y);
        System.out.println(y + 100);
        System.out.println(y2 + 100);

        String z = "50";
        int z2 = Integer.parseInt(z);
        System.out.println(z + 100);
        System.out.println(z2 + 100);

        String w = "50";
        double w2 = Double.parseDouble(w);
        System.out.println(w + 100);
        System.out.println(w2 + 100);

    }
}
