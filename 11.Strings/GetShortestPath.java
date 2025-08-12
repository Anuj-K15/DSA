
public class GetShortestPath {

    public static float getShortestPath(String s) {
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            char dir = s.charAt(i);
            //South
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'E') {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String s = "WNEENESENNN";
        System.out.println(getShortestPath(s));

    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)

