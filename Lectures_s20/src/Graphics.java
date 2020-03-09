import javax.swing.JFrame;

public class Graphics {

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame();
		frame.setSize(400,600);
		frame.setTitle("My Picture Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Canvas myCanvas = new Canvas(10);
		frame.add(myCanvas);
		
		frame.setVisible(true);
		
		while(!myCanvas.aCarReachedBorder()) {
			
			frame.repaint();
			Thread.sleep(100);
			
		}
	}

}
