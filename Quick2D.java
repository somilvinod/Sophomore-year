public class Quick2D {
    public void quick2DMethod (String[][]a,int x, int y, int z, int z1, int z2, int from, int to){
        Swap swapObj = new Swap();
        if (from >= to)
            return;
        int p = (from + to) / 2;
        int i = from;
        int j = to;
        while (i <= j) {
            if (a[i][x].compareTo(a[p][x]) <= 0)
                i++;
            else if (a[j][x].compareTo(a[p][x]) >= 0)
                j--;
            else {
                swapObj.swap(a, j, i, x);
                swapObj.swap(a, j, i, y);
                swapObj.swap(a, j, i, z);
                swapObj.swap(a, j, i, z1);
                swapObj.swap(a, j, i, z2);
                i++;
                j--;
            }
        }
        if (p < j) {
            swapObj.swap(a, j, p, x);
            swapObj.swap(a, j, p, y);
            swapObj.swap(a, j, p, z);
            swapObj.swap(a, j, p, z1);
            swapObj.swap(a, j, p, z2);
            p = j;
        } else if (p > i) {
            swapObj.swap(a, i, p, x);
            swapObj.swap(a, i, p, y);
            swapObj.swap(a, i, p, z);
            swapObj.swap(a, i, p, z1);
            swapObj.swap(a, i, p, z2);

            p = i;
        }
        quick2DMethod(a, x, y, z, z1, z2, from, p - 1);
        quick2DMethod(a, x, y, z, z1, z2, p + 1, to);
    }
}
