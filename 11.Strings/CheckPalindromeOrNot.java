public class CheckPalindromeOrNot {
    public static boolean palindromeOrNot(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "racrar";
        System.out.println(palindromeOrNot(s));

    }
}