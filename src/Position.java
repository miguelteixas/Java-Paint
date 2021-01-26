import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Position {

    private Rectangle rectangle;
    private int padding = Grid.PADDING;
    private int size = Grid.CELL_SIZE;

    public Position(int col, int row) {
        rectangle = new Rectangle(padding + col * size, padding + row * size, size, size);
        rectangle.draw();
    }
}
