
public class SearchInRotatedSortedArray {

    public static int search(int[] A, int tar) {
        int st = 0;
        int end = A.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (A[mid] == tar) {
                return mid;
            }
            if (A[st] <= A[mid]) {
                if (A[st] <= tar && tar <= A[mid]) { //left sorted
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (A[mid] <= tar && tar <= A[end]) { //right sorted
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int A[] = {3, 4, 5, 6, 7, 0, 1, 2};
        int tar = 0;
        int result = search(A, tar);
        System.out.println("Element found at index: " + result);
    }
}
