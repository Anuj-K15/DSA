// class Solution { //normal method
//     public boolean isPalindrome(String s) {
//         String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//         int n = str.length();
//         for (int i = 0; i < n / 2; i++) {
//             if (str.charAt(i) != str.charAt(n-i-1)) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
// // Time Complexity: O(n)
// // Space Complexity: O(1)

// class Solution {
//     public boolean isPalindrome(String s) {
//         int left = 0, right = s.length() - 1;
//         while (left < right) {
//             while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
//             while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
//             if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                 return false;
//             } else {
//                 left++;
//                 right--;
//             }
//         }
//         return true;
//     }
// }
// // Time Complexity: O(n)
// // Space Complexity: O(1)
