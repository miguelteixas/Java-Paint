public class Paint {

    private Grid grid;
    private Cursor cursor;
    private InputHandler inputHandler;

    public Paint(int cols, int rows) {
        grid = new Grid(cols, rows);
        cursor = new Cursor();
        inputHandler = new InputHandler();
    }
}
