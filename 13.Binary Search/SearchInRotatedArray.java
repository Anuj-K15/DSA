public class SearchInRotatedArray {
    public static int search(int[] A, int tar) {
        if (A == null || A.length == 0) {
            return -1;
        }
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
            } 
            else {
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
        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 0));
        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 3));
    }
}