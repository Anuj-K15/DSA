public class ArrAsFuncArg {

    public static void update(int marks[]) {
        for (int i = 0; i<marks.length; i++) {
            marks[i] += 5;
        }
    }
    public static void main(String[] args) {
        int marks[] = {40,20,90};
        update(marks);

        for( int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}