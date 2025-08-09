// class Solution {
//     public List<List<Integer>> fourSum(int[] arr, int target) {
//         List<List<Integer>> result = new ArrayList<>();
//         if (arr == null || arr.length < 4)
//             return result;

//         Arrays.sort(arr);
//         int n = arr.length;

//         for (int i = 0; i < n - 3; i++) {
//             if (i > 0 && arr[i] == arr[i - 1])
//                 continue; 

//             for (int j = i + 1; j < n - 2; j++) {
//                 if (j > i + 1 && arr[j] == arr[j - 1])
//                     continue; 

//                 int p = j + 1, q = n - 1;
//                 while (p < q) {
//                     long sum = (long) arr[i] + arr[j] + arr[p] + arr[q];

//                     if (sum == target) {
//                         result.add(Arrays.asList(arr[i], arr[j], arr[p], arr[q]));
//                         p++;
//                         q--;

//                         while (p < q && arr[p] == arr[p - 1])
//                             p++; 
//                         while (p < q && arr[q] == arr[q + 1])
//                             q--; 
//                     } else if (sum < target) {
//                         p++;
//                     } else {
//                         q--;
//                     }
//                 }
//             }
//         }
//         return result;
//     }
// }
// // Time Complexity: O(n^3)
// // Space Complexity: O(1)


