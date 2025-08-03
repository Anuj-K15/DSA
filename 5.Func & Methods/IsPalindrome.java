public class IsPalindrome {

    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;

        while( num > 0) {
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num = num / 10;
        }
        return original == reversed;
    }    

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
    }
}