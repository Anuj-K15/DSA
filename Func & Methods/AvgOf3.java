public class AvgOf3 {

    public static float avgOf3 (float a, float b, float c) {
        float avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println(avgOf3(7.0f, 3.0f, 10.0f));
    }
}