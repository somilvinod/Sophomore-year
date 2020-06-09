public class Linear2D {
    public int linear2DMethod (String[][]a,int first, int last, String key)
    {
        String test = "false";
        for (int i = 0; i < a.length; i++) {
            if (key.equals(a[i][0]))
                return i;
        }
        return -1;
    }
}
