import java.util.Scanner;

public class Fibonacci {
    private static long calc_fib(int n) {
        if (n <= 1)
            return n;
        int p = 0;
        int c = 1;
        for(int i=0; i<n-1; i++)
        {
            int t = p;
            p = c;
            c = t+p;
            System.out.print(c+" ");
        }

        return c;

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(calc_fib(n));
    }
}
