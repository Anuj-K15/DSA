public class InvHalfNumPyramid {

    public static void inverted_half_num_pyramid(int n) {
        // loop for rows
        for (int i = 1; i <= n; i++) {
            //loop for numbers
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
        

    public static void main(String[] args) {
        inverted_half_num_pyramid(5);
    }
}