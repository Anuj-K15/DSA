// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int n = nums.length;
//         int st = 0;
//         int end = n - 1;
//         while (st <= end) {
//             int mid = st + (end - st) / 2;
//             if (n == 0) return 0;
//             if (target == nums[mid]) {
//                 return mid;
//             } 
//             else if (target > nums[mid]) {
//                 st = mid + 1;
//             }
//             else {
//                 end = mid - 1;
//             }
//         }
//         return st;
//     }
// }
// // Time Complexity: O(logn)
// // Space Complexity: O(1)