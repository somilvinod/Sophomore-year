import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String array[] = {"Bob", "Sue", "Ann", "Anna", "Kip", "Cat", "Bud"};
        System.out.println("Values before the sort: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println(" ");
        bubbleMethod(array);

        System.out.print("\nValues after the sort: \n");
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        System.out.print("\nWhich name do you want to search for: ");
        String name = input.next();
        int x = binarySearch(array, 0, array.length, name);
        if (x!= -1)
            System.out.println("The name " + name + " is located at index " + x + " in the sorted list");
        else
            System.out.println("Name not in list.");
    }

    public static int binarySearch (String[] a, int first, int last, String key) {
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


    public static void bubbleMethod(String[] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    String temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}