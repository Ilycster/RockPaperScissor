import java.util.Random;

import javax.swing.JButton;

public class Game extends Logic{
    Engine engine;
    Window window;

    JButton myButton = new JButton("New Window");

    public Game(Window window) {

        engine = new Engine(this);

        this.window = window;
    }

    @Override
    public void create(){
        
    }

    @Override
    public void update()
    {
        Random ran = new Random();
        int myRanInt = ran.nextInt(3);
        String computerRanChoice ="";
        switch(myRanInt) 
            {
                case 0: computerRanChoice = "rock";
                    break;
                case 1: computerRanChoice = "paper";
                    break;
                case 2: computerRanChoice = "scissors";
                    break;
            }
           
    }  
    
    

    @Override
    public void render(){

    }

    @Override
    public void input(){

    }

}