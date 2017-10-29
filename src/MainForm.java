import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainForm implements IGameInterface {

    public MainForm() {
        panel = new JPanel();
        buttons = new ArrayList<>();
        StartGame();
    }

    public JPanel panel;
    private List<JButton> buttons;
    private static Game theGame;

    public void StartGame()
    {
        theGame = new Game(this);
    }

    @Override
    public void DrawGrid(Grid grid) {
        int size = 200;
        panel.setLayout(null);
        Player[][] array = grid.GetGrid();
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                JButton button = new JButton();
                button.setLocation(size * x + 1, size * y + 1);
                button.setSize(size, size);
                buttons.add(button);
            }
        }
        buttons.forEach((b) -> panel.add(b));
    }
}
