public class SubArrays {

    public static void subArrays(int numbers[]) {
        int ts = 0;
        int sum = 0;
        for (int  i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                }
                ts++;
                System.out.println(" | Sum: " + sum);
                sum = 0; // Reset sum for the next subarray
                System.out.println(); // Print a new line after each subarray
            }
            System.out.println(); // Print a new line after each outer loop iteration
        }
        System.out.println("Total subarrays: " + ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        subArrays(numbers);
    }
}