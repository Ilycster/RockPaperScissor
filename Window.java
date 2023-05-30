import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements ActionListener{
    JFrame frame = new JFrame();
    Button button;
    // JButton button;

    public Window(String title, int x, int y, int width, int height, boolean fullscreen){
        button = new Button(this, "BUTTON CLASS!", 100, 160, 200, 40);
            
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLocation(x, y);
        frame.setLayout(null);
        frame.setVisible(true);



    }
    public JFrame getFrame(){
        return frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == button.getButton()){
            NewWindow myWindow = new NewWindow();
        }
    }
    
}