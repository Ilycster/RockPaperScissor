import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Window extends JFrame{
    
gamePanel window;

Window(){
    window = new gamePanel();
    this.add(window);
    this.setTitle("Rock Paper Scissor");
    this.setResizable(false);
    this.setBackground(Color.black);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
}

}
