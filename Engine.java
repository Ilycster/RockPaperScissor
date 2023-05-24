public abstract class Engine {
    
    private boolean running = false;

    public void Engine(){
        
        // long lastTime = System.nanoTime();
		// double unprocessed = 0;
		// double nsPerTick = 1000000000.0 / 60;
		// int frames = 0;
		// int ticks = 0;
		// long lastTimer1 = System.currentTimeMillis();

		// create();

		// while (running) {
		// 	long now = System.nanoTime();
		// 	unprocessed += (now - lastTime) / nsPerTick;
		// 	lastTime = now;
		// 	boolean shouldRender = true;
		// 	while (unprocessed >= 1) {
		// 		ticks++;
		// 		update();
		// 		unprocessed -= 1;
		// 		shouldRender = true;
		// 	}

		// 	try {
		// 		Thread.sleep(2);
		// 	} catch (InterruptedException e) {
		// 		e.printStackTrace();
		// 	}

		// 	if (shouldRender) {
		// 		frames++;
		// 		render();
		// 	}

		// 	if (System.currentTimeMillis() - lastTimer1 > 1000) {
		// 		lastTimer1 += 1000;
		// 		System.out.println(ticks + " ticks, " + frames + " fps");
		// 		frames = 0;
		// 		ticks = 0;
		// 	}
		// }
    }

    public void cleanUp(){

    }

    public abstract void create();

    public abstract void update();

    public abstract void render();
    
    public abstract void input();

}