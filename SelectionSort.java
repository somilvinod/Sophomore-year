public class SelectionSort {

    public static void main(String[] args) {

        String array[] = {"Ziggy", "Bif", "Marty", "Amy", "Beth", "Louie"};
        System.out.println("Values before the sort: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        selectionMethod(array);

        System.out.println("Values after the sort:\n");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void selectionMethod(String a[]) {
        for (int i = 0; i < a.length; i++) {
            int smallestIndex = i;
            for (int j = 0; j < a.length; j++) {
                if(a[smallestIndex].compareTo(a[j]) > 0)
                    smallestIndex = j;
            }

            String temp = a[i];
            a[i] = a[smallestIndex];
            a[smallestIndex] = temp;
        }
    }
}
