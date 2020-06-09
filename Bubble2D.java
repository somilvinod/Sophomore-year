public class Bubble2D {
    public void bubble2DMethod (String[][]a,int x){
        Swap swapObj = new Swap();
        for (int c = 0; c < a.length - 1; c++) {
            for (int r = 0; r < (a.length - 1 - c); r++) {
                if (a[r][x].compareTo(a[r + 1][x]) > 0) {
                    swapObj.swap(a, r, r + 1, 0);
                    swapObj.swap(a, r, r + 1, 1);
                    swapObj.swap(a, r, r + 1, 2);
                    swapObj.swap(a, r, r + 1, 3);
                    swapObj.swap(a, r, r + 1, 4);
                }
            }
        }
    }
}
