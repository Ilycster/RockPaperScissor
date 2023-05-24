public class Engine {
    
    private boolean running = false;

    public Engine(Game game){
        game.create();
        
    }

    public void cleanUp(){};

}