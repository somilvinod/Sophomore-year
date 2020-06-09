public class QuickSort {

    public static void main(String[] args) {

        String array[] = {"Bob", "Sue", "Ann", "Anna", "Kip", "Cat", "Bud"};
        System.out.println("Values before the sort: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        quickMethod(array, 0, array.length-1);

        System.out.println("Values after the sort:\n");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void quickMethod (String a[], int from, int to) {
        if (from >= to)
            return;
        int p = (from + to)/2;
        int i = from;
        int j = to;
        while (i <= j) {
            if (a[i].compareTo(a[p]) <= 0)
                i++;
            else if (a[j].compareTo(a[p]) >= 0)
                j--;
            else {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        if (p<j) {
            swap(a, p, j);
            p = j;
        }
        else if (p>i) {
            swap(a, p, i);
            p = i;
        }
        quickMethod(a, from, p-1);
        quickMethod(a, p+1, to);
    }

    public static void swap (String stuff[], int to, int from) {
        String temp = stuff[to];
        stuff[to] = stuff[from];
        stuff[from] = temp;
    }

}
