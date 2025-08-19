// class Solution {
//     public int[] evenOddBit(int n) {
//         int[] res = new int[2];
//         int i = 0;
//         while (n > 0) {
//             if ((n & 1) == 1) {
//                 res[i & 1]++;
//             }
//             n >>= 1; 
//             i++;
//         }
//         return res;
//     }
// }
// // Time Complexity: O(logn)
// // Space Complexity: O(1)
