public class Euler3Somil {

    private long half = 0;
    public static void main(String[] args) {
        Euler3Somil eulerObj = new Euler3Somil();

        long t = 600851475143L;
        long d = 2;

        while (true) {
            long temp = 600851475143L / d;
            if ( t % temp == 0 &&  eulerObj.isNumberPrime(temp)) {
                System.out.println(temp);
                break;
            }
            d++; // increments d till finds biggest prime
        }
    }

    private boolean isNumberPrime(long n)
    {
        if ( n % 2 == 0 ) //even number so not prime
            return false;

        if ((n/2) % 2 == 0) { //odd numbers
            half = ((n / 2) - 1);
        }
        else {
            half = (n / 2);
        }

        for (int i = 3; i < half; i += 2)
        {
            if ( n % i == 0 )
                return false;
        }
        return true;
    }
}

