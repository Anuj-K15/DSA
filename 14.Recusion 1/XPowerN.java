public class XPowerN {
    public static int xPowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * xPowerN(x, n - 1);
    }
    // optimized
    public static int xPowerNOptimized(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = xPowerNOptimized(x, n/2);
        int halfPowerSquare = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSquare *= x;
        }
        return halfPowerSquare;
    }
    public static void main (String[] args) {
        System.out.println(xPowerNOptimized(2, 3));
    }
}
