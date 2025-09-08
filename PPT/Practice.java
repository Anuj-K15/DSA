import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{4,5,6,7},{7,8,9,3}};
        // print diagonal elements ( Z shape )
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[0][i] + " ");
        for (int j=i; j<arr.length; j++) {
            System.out.print(arr[j][arr.length-1-i] + " ");
        }
        }
        // System.out.println();
    }
}