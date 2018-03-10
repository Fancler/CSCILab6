package lab6;


//imports
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JFrame;

//uml1
public class GameFrame {
	
	//static Component label = "game";

	
	public static void main(String[] args) {
	
	// create the frame.
	JFrame gameframe = new JFrame("GameFrame");

	// action when the frame closes?
	gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// Create components add them in the frame.
	//create Label...
	//gameframe.getContentPane().add(label, BorderLayout.CENTER);

	// Set the size of the frame.
	gameframe.pack();

	// make frame visible.
	gameframe.setVisible(true);

	
	
	}	
	
}