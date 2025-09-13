import java.util.Arrays;

public class Practice {
    public static void bubble (int [] arr) {
        for (int turn = 0; turn < arr.length-1; turn++) {
            for (int j = 0; j < arr.length-1 - turn; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        // System.out.println(bubble(arr[i]));
    }
}