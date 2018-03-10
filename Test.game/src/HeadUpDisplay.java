import java.awt.Color;
import java.awt.Graphics;

public class HeadUpDisplay {

	public static int HEALTH = 100;
	private int greenValue = 255;
	
	private int score = 0 ;
	private int level = 1 ;
	
	
	public void tick() {
	HEALTH=Game.clamp(HEALTH, 0, 100);
	
	greenValue = Game.clamp(greenValue, 0, 255); // changing color from green to red 
	greenValue= HEALTH*2 ;
	
	score++;
	
	
	}


	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(10, 10, 200, 20); //  position of the health bar
		g.setColor(new Color(75, greenValue , 0));
		g.fillRect(10, 10, HEALTH*2, 20);
		g.setColor(Color.ORANGE);
		g.drawRect(10, 10, 200, 20);
		
		g.setColor(Color.cyan);
		g.drawString("Score = "+ score, 10, 48);
		g.drawString("Level = "+ level, 10, 60);
		
		
	}
	
	public void score(int score){
		
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
	
	
}
