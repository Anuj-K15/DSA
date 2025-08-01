import java.util.*;
public class ContainsDuplicate {

    public static boolean ifTwice(int nums[]) { // O(n^2) solution
        for (int i=0; i < nums.length; i++) {
            for (int j=i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean  containsDuplicate(int[] nums) { // O(n) solution using HashSet
        Set<Integer> intSet = new HashSet<>();
        for (int num : nums) {
            if (intSet.contains(num)) {
                return true;
            }
            intSet.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(ifTwice(nums)); // O(n^2) solution
        System.out.println(containsDuplicate(nums)); // O(n) solution using HashSet

    }
}