import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("AlienSnake");
        setIconImage(new ImageIcon("alien.png").getImage());
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(365,385);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
