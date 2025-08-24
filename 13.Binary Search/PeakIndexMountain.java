public class PeakIndexMountain {
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 1, end = n - 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if (arr[mid - 1] < arr[mid]) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,1,0}));
        System.out.println(peakIndexInMountainArray(new int[]{0,2,1,0}));
        System.out.println(peakIndexInMountainArray(new int[]{0,10,5,2}));
    }
}