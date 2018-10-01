import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyDrawing extends JPanel {
	private Cat cat;
	private JLabel text;
	public MyDrawing() 
	{
		// Add critters to the drawing
		cat = new Cat();
		text = new JLabel("Kitty family");
		text.setHorizontalAlignment(JLabel.CENTER);
		this.add(text);
		
		
	}
	// paintComponent is called automatically when the frame needs
	// to display (e.g., when the program starts)
	public void paintComponent(Graphics g) {
		cat.draw(g, 50, 50);
		cat.draw(g, 50, 250);
		cat.draw(g, 250, 250);
		cat.draw(g, 250, 50);
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Program will end when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Change background color to blue
		frame.setBackground(Color.CYAN);
		// Set the size (otherwise only title bar displays)
		frame.setSize(640, 480);
		// Put frame in center of screen
		frame.setLocationRelativeTo(null);
		// Create a JPanel (MyDrawing), we'll draw on this
		frame.setContentPane(new MyDrawing());
		
		// Frame will not display until you set visible true
		frame.setVisible(true);
	}

}
