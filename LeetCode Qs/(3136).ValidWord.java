// class Solution {
//     public boolean isValid(String word) {
//         if (word == null || word.length() < 3) return false;
//         boolean hasVowel = false, hasConsonants = false;
        
//         for(int i=0; i<word.length(); i++) {
//             char ch = word.charAt(i);
//             if (ch >= '0' && ch <='9') {
//                 continue;
//             } 
//             else if (ch >= 'a' && ch <= 'z') {
//                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                     hasVowel = true;
//                 } else {
//                     hasConsonants = true;
//                 }
//             }
//             else if (ch >= 'A' && ch <= 'Z') {
//                 if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//                     hasVowel = true;
//                 } else {
//                     hasConsonants = true;
//                 }
//             }
//             else {
//                 return false;
//             }
            
//         }
//         return hasVowel && hasConsonants;
//     }
// }
// // Time Complexity: O(n)
// // Space Complexity: O(1)
