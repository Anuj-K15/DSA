public class LastOccurrence {
    public static int lastOccurrence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int ans = lastOccurrence(arr, key, i + 1);
        if (ans == -1 && arr[i] == key) {
            return i;
        }
        return ans;
    }
    public static void main (String[] args) {
        int[] arr = {1,2,4,3,4,6,7};
        System.out.println(lastOccurrence(arr, 4, 0));
    }
}
