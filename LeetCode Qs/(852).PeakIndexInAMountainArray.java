// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         // for (int i=1; i<=arr.length-2; i++) {
//         //     if (arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
//         //         return i;
//         //     }
//         // }
//         // return -1;
//         int n = arr.length;
//         int start = 1, end = n - 2;
//         while (start <= end) {
//             int mid = start + (end - start) / 2;
//             if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
//                 return mid;
//             }
//             else if (arr[mid - 1] < arr[mid]) {
//                 start = mid + 1;
//             } 
//             else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
// }
// // Time Complexity: O(logn)
// // Space Complexity: O(1)