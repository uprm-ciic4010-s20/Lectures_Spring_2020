public class HeronsFormula {

	public static void main(String[] args) {
		double a = 10;
		double b = 10;
		double c = 10;
		double s = (a + b + c) /2;
		double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		System.out.println("The area of the first triangle is " + area);

		a = 20;
		b = 20;
		c = 20;
		area = areaOfTriangle(20, 20, 20);
		System.out.println("The area of the second triangle is " + area);

		//a = 30;  b = 40; c = 50;
		System.out.println("The area of the third triangle is " + 
				areaOfTriangle(30, 40, 50));

	}

	public static double areaOfTriangle(double s1, double s2, double s3) {
		double s = (s1 + s2 + s3)/2;
		double area = Math.sqrt(s * (s-s1) * (s-s2) * (s-s3));
		return area;
	}
}