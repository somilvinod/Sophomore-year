public class InsertionSortWith2DArray {

    public static void main(String[] args) {

        int x = 0, y = 1, z = 2;
        String[][] array = {{"Ziggy", "Jones", "15"}, {"Bif", "Smith", "11"}, {"Barb", "Smith", "11"}, {"Buffy", "Smurf", "12"}};

        System.out.println("Values before the sort: ");

        printMethod(array);
        insertion2DMethod(array, x, y, z);
        System.out.println();

        System.out.println("Values after the sort: ");
        printMethod(array);
    }

    public static void insertion2DMethod (String a [][], int x, int y, int z) {
        for (int r = 1; r < a.length; r++) {
            String temp = a[r][x];
            String temp2 = a[r][y];
            String temp3 = a[r][z];
            int pos = r - 1;

            while ((pos >= 0) && (temp.compareTo(a[pos][x]) < 0)) {
                a[pos+1][x] = a[pos][x];
                a[pos+1][y] = a[pos][y];
                a[pos+1][z] = a[pos][z];
                pos--;
                a[pos+1][x] = temp;
                a[pos+1][y] = temp2;
                a[pos+1][z] = temp3;
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
}
