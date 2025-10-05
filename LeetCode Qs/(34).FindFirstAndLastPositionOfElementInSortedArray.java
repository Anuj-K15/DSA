// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int first = firstNum(nums, target);
//         int last = lastNum(nums, target);
//         return new int[] { first, last };
//     }

//     private int firstNum(int[] nums, int target) {
//         int index = -1, low = 0, high = nums.length - 1;

//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (nums[mid] == target) {
//                 index = mid;
//                 high = mid - 1;
//             } else if (nums[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return index;
//     }

//     private int lastNum(int[] nums, int target) {
//         int index = -1, low = 0, high = nums.length - 1;

//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (nums[mid] == target) {
//                 index = mid;
//                 low = mid + 1;
//             } else if (nums[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return index;
//     }
// }
// // Time Complexity: O(log n)
// // Space Complexity: O(1)