public class PrintDigitsInString {
    static String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void printDigitsInString(int number) {
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printDigitsInString(number / 10);
        System.out.print(digits[lastDigit]+ " ");
    }
    public static void main(String[] args) {
        printDigitsInString(12345);
    }
}
