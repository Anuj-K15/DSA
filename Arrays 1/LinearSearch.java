

public class LinearSearch {

    public static int linearSearchNum(int numbers[], int key) {
        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }

        }
        return -1; // If key is not found
    }

    public static int linearSearchString(String menu[], String keyItem) {
        for (int i=0; i < menu.length; i++) {
            if (menu[i].equals(keyItem)) {
                return i;
            }

        }
        return -1; // If key is not found
    }
    
    public static void main(String[] args) {
        // Example of searching a number in an array
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 10;

        // Example of searching a string in an array
        String menu[] = {"dosa", "idli", "vada", "sambar", "upma"};
        String keyItem = "sambar";

        // Searching for a string in the menu
        int indexStr = linearSearchString(menu, keyItem);

        // Searching for a number in the menu
        int indexNum = linearSearchNum(numbers, key);

        // Displaying the result of number search
        if (indexNum != -1) {
            System.out.println("Key " + key + " found at index: " + indexNum);
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }

        // Displaying the result of string search
        if (indexStr != -1) {
            System.out.println("Key " + keyItem + " found at index: " + indexStr);
        } else {
            System.out.println("Key " + keyItem + " not found in the array.");
        }
    }
}

 // Time Complexity: O(n), where n is the number of elements in the array.