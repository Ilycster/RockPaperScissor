import javax.swing.JFrame;

public class Window {
    JFrame frame = new JFrame();

    public void Window(String title, int width, int height, boolean fullscreen){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}