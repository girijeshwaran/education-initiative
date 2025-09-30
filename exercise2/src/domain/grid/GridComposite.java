package domain.grid;

import java.util.ArrayList;
import java.util.List;

public class GridComposite implements GridComponent {
    private final int width, height;
    private final List<GridComponent> children = new ArrayList<>();

    public GridComposite(int w, int h) {
        width = w;
        height = h;
    }

    public void add(GridComponent c) {
        children.add(c);
    }

    public boolean isObstacle(int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) return true;
        return children.stream().anyMatch(c -> c.isObstacle(x, y));
    }
}