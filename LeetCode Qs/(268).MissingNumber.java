// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         int actualSum = n * (n + 1) / 2;
//         int sum = 0;
//         for (int num : nums) {
//             sum += num;
//         }
//         int missingNumber = actualSum - sum;
//         return missingNumber;
//     }
// }
// // Time Complexity: O(n)
// // Space Complexity: O(1)
