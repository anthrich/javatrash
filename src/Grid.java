public class Grid {

    private Player[][] Cells;

    public Grid() {
        Cells = new Player[3][3];
    }

    public Player[][] GetGrid() {
        return Cells;
    }
}
