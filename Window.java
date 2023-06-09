import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements ActionListener{
    JFrame frame = new JFrame();
    // Button button;
    Button Rock;
    Button Paper;
    Button Scissors;
    int screenWidth;
    int screenHeight;

    public Window(String title, int x, int y, int x1, int y1, boolean fullscreen){

        Rock = new Button(this, "Rock", 0, 360, 133, 40);
        Paper = new Button(this, "Paper", 133, 360, 133, 40);
        Scissors = new Button(this, "Scissors", 266, 360, 133, 40);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(x1, y1);
        // frame.setLocation(x, y);
        //Center window

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screen.width;
        int height = screen.height;
        int screenWidth = frame.getWidth();
        int screenHeight = frame.getHeight();

        frame.setLocation((width / 2) - (screenWidth / 2), (height / 2) - (screenHeight / 2));

        //Center window






        frame.setLayout(null);
        frame.setVisible(true);
    }
    public JFrame getFrame(){
        return frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // if(e.getSource() == Rock.getButton() || e.getSource() == Paper.getButton() || e.getSource() == Scissors.getButton()){
        //     NewWindow myWindow = new NewWindow();
        // }


        int rock = 0;
        int paper = 1;
        int scissors = 2;

        if(e.getSource() == Rock.getButton()){
            calc(0);
        }
        if(e.getSource() == Paper.getButton()){
            calc(1);
        }
        if(e.getSource() == Scissors.getButton()){
            calc(2);
        }

    }
    public void calc(int who){

        int computer = (int) (Math.random() * 3);
        if(computer == who){
            System.out.println("Human: " + who + " " + "Computer: " + computer + " Winner: " + "DRAW!!\n");
        }
        if(computer < who){
            System.out.println("Human: " + who + " " + "Computer: " + computer + " Winner: " + "COMPUTER!!\n");
        }
        if(computer > who){
            System.out.println("Human: " + who + " " + "Computer: " + computer + " Winner: " + "HUMAN!!\n");
        }
    }
    
}