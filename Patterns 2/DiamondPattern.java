public class DiamondPattern {

    public static void diamondPattern (int n) {
        //1st half
        for (int i = 1; i <= n; i++) {
            // loop for spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //loop for stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for (int i = n; i >= 1; i--) {
            // loop for spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //loop for stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondPattern(3);
    }
}
