public class Merge2D {
    public void merge2DMethod (String[][]array, int x, int y, int z, int z1, int z2)
    {

        if (array.length > 1) {
            int elementsInA1 = array.length / 2;
            int elementsInA2 = elementsInA1;
            if ((array.length % 2) == 1)
                elementsInA2 += 1;
            String arr1[][] = new String[elementsInA1][array[0].length];
            String arr2[][] = new String[elementsInA2][array[0].length];
            for (int i = 0; i < elementsInA1; i++)
                move(arr1, array, i, i, x, y, z, z1, z2);
            for (int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
                move(arr2, array, i - elementsInA1, i, x, y, z, z1, z2);
            merge2DMethod(arr1, x, y, z, z1, z2);
            merge2DMethod(arr2, x, y, z, z1, z2);

            int i = 0, j = 0, k = 0;
            while (arr1.length != j && arr2.length != k) {
                if (arr1[j][x].compareTo(arr2[k][x]) < 0) {
                    move(array, arr1, i, j, x, y, z, z1, z2);
                    i++;
                    j++;
                } else {
                    move(array, arr2, i, k, x, y, z, z1, z2);
                    i++;
                    k++;
                }
            }
            while (arr1.length != j) {
                move(array, arr1, i, j, x, y, z, z1, z2);
                i++;
                j++;
            }
            while (arr2.length != k) {
                move(array, arr2, i, k, x, y, z, z1, z2);
                i++;
                k++;
            }
        }
    }
    public static void move (String[][]a, String [][]b,int i, int j, int x, int y, int z, int z1, int z2)
    {
        a[i][x] = b[j][x];
        a[i][y] = b[j][y];
        a[i][z] = b[j][z];
        a[i][z1] = b[j][z1];
        a[i][z2] = b[j][z2];
    }
}
