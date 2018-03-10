import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class SpecialEnemy extends GameObject {

	
	private Handler handler;
	
	public SpecialEnemy(int x, int y, ID id,Handler handler) {
		super(x, y, id);
		
		this.handler=handler;
		
		velX =2 ;
		velY =10 ;
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 16, 16);	
	}

	public void tick() {// movement of object to x and y axis
		x +=velX;
		y +=velY;
		
		if (y <=0 || y >= Game.HEIGHT -32) velY *=-1 ;
		if (x <=0 || x >= Game.WIDTH -16) velX *=-1 ;
		
		handler.addObject(new Trail(x, y, Color.magenta, ID.Trail, 16, 16, 0.1f , handler));
	}


	public void render(Graphics g) {
		g.setColor(Color.magenta);
		g.fillRect(x, y, 16, 16);
		
	}

}
