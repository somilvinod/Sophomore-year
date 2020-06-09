public class Selection2D {
    public void selection2DMethod (String[][]a,int x){
        Swap swapObj = new Swap();
        for (int r = 0; r < a.length - 1; r++) {
            int smallestIndex = r;
            for (int c = r + 1; c <= a.length - 1; c++) {
                if (a[smallestIndex][x].compareTo(a[c][x]) > 0) {
                    smallestIndex = c;
                }
            }
            swapObj.swap(a, smallestIndex, r, 0);
            swapObj.swap(a, smallestIndex, r, 1);
            swapObj.swap(a, smallestIndex, r, 2);
            swapObj.swap(a, smallestIndex, r, 3);
            swapObj.swap(a, smallestIndex, r, 4);

        }
    }

}
