import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        MainForm form = new MainForm();
        frame.setContentPane(form.panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 600);
    }
}
