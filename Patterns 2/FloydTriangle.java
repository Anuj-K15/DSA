public class FloydTriangle {

    public static void floydTriangle(int n) {
        int count = 1; // Initialize count to 1
        // loop for rows
        for (int i = 1; i <= n; i++) {
            // loop for columns
            for ( int j =1; j <= i; j++) {
                System.out.print(count + " ");
                count++; // Increment count after printing
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void main(String[] args) {
        floydTriangle(5);
    }
}