import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Canvas extends JComponent{
	
	public void paintComponent(Graphics g) {
		// Draw Here
		Graphics2D g2D = (Graphics2D) g;
		//int grade = 3/4; // 75%  0.75
		//double grade = 3/4.0 ; // 75%  0.75
		//System.out.println("Grade: " + grade);
		
//		//Construct a Rectangle
//		Rectangle box = new Rectangle(10,10,100,50);
//		//g2D.draw(box);
//		g2D.fill(box);
//		
//		box.translate(100, 100);
//		g2D.draw(box);
//		
//		Ellipse2D.Double circle = new Ellipse2D.Double(200,200,100,50);
//		g2D.draw(circle);
		
		//Construct a car
		Rectangle body = new Rectangle(0,10,60,10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(10,20,10,10);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(40,20,10,10);
		Line2D.Double frontWindow = new Line2D.Double(10,10,20,0);
		
		g2D.draw(body);
		g2D.fill(frontTire);
		g2D.fill(rearTire);
		g2D.draw(frontWindow);
		
        // ***************************************************************
		// add & draw rearWindow
		// add & draw roof
		// add color to the car
		
	}
}
