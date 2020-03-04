import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Car {
	
	private int x;
	private int y;
	private Color color;
	
	public Car(int x, int y, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	
	public Car(int x, int y) {
		this(x, y, Color.BLACK);
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Color getColor() {
		return color;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void draw(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;

		Rectangle body = new Rectangle(x+0,y+10,60,10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(x+10,y+20,10,10);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(x+40,y+20,10,10);
		Line2D.Double frontWindow = new Line2D.Double(x+10,y+10,x+20,y+0);
		Line2D.Double roof = new Line2D.Double(x+20,y+0,x+40,y+0);
		Line2D.Double rearWindow = new Line2D.Double(x+40,y+0,x+50,y+10);
		
		g2D.setColor(Color.BLACK);
		g2D.fill(frontTire);
		g2D.fill(rearTire);
		g2D.draw(frontWindow);
		g2D.draw(roof);
		g2D.draw(rearWindow);
		g2D.setColor(color);
		g2D.fill(body);
	}

}
