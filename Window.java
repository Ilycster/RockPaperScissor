import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements ActionListener{
    JFrame frame = new JFrame();
    JButton button;

    public Window(String title, int width, int height, boolean fullscreen, JButton button){
        if(button != null){

            button.setBounds(100,160,200,40);
            button.setFocusable(false);
            button.addActionListener(this);
            this.button = button;
            
            frame.add(button);
        }
            
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);



    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == button){

            // Window window = new Window("Test", 10, 10, false, null);
            NewWindow myWindow = new NewWindow();
        }
    }
    
}