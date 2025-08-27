
// class Solution {

//     public String longestPalindrome(String str) {
//         if (str.length() <= 1) {
//             return str;
//         }
//         String LPS = str.substring(0, 1);

//         for (int i = 0; i < str.length(); i++) {
//             // Odd length palindrome
//             int low = i, high = i;
//             while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
//                 if (high - low + 1 > LPS.length()) {
//                     LPS = str.substring(low, high + 1);
//                 }
//                 low--;
//                 high++;
//             }

//             // Even length palindrome
//             low = i;
//             high = i + 1;
//             while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
//                 if (high - low + 1 > LPS.length()) {
//                     LPS = str.substring(low, high + 1);
//                 }
//                 low--;
//                 high++;
//             }
//         }
//         return LPS;
//     }
// }
// // Time Complexity: O(n^2)
// // Space Complexity: O(1)
