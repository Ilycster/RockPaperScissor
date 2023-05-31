public class Main {
  
  static final int HEIGHT = 439;
  static final int WIDTH = 400;

    public static void main(String[] args)  {
        

      Window window = new Window("Untitled Game", 300, 300, WIDTH, HEIGHT, false);

      Game game = new Game(window);
      
    }
}