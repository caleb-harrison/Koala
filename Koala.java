import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Koala extends JComponent {

	public void paintComponent(Graphics g) {
	// recast as Graphics 2D
		Graphics2D brush = (Graphics2D)g;

	// color scheme
		Color gray = new Color(166, 177, 186);
		Color skyblue = new Color(61, 188, 242);
		Color grassgreen = new Color(27, 82, 0);
		Color cloudwhite = new Color(245, 245, 245);
		GradientPaint orangeToYellow = new GradientPaint(
									   450, 50, Color.ORANGE,
           						       500, 0, Color.YELLOW);
		Color[] sunsetColors = {new Color(255, 233, 2),  //yellow
								new Color(233, 62, 63),  //red
								new Color(45, 36, 106)}; //purple
		float[] dist = {0.2f, 0.5f, 1.0f};
		RadialGradientPaint sunset =
        new RadialGradientPaint(new Point2D.Float(250, 375), // center
        						340,  // radius
        						dist, // fractional values per color
        						sunsetColors); // sunset color scheme
		

	// draw background
		Rectangle2D.Double sky = new Rectangle2D.Double(
			0.0,    // x value
			0.0,    // y value
			500.0,  // width
			370.0); // height
		brush.setPaint(sunset);
		brush.fillRect(0,0,500,370);

		Rectangle2D.Double grass = new Rectangle2D.Double(
			0.0,    // x value
			370.0,  // y value
			500.0,  // width
			130.0); // height
		brush.setColor(grassgreen);
		brush.fill(grass);

		Ellipse2D.Double cloud1 = new Ellipse2D.Double(
			50.0,  // x value
			100.0, // y value
			180.0, // width
			45.0); // height
		brush.setColor(cloudwhite);
		brush.fill(cloud1);

		Ellipse2D.Double cloud2 = new Ellipse2D.Double(
			120.0, // x value
			80.0,  // y value
			80.0,  // width
			50.0); // height
		brush.fill(cloud2);

		Ellipse2D.Double cloud3 = new Ellipse2D.Double(
			420.0, // x value
			200.0, // y value
			180.0, // width
			45.0); // height
		brush.fill(cloud3);

		Ellipse2D.Double cloud4 = new Ellipse2D.Double(
			490.0, // x value
			180.0, // y value
			80.0,  // width
			50.0); // height
		brush.fill(cloud4);

	// draw ears
		Ellipse2D.Double ear1out = new Ellipse2D.Double(
			65.0,   // x value
			95.0,   // y value
			130.0,  // width
			130.0); // height
		brush.setColor(gray);
		brush.fill(ear1out);
		brush.setStroke(new BasicStroke(5));
		brush.setColor(Color.BLACK);
		brush.draw(ear1out);

		Ellipse2D.Double ear2out = new Ellipse2D.Double(
			305.0,  // x value
			95.0,   // y value
			130.0,  // width
			130.0); // height
		brush.setColor(gray);
		brush.fill(ear2out);
		brush.setStroke(new BasicStroke(5));
		brush.setColor(Color.BLACK);
		brush.draw(ear2out);

		Ellipse2D.Double ear1in = new Ellipse2D.Double(
			85.0,  // x value
			115.0, // y value
			90.0,  // width
			90.0); // height
		brush.setColor(Color.BLACK);
		brush.fill(ear1in);

		Ellipse2D.Double ear2in = new Ellipse2D.Double(
			325.0, // x value
			115.0, // y value
			90.0,  // width
			90.0); // height
		brush.setColor(Color.BLACK);
		brush.fill(ear2in);

  	// draw body
  		Ellipse2D.Double body = new Ellipse2D.Double(
			125.0,  // x value
			300.0,  // y value
			250.0,  // width
			500.0); // height
		brush.setColor(gray);
		brush.fill(body);
		brush.setStroke(new BasicStroke(5));
		brush.setColor(Color.BLACK);
		brush.draw(body);

	// draw head
		Ellipse2D.Double head = new Ellipse2D.Double(
			125.0,  // x value
			125.0,  // y value
			250.0,  // width
			250.0); // height
		brush.setColor(gray);
		brush.fill(head);
		brush.setStroke(new BasicStroke(5));
		brush.setColor(Color.BLACK);
		brush.draw(head);

	// draw eyes
		Ellipse2D.Double eye1 = new Ellipse2D.Double(
			180.0, // x value
			220.0, // y value
			35.0,  // width
			35.0); // height
		brush.setColor(Color.BLACK);
		brush.fill(eye1);

		Ellipse2D.Double eye2 = new Ellipse2D.Double(
			285.0,  // x value
			220.0,  // y value
			35.0,   // width
			35.0);  // height
		brush.setColor(Color.BLACK);
		brush.fill(eye2);

		Ellipse2D.Double eye1shimmer = new Ellipse2D.Double(
			197.0, // x value
			225.0, // y value
			13.0,  // width
			13.0); // height
		brush.setColor(Color.WHITE);
		brush.fill(eye1shimmer);

		Ellipse2D.Double eye2shimmer = new Ellipse2D.Double(
			303.0,  // x value
			225.0,  // y value
			13.0,   // width
			13.0);  // height
		brush.setColor(Color.WHITE);
		brush.fill(eye2shimmer);

	// draw nose
		Ellipse2D.Double nosebottom = new Ellipse2D.Double(
			216.0, // x value
			240.0, // y value
			68.0,  // width
			85.0); // height
		brush.setColor(Color.BLACK);
		brush.fill(nosebottom);

	// draw smile
		brush.setColor(Color.BLACK);
		brush.setStroke(new BasicStroke(6));
		brush.drawLine(
			250,  // beginning x value
			300,  // beginning y value
			250,  // ending x value
			340); // ending y value
		brush.setStroke(new BasicStroke(10));
  		brush.drawArc(
  			200,   // x value
  			240,   // y value
  			100,   // width
  			100,   // height
  			-45,   // starting angle
  			-90);  // ending angle

	}

}