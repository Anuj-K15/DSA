// import java.util.*;
public class PrintReverseNum {
    public static void main(String[] args) {
        int n = 13298;
        while ( n > 0 ) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
    }
}