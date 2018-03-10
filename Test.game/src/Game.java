import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = -1172253802633168646L;

	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;

	private Thread thread;
	private boolean runnuing = false;
	private Random r;
	private Handler handler;
	private HeadUpDisplay hud;
	private Spawner spawner;
	
	
	public Game() {
		handler = new Handler();
		this.addKeyListener(new KeyInput(handler));// listening to the key input

		new Window(WIDTH, HEIGHT, "Test game", this); // width and height of the
														// window
		hud = new HeadUpDisplay();
		spawner = new Spawner(handler,hud);
		r = new Random();
		
		handler.addObject(new Player(WIDTH / 2 - 32, HEIGHT / 2 - 32, ID.Player,handler));
		handler.addObject(new BasicEnemy(r.nextInt(WIDTH),r.nextInt(HEIGHT), ID.Enemy,handler));	// new player object and its location
		// (WIDTH/2-32,HEIGHT/2-32) = middle of the screen
		
	}

	public synchronized void start() { // starting the thread
		thread = new Thread(this);
		thread.start();
		runnuing = true;
	}

	public synchronized void stop() { // stopping thread
		try {
			thread.join();
			runnuing = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() { // game loop code
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;

		while (runnuing) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				tick();
				delta--;
			}
			if (runnuing)
				render();
			frames++;

			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				// System.out.println("FPS :" + frames);
				frames = 0;
			}
		}
		stop();
	}

	private void tick() {
		handler.tick();
		hud.tick();
		spawner.tick();
	}

	private void render() {
		BufferStrategy bs = this.getBufferStrategy(); // Rendering the screen to
														// lower fps
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics(); // make a graphic window

		g.setColor(Color.black); // setting a color
		g.fillRect(0, 0, WIDTH, HEIGHT); // filling a rectangle with the color

		handler.render(g);
		hud.render(g);
		g.dispose();
		bs.show();
			
	}
	
	public static int clamp(int var,int min ,int max){   // Defining the windows height and width for player object
		if ( var >+ max){
			return var =max;
		}else if (var <= min) {
			return var = min ;
		} 
		else return var ;
	
	}

	public static void main(String args[]) {
		new Game();
	}

}
