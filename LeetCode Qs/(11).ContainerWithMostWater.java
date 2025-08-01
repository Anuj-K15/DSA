// class Solution {
//     public int maxArea(int[] height) {
//         int left = 0, right = height.length - 1;
//         int max_Area = 0;

//         // formula: area = min(height[left], height[right]) * (right - left)

//         while (left <= right) {
//             int min_height = Math.min(height[left], height[right]);
//             int width = right - left;
//             int area = min_height * width;

//             max_Area = Math.max(max_Area, area);

//             if (height[left] < height[right]) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
//         return max_Area;
//     }
// }