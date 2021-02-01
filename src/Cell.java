import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private int size = Grid.CELL_SIZE;
    private Position position;
    private Rectangle cell;

    public Cell(int col, int row) {
        position = new Position(col, row);
        cell = new Rectangle(Grid.PADDING + col * size, Grid.PADDING + row * size, size, size);
        cell.draw();
    }

}
