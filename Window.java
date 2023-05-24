import javax.swing.JFrame;

public class Window {
    JFrame frame = new JFrame();

    public Window(String title, int width, int height, boolean fullscreen){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setTitle(title);

    }
}