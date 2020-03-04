import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class Canvas extends JComponent{
	
	public void paintComponent(Graphics g) {
		// Draw Here
		Graphics2D g2D = (Graphics2D) g;

		Car c1 = new Car(0,0,Color.BLUE);
		c1.draw(g);

		Car c2 = new Car(this.getWidth()-60,this.getHeight()-30,Color.RED);
		c2.draw(g);

	}
}
