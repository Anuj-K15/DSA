// import java.util.*;
// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         // Always build the map from the smaller array
//         if (nums1.length > nums2.length) {
//             return intersect(nums2, nums1); // swap to save space
//         }
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int num : nums1) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
//         List<Integer> resultList = new ArrayList<>();
//         for (int num : nums2) {
//             if (map.containsKey(num) && map.get(num) > 0) {
//                 resultList.add(num);
//                 map.put(num, map.get(num) - 1);
//             }
//         }
//         // Convert list to array
//         int[] result = new int[resultList.size()];
//         for (int i = 0; i < resultList.size(); i++) {
//             result[i] = resultList.get(i);
//         }
//         return result;
//     }
// }
// // Time Complexity: O(n)
// // Space Complexity: O(n)
