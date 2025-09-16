// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int n = nums.length;
//         int left = 0, right = n - 1;
//         int[] result = new int[n];
//         int r = n - 1;
//         while (r >= 0) {
//             if (Math.abs(nums[left]) < Math.abs(nums[right])) {
//                 result[r] = (int) Math.pow(Math.abs(nums[right]), 2);
//                 right--;
//             } else {
//                 result[r] = (int) Math.pow(Math.abs(nums[left]), 2);
//                 left++;
//             }
//             r--;
//         }
//         return result;
//     }
// }
// // Time Complexity: O(n)
// // Space Complexity: O(n)