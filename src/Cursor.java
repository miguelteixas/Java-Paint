import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor {

    private Position position;
    private Rectangle cursor;

    public Cursor() {
        position = new Position(1, 1);
        cursor = new Rectangle(Grid.PADDING + 1 * Grid.CELL_SIZE, Grid.PADDING + 1 * Grid.CELL_SIZE, Grid.CELL_SIZE, Grid.CELL_SIZE);
        cursor.fill();
    }

    public void moveUp() {
        cursor.translate(0, -1);
        position.setRow(position.getRow() - 1);
    }

    public void moveDown() {
        cursor.translate(0, 1);
        position.setRow(position.getRow() + 1);
    }

    public void moveLeft() {
        cursor.translate(-1, 0);
        position.setColumn(position.getColumn() - 1);
    }

    public void moveRight() {
        cursor.translate(1, 0);
        position.setColumn(position.getColumn() + 1);
    }
}
