
import java.util.Scanner;

public class Practice {

    public static int Linear(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("enter n");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(Linear(arr, key));

        // String str1 = "Pyramid";
        // char ch[] = str1.toCharArray();
        // System.out.println(ch);
        // char ab[] = {'P','y','r','a','m','i','d'};
        // String str2 = new String(ab);
        // System.out.println(str2);
        // System.out.println(str2.length());
        // System.out.println(str2.toUpperCase());
        // System.out.println(str2.toLowerCase());
        // StringBuffer sb = new StringBuffer(str2);
        // System.out.println(sb);
        // System.out.println(sb.reverse());
        // System.out.println(sb.append("a"));
        // String str3 = new String("Kava");
        // str3 = str3.substring(1, str3.length());
        // StringBuffer sb1 = new StringBuffer(str3);
        // sb1.insert(0, 'j');
        // str3 = sb1.toString();
        // str3 = str3.concat(" is program");
        // System.out.println(str3);
        // int i;
        // for ( i=1;i < 6; i++) {
        //     if (i > 3) {
        //         continue;
        //     }
        //     // System.out.println(i);
        // }
        // System.out.println(i);
        //Linear Search
    }
}
