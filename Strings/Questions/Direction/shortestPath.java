package Strings.Questions.Direction;

public class shortestPath {

    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            // south
            if (dir == 'S')
                x--;
            // North
            else if (dir == 'N')
                x++;
            // East
            else if (dir == 'E')
                y++;
            // West
            else if (dir == 'W')
                y--;
        }
        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
