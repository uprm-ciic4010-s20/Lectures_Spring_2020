import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class Canvas extends JComponent{
	
	Car c1 = new Car(0,0,Color.BLUE);

	public void paintComponent(Graphics g) {
		// Draw Here
		Graphics2D g2D = (Graphics2D) g;

		int speed=5;
		c1.draw(g);
		c1.setX(c1.getX() + speed);

//		Car c2 = new Car(this.getWidth()-60,this.getHeight()-30,Color.RED);
//		c2.draw(g);

	}
	
	public boolean carReachedBorder() {
		
		return (c1.getX()+60 >= this.getWidth());
		
	}
}
