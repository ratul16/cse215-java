import java.util.Random;


public class Spawner {
 
	private Handler handler;
	private HeadUpDisplay hud;
	private Random r = new Random();
	
	private int scoreKeep = 0 ;
	
	
	public Spawner(Handler handler,HeadUpDisplay hud) {
	this.handler=handler;
	this.hud=hud;
	
	
	}
	

	public void tick(){
	
		scoreKeep++;
		
	if(scoreKeep >=100){
	
		scoreKeep = 0 ;
		hud.setLevel(hud.getLevel()+1);
		
		if(hud.getLevel()==2){
			handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH) , r.nextInt(Game.HEIGHT), ID.Enemy, handler));	
		} else if(hud.getLevel()==3){
			handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH) , r.nextInt(Game.HEIGHT), ID.Enemy, handler));
		}  else if(hud.getLevel()==4){
			handler.addObject(new SpecialEnemy(r.nextInt(Game.WIDTH) , r.nextInt(Game.HEIGHT-50), ID.SpecialEnemey, handler));
			
		}
		
	}
		
		
	}
	
}
