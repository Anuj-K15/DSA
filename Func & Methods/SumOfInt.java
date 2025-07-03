public class SumOfInt {

    public static int sumInt(int num) {
        int newNum = 0;
        int sum = 0;

        while( num > 0) {
            int lastDigit = num % 10;
            newNum = newNum * 10 + lastDigit;
            num = num / 10;
            sum = sum + lastDigit;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumInt(12345));
        
    }
}