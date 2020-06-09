public class MergeSort2DWithArrays
{
    public static void main (String [] args)
    {
        int x = 0; int y = 1; int z = 2;
        String [][]array = {{"Ziggy", "Jones", "13"}, {"Bif", "Smith", "11"},
                {"Barb", "Smiley", "15"}, {"Barb", "Smiley", "15"},
                {"Slappy", "White", "07"}, {"Soupy", "Sales", "08"}};

        System.out.println("Values Before the sort: ");
        printMethod(array);
        System.out.println();
        merge2DMethod(array, x, y, z); //the 1st integer value is the column to be sorted
        System.out.print("Values after the sort:\n");
        printMethod(array);
    }

    public static void merge2DMethod(String[][] array, int x, int y, int z)
    {
        if(array.length > 1)
        {
            int elementsInA1 = array.length/2;
            int elementsInA2 = elementsInA1;
            if((array.length%2) == 1)
                elementsInA2 += 1;
            String arr1[][] = new String[elementsInA1][array[0].length];
            String arr2[][] = new String[elementsInA2][array[0].length];
            for (int i = 0; i < elementsInA1; i++)
                move(arr1, array, i, i, x, y, z);
            for(int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
                move(arr2, array, i - elementsInA1, i, x, y, z);
            merge2DMethod(arr1,x,y,z);
            merge2DMethod(arr2,x,y,z);

            int i = 0, j = 0, k = 0;
            while(arr1.length != j && arr2.length != k)
            {
                if(arr1[j][x].compareTo(arr2[k][x]) < 0)
                {
                    move(array,arr1,i,j,x,y,z);
                    i++;
                    j++;
                }
                else
                {
                    move(array, arr2, i,k,x,y,z);
                    i++;
                    k++;
                }
            }
            while(arr1.length != j)
            {
                move(array,arr1,i,j,x,y,z);
                i++;
                j++;
            }
            while(arr2.length != k)
            {
                move(array,arr2,i,k,x,y,z);
                i++;
                k++;
            }
        }
    }

    public static void move(String [][] a, String [][] b, int i, int j, int x, int y, int z)
    {
        a[i][x] = b[j][x];
        a[i][y] = b[j][y];
        a[i][z] = b[j][z];
    }

    public static void printMethod(String [][] a)
    {
        for(int r = 0; r < a.length; r++)
            for(int c = 0; c < a[0].length; c++)
            {
                if(c != a[0].length-1)
                    System.out.print(a[r][c] + "  ");
                else
                {
                    System.out.print(a[r][c] + "  ");
                    System.out.println();
                }
            }
    }
}