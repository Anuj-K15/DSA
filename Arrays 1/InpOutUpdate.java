import java.util.*;
public class InpOutUpdate {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        // length of array
        System.out.println("Length of array:" + marks.length    );

        System.out.println("Enter marks for Physics:");
        marks[0] = sc.nextInt(); //physics
        System.out.println("Enter marks for Chemistry:");
        marks[1] = sc.nextInt(); //chemistry
        System.out.println("Enter marks for Maths:");
        marks[2] = sc.nextInt(); //maths

        System.out.println("Physics:" + marks[0]);
        System.out.println("Chemistry:" + marks[1]);
        System.out.println("Maths:" + marks[2]);
        
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage: " + percentage + "%");
    }
}