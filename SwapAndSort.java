public class SwapAndSort {

    public static void main (String [] args) {

        System.out.println("2 Names");
        String [] names = {"Sarah", "Sal"};
        for(int i = 0; i < names.length; i++)
            System.out.println(names[i]);

        System.out.println(" ");
        System.out.println("2 names swapped");

        // 3 lines of code will swap 2 values in an array.

        String temp = names [0];
        names [0] = names [1];
        names [1] = temp;

        for(int i = 0; i < names.length; i++)
            System.out.println(names[i]);

        System.out.println(" ");
        System.out.println("Names list");
        String [] names2 = {"Sarah", "Sal", "Bill", "Sue", "Ann"};

        //bubble sort

        for (int j = 0; j < names2.length - 1; j++)
            for (int k = 0; k < names2.length; k++)
                if(names2[k].compareTo(names2[k+1]) > 0){
                    String temp2 = names2 [k];
                    names2 [k] = names2 [k + 1];
                    names2 [k + 1] = temp2;
                }

        System.out.println(" ");
        System.out.println("names list in alphabetical order");
        for(int i = 0; i < names2.length; i++)
            System.out.print(names2[i] + " ");
    }
}
