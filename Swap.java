public class Swap {
    public void swap (String[][]a,int r, int w, int z){
        String temp = a[w][z];
        a[w][z] = a[r][z];
        a[r][z] = temp;
    }
}
