public class BubbleSort {

    public static void main(String[] args) {

        String array[] = {"Ziggy", "Bif", "Marty", "Amy", "Beth", "Louie"};
        System.out.println("Values before the sort: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        BubbleMethod(array);

        System.out.println("Values after the sort:\n");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void BubbleMethod(String[] a) {

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
