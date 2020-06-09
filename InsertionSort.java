public class InsertionSort {

    public static void main(String[] args) {

        String array[] = {"Ziggy", "Bif", "Marty", "Amy", "Beth", "Louie"};
        System.out.println("Values before the sort: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        insertionMethod(array);

        System.out.println("Values after the sort:\n");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void insertionMethod(String a []) {
        for (int i = 1; i < a.length; i++) {
            String temp = a[i];
            int pos = i - 1;
            while ((pos >= 0) && (temp.compareTo(a [pos]) < 0)) {
                a[pos + 1] = a[pos];
                pos--;
                a[pos + 1] = temp;
            }

        }
    }

}
