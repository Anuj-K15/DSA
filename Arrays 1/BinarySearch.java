// import java.util.*;

public class BinarySearch {

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            //comparisions
            if (numbers[mid] == key) {
                return mid; // Key found at index mid
            }
            if (numbers[mid] < key) {
                start = mid + 1; // Search in the right half
            }
            if (numbers[mid] > key) {
                end = mid - 1; // Search in the left half   
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 10;

        System.out.println("Index for key " + key + " is: " + binarySearch(numbers, key));
    }
}