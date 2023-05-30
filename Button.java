import javax.swing.JButton;

public class Button {
    JButton button;
    
    public Button(Window window, String title, int x, int y, int width, int height){
        button = new JButton(title);
        button.setBounds(x, y, width, height);
        button.setFocusable(false);
        button.addActionListener(window);

        window.getFrame().add(this.getButton());
    }

    public JButton getButton(){
        return button;
    }
}