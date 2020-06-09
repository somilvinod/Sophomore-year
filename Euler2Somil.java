public class Euler2Somil {
    public static void main (String [] args) {
        int sum = 0;
        int prevNum = 1;
        int nextNum = 2;
        while (prevNum <= 4000000) {
            if (prevNum % 2 == 0)
                sum += prevNum;
            int thirdNum = prevNum + nextNum;
            prevNum = nextNum;
            nextNum = thirdNum;
        }
        System.out.print(sum);
    }
}
