public class ReverseArray {

    public static void reverseArray(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            //swap the elements at first and last
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverseArray(numbers);

        for (int i =0 ; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // Print a new line after the array
    }
}