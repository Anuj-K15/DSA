public class PalindromicPattern {

    public static void palindromicPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // loop for decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j );
            }
            // loop for increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j );
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        palindromicPyramid(5);
    }
}