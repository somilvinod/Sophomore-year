public class Insertion2D {
    public void insertion2DMethod (String a [][],int x, int y, int z, int z1, int z2){
        for (int r = 1; r < a.length; r++) {
            String temp = a[r][x];
            String temp2 = a[r][y];
            String temp3 = a[r][z];
            String temp4 = a[r][z1];
            String temp5 = a[r][z2];

            int pos = r - 1;

            while ((pos >= 0) && (temp.compareTo(a[pos][x]) < 0)) {
                a[pos + 1][x] = a[pos][x];
                a[pos + 1][y] = a[pos][y];
                a[pos + 1][z] = a[pos][z];
                a[pos + 1][z1] = a[pos][z1];
                a[pos + 1][z2] = a[pos][z2];
                pos--;
                a[pos + 1][x] = temp;
                a[pos + 1][y] = temp2;
                a[pos + 1][z] = temp3;
                a[pos + 1][z1] = temp4;
                a[pos + 1][z2] = temp5;
            }
        }
    }
}
