public class NumberPyramid {

    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // loop for numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numberPyramid(5);
    }
}