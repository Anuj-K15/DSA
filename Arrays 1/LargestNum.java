// import java.util.*;
public class LargestNum {

    public static int largestNum (int numbers[]) {
        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible integer

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest; // Return the largest number found
    }
    
    public static int smallestNum (int numbers[]) {
        int smallest = Integer.MAX_VALUE; // Initialize to the largest possible integer

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest; // Return the smallest number found
    }

    public static void main(String[] args) {
        int numbers[] = {3, 30, 34, 5, 9};
        System.out.println("Largest number in the array is: " + largestNum(numbers));
        System.out.println("Smallest number in the array is: " + smallestNum(numbers));
    }
}