import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    public static final int PADDING = 10;
    public static final int CELL_SIZE = 20;
    List<Cell> cells = new ArrayList<>();


    public Grid(int cols, int rows) {
        new Rectangle(PADDING, PADDING, cols * CELL_SIZE, rows * CELL_SIZE).draw();
        createCells(cols, rows);
    }

    private void createCells(int cols, int rows) {
        int numberOfCells = cols * rows;
        for (int i = 0; i < numberOfCells; i++) {
            int column = i / cols;
            int row = i % rows;
            cells.add(new Cell(column, row));
        }
    }
}
