import java.util.*;

public class LCM {
    private static long lcm_fast(int a, int b) {
        long lcm = (long)a*b/gcd_fast(a,b);
        return lcm;
    }

    private static int gcd_fast(int a, int b) {
        if(a==0)
            return b;
        return gcd_fast(b%a, a);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(lcm_fast(a, b));
    }
}



