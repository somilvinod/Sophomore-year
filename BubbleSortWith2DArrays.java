public class BubbleSortWith2DArrays {

    public static void main(String[] args) {

        String[][] array = {{"Ziggy", "Jones", "15"}, {"Bif", "Smith", "11"}, {"Barb", "Smith", "11"}, {"Buffy", "Smurf", "12"}};

        System.out.println("Values before the sort: ");

        printMethod(array);
        bubble2DMethod(array);
        System.out.println();

        System.out.println("Values after the sort: ");
        printMethod(array);
    }

    public static void bubble2DMethod(String[][] a) {
        for (int c = 0; c < a[0].length - 1; c++) {
            for (int r = 0; r < (a.length - 1 - c); r++) {
                if (a[r][0].compareTo(a[r + 1][0]) > 0) {
                    swap(a, r, 1);
                    swap(a, r, 2);
                    swap(a, r, 3);
                }
            }
        }
    }

    public static void printMethod(String[][] a) {
        for (int r = 0; r < a.length; r++)
            for(int c = 0; c < a[0].length; c++){
                if (c != a[0].length-1)
                    System.out.print(a[r][c] + " ");
                else {
                    System.out.print(a[r][c] + " ");
                    System.out.println(" ");
                }
            }
    }

    public static void swap (String [][] a, int w, int z) {
        String temp = a[w+1][z];
        a[w+1][z] = a[w][z];
        a[w][z]=temp;
    }

}
