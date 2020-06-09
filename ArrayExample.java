public class ArrayExample {

    public static void main (String [] args) {

        int [] numbers = {1, 45, 67, 34, 18, 2};
        String [] names = {"Ben", "Carson", "Max", "Somil", "Ethan"};

        System.out.println(numbers[]);
        System.out.println(names[1]);

        for(int i = 0; i < names.length; i++)
            System.out.print(names[i] + " ");
        int [] stuff = new int[6];
        System.out.println(" ");

        for(int i=0; i < stuff.length; i++)
            System.out.print(stuff[i] + " ");

        String [] moreStuff = new String [6];
        System.out.println(" ");
        for(int i=0; i < moreStuff.length; i++)
            System.out.print(moreStuff[i] + " ");


    }
}
