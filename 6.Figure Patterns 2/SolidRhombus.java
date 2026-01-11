public class SolidRhombus {

    public static void solidRhombhus(int n) {
        // Loop for rows
        for (int i = 1; i <= n; i++) {
            // Loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Loop for stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solidRhombhus(5);
    }
}