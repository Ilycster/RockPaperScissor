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
        // window.addButton(myButton);
    }

    @Override
    public void update(){

    }

    @Override
    public void render(){

    }

    @Override
    public void input(){

    }

}