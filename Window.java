import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Window implements ActionListener{
    JFrame frame = new JFrame();
    // Button button;
    Button Rock;
    Button Paper;
    Button Scissors;

    public Window(String title, int x, int y, int width, int height, boolean fullscreen){

        frame = new JFrame(title);
        frame.setPreferredSize(new Dimension(width, height));
        Rock = new Button(this, "Rock", 0, 360, 133, 40);
        Paper = new Button(this, "Paper", 133, 360, 133, 40);
        Scissors = new Button(this, "Scissors", 266, 360, 133, 40);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (screenSize.width - frame.getWidth()) / 2;
        int centerY = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(centerX, centerY);

        if (fullscreen) {
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setUndecorated(true);
        } else {
            frame.setBounds(x, y, width, height);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
    public JFrame getFrame(){
        return frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == Rock.getButton() || e.getSource() == Paper.getButton() || e.getSource() == Scissors.getButton()){
            NewWindow myWindow = new NewWindow();
        }
    }
    public void addButton(Window window, String string, int i, int j, int k, int l) {
    }
    
}