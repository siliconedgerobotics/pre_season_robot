package flappyBird;

import java.awt.Graphics;
import javax.swing.JFrame;

public class FlappyBird {
	
	public static FlappyBird flappyBird;
	public final int WIDTH = 800, HEIGHT = 600;
	
	public Renderer renderer;
	
	public FlappyBird()
	{
		renderer = new Renderer();
		JFrame jframe = new JFrame();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setVisible(true);
		jframe.setResizable(false);
	}
	
	public void repaint(Graphics g){
		
	}
	
	public static void main(String[]args){
		flappyBird = new FlappyBird();
	}
	
}
