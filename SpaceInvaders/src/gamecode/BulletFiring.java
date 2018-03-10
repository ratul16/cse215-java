package gamecode;

import java.awt.*;

public class BulletFiring extends Thread {
	
	private GameBoard board;
	private Ghost[] ghosts;
	private Bullet bullet;
	
	
	
	public BulletFiring(GameBoard board, Ghost[] ghosts, Bullet bullet) {
		super();
		this.board = board;
		this.ghosts = ghosts;
		this.bullet = bullet;
	}



	public void run(){
		
		while(bullet.getY() > -10){
			
			bullet.setY(bullet.getY() - 5);
			checkCollision();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
			board.repaint();
		}
		
	}
	
	public void checkCollision(){
		
		Rectangle bulletRect = new Rectangle(bullet.getX(),bullet.getY(),8,8);
		
		for(int i = 0; i < ghosts.length; i++){
			
			Rectangle ghostRect = new Rectangle(ghosts[i].getX(),ghosts[i].getY(),32,32);
			
			if(bulletRect.intersects(ghostRect) == true){
				Sound.bulletHitSound();
				board.score++;
				ghosts[i].setAlive(false);
				ghosts[i].setX(-500);
				bullet.setX(5000);
				
			}
			
			
		}
		
		
		
		
	}

	
	
	
	
	
	
}
