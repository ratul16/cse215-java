import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject{

	Random random = new Random();
	Handler handler;
	
	
	
	public Player(int x, int y, ID id,Handler handler) {
		super(x, y, id);
		this.handler=handler;
		//velX=random.nextInt(5);	//speed of object
		//velY=random.nextInt(5);
		
	}
		
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);	
	}
	
	
	public void tick() { // movement of object to x and y axis
		
		x +=velX;
		y +=velY;
		x = Game.clamp(x, 0, Game.WIDTH-37); // limiting player from out of border of width
		y = Game.clamp(y, 0, Game.HEIGHT-60); // limiting player from out of border of height
		handler.addObject(new Trail(x, y, Color.blue, ID.Trail, 32, 32, 0.1f , handler));
		collsion();
	
	}
	
	private void collsion() { // collision of object 
		
		for(int i=0;i<handler.objects.size();i++){
			GameObject tempObject = handler.objects.get(i);
			
		if(tempObject.getId() == ID.Enemy || tempObject.getId() == ID.SpecialEnemey){  
			if(getBounds().intersects(tempObject.getBounds())){
				//collision code 
				HeadUpDisplay.HEALTH -=2 ;
			}
		}
			
			
			
		}
		
	}

	
	
	public void render(Graphics g) {
		
		g.setColor(Color.blue);
		g.fillRect(x, y, 32, 32);
		
		
	}


	
	
	
}
