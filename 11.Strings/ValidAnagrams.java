
import java.util.*;

public class ValidAnagrams {

    // Approach 1: Sorting
    // Time Complexity: O(nlogn)
    // Space Complexity: O(n)
    public static void sortingMethod(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] str1Chars = str1.toCharArray();
            char[] str2Chars = str2.toCharArray();
            Arrays.sort(str1Chars);
            Arrays.sort(str2Chars);

            boolean result = Arrays.equals(str1Chars, str2Chars);
            if (result) {
                System.out.println("The strings are anagrams of each other.");
            } else {
                System.out.println("The strings are not anagrams of each other.");
            }
        } else {
            System.out.println("The strings are not anagrams of each other.");
        }
    }

    // Approach 2: Hashing
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void hashingMethod(String str1, String str2) {
        Map<Character, Integer> count = new HashMap<>();

        for (char c : str1.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!count.containsKey(c)) {
                System.out.println("The strings are not anagrams of each other.");
            }
            count.put(c, count.get(c) - 1);
            if (count.get(c) == 0) {
                count.remove(c);
            }
        }
        if (count.isEmpty()) {
            System.out.println("The strings are anagrams of each other.");
        } else {
            System.out.println("The strings are not anagrams of each other.");
        }
    }

    // Approach 3: Frequency Count Difference Method
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static void frequencyCountDiffMethod(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        if (m != n) {
            System.out.println("The strings are not anagrams of each other.");
        } else {
            int count[] = new int[26];
            for (int i=0; i<m; i++) {
                count[str1.charAt(i) - 'a']++;
                count[str2.charAt(i) - 'a']--;
            }
            
            for (int i=0; i<count.length; i++) {
                if (count[i] != 0) {
                    System.out.println("The strings are not anagrams of each other.");
                }
            }
            System.out.println("The strings are anagrams of each other.");
        }
    }   

    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        System.out.println("Approach 1: Sorting");
        sortingMethod(str1, str2);
        System.out.println();
        System.out.println("Approach 2: Hashing");
        hashingMethod(str1, str2);
        System.out.println();
        System.out.println("Approach 3: Frequency Count Difference Method");
        frequencyCountDiffMethod(str1, str2);
        System.out.println();
    }
}
