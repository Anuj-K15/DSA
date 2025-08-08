public class KadanesAlgo {
    public static int maxSubarraySum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int num : arr) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -2, -5};
        int maxSum = maxSubarraySum(arr);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}
