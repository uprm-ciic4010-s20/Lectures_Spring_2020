import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JComponent;

public class Canvas extends JComponent{


	private final int NUM_CARS = 10;

	Car cars[];
	
	Random speedGen = new Random();

	int laneY = 0;
	public Canvas(int numCars) {
		
		this.cars = new Car[numCars];

		for(int i=0; i<numCars; i++) {
			cars[i] = new Car(0,laneY, Color.BLUE);
			laneY += 40;
		}
	}


	public void paintComponent(Graphics g) {
		// Draw Here
		Graphics2D g2D = (Graphics2D) g;

		int maxCarPos = 0;
		for(int i=0; i<cars.length; i++) {
			if (cars[maxCarPos].getX() < cars[i].getX()) {
				maxCarPos = i;
			}
		}
		cars[maxCarPos].setColor(Color.RED);
		
		for (int i=0; i<cars.length; i++) {
			int speed = this.speedGen.nextInt(10);
			cars[i].draw(g);
			cars[i].setX(cars[i].getX() + speed);
		}
		
		cars[maxCarPos].setColor(Color.BLUE);
		
		

		//		Car c2 = new Car(this.getWidth()-60,this.getHeight()-30,Color.RED);
		//		c2.draw(g);

	}

	public boolean aCarReachedBorder() {

		for (int i=0; i<cars.length; i++) {
			if (cars[i].getX()+60 >= this.getWidth()) {
				return true;
			}
		}
		return false;
	}
}
