import javax.swing.JButton;

public class Main {
    public static void main(String[] args)  {

      Window window = new Window("Untitled Game", 1920, 1080, false, new JButton("New Window"));

      Game game = new Game(window);
   
  }
}