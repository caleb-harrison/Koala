import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Tester {
	
	public static void main(String[] args) {

		// width and height
		int WIDTH = 500;
		int HEIGHT = 500;

		// create JFrame
		JFrame frame = new JFrame();

		// set the size
		frame.setSize(WIDTH, HEIGHT);

		// set the title
		frame.setTitle("Koala");

		// set close operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// add components
		Koala drawing = new Koala();
		frame.add(drawing);

		// set visibility
		frame.setVisible(true);

	}

}
