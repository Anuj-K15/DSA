// class Solution {
//     public String largestGoodInteger(String num) {
//         String[] numbers = { "999", "888", "777", "666", "555", "444", "333", "222", "111", "000" };
//         for (String i : numbers) {
//             if (num.contains(i)) {
//                 return i;
//             }
//         }
//         return "";
//     }
// }
// // Time Complexity: O(n)
// // Space Complexity: O(1)

// OR

// class Solution {
//     public String largestGoodInteger(String num) {
//         String largest = "";
//         for (int i = 0; i + 2 < num.length(); i++) {
//             if (num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)) {
//                 largest = largest.compareTo(num.substring(i, i+3)) > 0 ? largest : num.substring(i, i+3);
//             }
//         }
//         return largest;
//     }
// }
// // Time Complexity: O(n)
// // Space Complexity: O(1)
