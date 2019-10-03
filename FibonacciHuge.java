import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        long pisano = 2;
        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            long modp = previous%m;
            long modc = current%m;
            if(modc == 1 && modp == 0)
                pisano = i+2;
        }
        long x = calc_fib(n%pisano);

        return x % m;
    }
    ///////////////////////////////////////////////////////
    private static long calc_fib(long n) {
        if (n <= 1)
            return n;
        long p = 0;
        long c = 1;
        for(int i=0; i<n-1; i++)
        {
            long t = p;
            p = c;
            c = t+p;
            System.out.print(c+" ");
        }
        return c;
    }
//////////////////////////////////////////////////////////
//    private static long getPisanoPeriod(long m)
//    {
//        long tmp = 0, pre = 1, cur = tmp+pre, period = 0;
//        for(int i=0; i<m*m; i++)
//        {
//
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}

