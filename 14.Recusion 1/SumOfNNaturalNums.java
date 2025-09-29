public class SumOfNNaturalNums {
    public static int printSum(int n) {
        if (n == 1) {
            return 1;
        }
        int fn = n + printSum(n - 1);
        return fn;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.print(printSum(n));
    }
}
