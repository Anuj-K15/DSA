public class HollowRhombus {

    public static void hollowRhombus(int n) {
        // Loop for rows
        for (int i = 1; i <= n; i++) {
            // Loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Loop for stars and spaces
            for (int j =1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRhombus(5);
    }
} 