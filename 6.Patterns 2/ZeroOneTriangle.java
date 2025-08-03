public class ZeroOneTriangle {

    public static void zeroOneTriangle (int n) {
        // loop for rows
        for (int i = 1; i <=n; i++) {
            // loop for columns
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        zeroOneTriangle(5);
    }
}