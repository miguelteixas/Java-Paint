public class Paint {

    private Grid grid;
    private Cursor cursor;

    public Paint(int cols, int rows) {
        grid = new Grid(cols, rows);
        cursor = new Cursor();
    }
}
