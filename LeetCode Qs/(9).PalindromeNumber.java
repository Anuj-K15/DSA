// class Solution {
//     public boolean isPalindrome(int x) {
//         int reversed = 0;
//         int original = x;
//         while (x > 0) {
//             int lastDigit = x % 10;
//             reversed = reversed * 10 + lastDigit;
//             x = x / 10;
//         }
//         return (original == reversed) ? true : false;
//     }
// }