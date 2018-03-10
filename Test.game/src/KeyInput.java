import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class KeyInput extends KeyAdapter {

	private Handler handler;
			
			
			
	public KeyInput(Handler handler){
		this.handler=handler;  // getting key input
	}
	
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode(); // display key number value
		
		for(int i =0 ;i<handler.objects.size();i++){
			GameObject tempObject =handler.objects.get(i);
			
			if(tempObject.getId() == ID.Player){
				// all events of player 1
				
				// specific key input
				if(key == KeyEvent.VK_UP) tempObject.setVelY(-5); 
				if(key == KeyEvent.VK_DOWN) tempObject.setVelY(5); 
				if(key == KeyEvent.VK_RIGHT) tempObject.setVelX(5); 
				if(key == KeyEvent.VK_LEFT) tempObject.setVelX(-5); 
			}
			
		}
		
		if (key == KeyEvent.VK_ESCAPE) System.exit(1);
		
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
		
		for(int i =0 ;i<handler.objects.size();i++){
			GameObject tempObject =handler.objects.get(i);
			
			if(tempObject.getId() == ID.Player){
				// all events of player 1
				
				// specific key input
				if(key == KeyEvent.VK_UP) tempObject.setVelY(0); 
				if(key == KeyEvent.VK_DOWN) tempObject.setVelY(0); 
				if(key == KeyEvent.VK_RIGHT) tempObject.setVelX(0); 
				if(key == KeyEvent.VK_LEFT) tempObject.setVelX(0); 
			}
			
		}
		
		
		
	}
	
}
