// class Solution {
//     public boolean isAnagram(String str1, String str2) {
//         if (str1.length() != str2.length()) {
//             return false;
//         } else {
//             int count[] = new int[26];
//             for (char c : str1.toCharArray()) {
//                 count[c - 'a']++;
//             }
//             for (char c : str2.toCharArray()) {
//                 count[c - 'a']--;
//                 if (count[c-'a'] < 0) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }
// // Time Complexity: O(n)
// // Space Complexity: O(1)