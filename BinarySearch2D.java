import java.util.Scanner;

public class BinarySearch2D {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String[][] array = {{"Ziggy", "Jones", "13"},{"Bif", "Smith", "11"},{"Barb", "Smiley", "15"}};
        System.out.println("Values before the sort: ");
        printMethod(array);
        bubble2DMethod(array);
        System.out.print("\nValues after the sort: \n");
        printMethod(array);
        System.out.println();
        System.out.print("\nWhich last name do you want to search for: ");
        String name = input.next();
        int x = binarySearch(array, 0, array.length, name);
        if (x!= -1)
            System.out.println("The name " + name + " is located at index " + x + " in the sorted list");
        else
            System.out.println("Name not in list.");

    }
    public static int binarySearch (String [][] a, int first, int last, String key ) {
        while (first < last) {
            int mid = (first+last)/2;
            if (key.compareTo(a[mid]) < 0)
                last = mid;
            else if (key.compareTo(a[mid]) > 0)
                first = mid + 1;
            else
                return mid;
        }

        return -1;
    }

    public static void bubble2DMethod(String[][] a) {
        for (int c = 0; c < a[0].length - 1; c++) {
            for (int r = 0; r < (a.length - 1 - c); r++) {
                if (a[r][0].compareTo(a[r + 1][0]) > 0) {
                    swap(a, r, 0);
                    swap(a, r, 1);
                    swap(a, r, 2);
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
