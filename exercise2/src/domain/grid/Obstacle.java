package domain.grid;

public class Obstacle implements GridComponent {
    private final int x, y;

    public Obstacle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isObstacle(int px, int py) {
        return x == px && y == py;
    }
}