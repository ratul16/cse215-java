import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;


public class Window extends Canvas{
	
	private static final long serialVersionUID = -8255319694373975038L;
	
	public Window(int width, int height, String title,Game game){
		JFrame frame= new JFrame(title);//window title 
		
		frame.setPreferredSize(new Dimension(width, height));// the size of the window
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// the cross button operation of the window
		frame.setResizable(false);// to resize the window "false = can't resize" 
		frame.setLocationRelativeTo(null);// the location of the window in the screen
		frame.add(game);//adding the game class to the frame
		frame.setVisible(true);// for the window to be visible 
		game.start();//to run the window
		
	
		
	}
	
	

}
