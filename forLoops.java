public class forLoops {

    public static void main (String [] args) {
        int sum = 0;
        for (int outer = 1; outer < 11; outer++) {

            for(int inner =1; inner < 6; inner++) {

                sum = sum + inner + outer;

                System.out.println(outer + "     " + inner + "     " + sum);
            }
        }
    }
}
