public class Binary2D {
    public int binary2DMethod (String[][]a,int first, int last, String key)
    {
        while (first < last) {
            int mid = (first + last) / 2;
            if (key.compareTo(a[mid][0]) < 0)
                last = mid;
            else if (key.compareTo(a[mid][0]) > 0)
                first = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
