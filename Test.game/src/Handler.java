import java.awt.Graphics;
import java.util.LinkedList;



public class Handler {

	LinkedList<GameObject> objects = new LinkedList<GameObject>();
	
	public void tick(){
		for(int i =0;i < objects.size();i++){ // loop through all objects
			GameObject tempObject = objects.get(i);
			
			tempObject.tick();
			
		}
	}
	
	public void render(Graphics g){ // loop through all objects to render
		for(int i=0; i <objects.size();i++){
			GameObject tempObject = objects.get(i);
		
			tempObject.render(g);
			
		}
	}
	
	public void addObject(GameObject object){ //adding game objects from the list
		this.objects.add(object);
	
	}

	public void removeObject(GameObject object){ //remove game objects from the list
		this.objects.remove(object);
	
	}

}
