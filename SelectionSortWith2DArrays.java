public class SelectionSortWith2DArrays {

    public static void main(String[] args) {

        String[][] array = {{"Ziggy", "Jones", "15"}, {"Bif", "Smith", "11"}, {"Barb", "Smith", "11"}, {"Buffy", "Smurf", "12"}};

        System.out.println("Values before the sort: ");

        printMethod(array);
        selection2DMethod(array);
        System.out.println();

        System.out.println("Values after the sort: ");
        printMethod(array);
    }

    public static void selection2DMethod (String [][] a){
        for (int r = 0; r < a.length-1; r++) {
            int smallestIndex = r;
            for (int c = r + 1; c <= a.length-1; c++) {
                if (a[smallestIndex][0].compareTo(a[c][0]) > 0) {
                    smallestIndex = c;
                }
            }
            swap(a, smallestIndex, r, 0);
            swap(a, smallestIndex, r, 1);
            swap(a, smallestIndex, r, 2);
        }
    }


    public static void swap (String [][] a, int smallestIndex, int r, int z) {
        String temp = a[r][z];
        a[r][z] = a[smallestIndex][z];
        a[smallestIndex][z]=temp;
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
}
