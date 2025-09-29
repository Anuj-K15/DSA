public class FirstOccurrence {
    public static int firstOccurrence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurrence(arr, key, i + 1);
    }
    public static void main (String[] args) {
        int[] arr = {1,2,4,3,4,6,7};
        System.out.println(firstOccurrence(arr, 4, 0));
    }
}
