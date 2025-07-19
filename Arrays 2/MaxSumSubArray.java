public class MaxSumSubArray {
    public static void subArraysMaxSumBruteForce(int numbers[]) {
        // int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int  i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int currSum = 0; // Reset current sum for each subarray
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum; // Update maxSum if current sum is greater
                }
            }
        }
        System.out.println("Maximum sum of subarrays: " + maxSum);
    }   

    public static void subArraysMaxSumPrefixArray(int numbers[]) {
        // int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int [numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix sum
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int  i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; // Reset current sum for each subarray
                
                if (maxSum < currSum) {
                    maxSum = currSum; // Update maxSum if current sum is greater
                }
            }
        }
        System.out.println("Maximum sum of subarrays: " + maxSum);
    }   

    public static void subArraysMaxSumKadane(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if ( cs < 0) {
                cs = 0;
            } else {
                ms = Math.max(cs, ms);
            }
        }
        System.out.println("Maximum sum of subarrays: " + ms);
    }
    
    public static void main(String[] args) {
        int numbers[] = {2, -1, -5, 4, 3};
        subArraysMaxSumBruteForce(numbers);
        subArraysMaxSumPrefixArray(numbers);
        subArraysMaxSumKadane(numbers);
    }
}