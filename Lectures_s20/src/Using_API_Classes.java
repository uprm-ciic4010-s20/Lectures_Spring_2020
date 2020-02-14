import java.util.Random;
/* Hints:
 * type "sout" then press CTRL-SPACE for ---> System.out.println();
 * press CRTL-/ to comment/uncomment selected lines
 * use the debugger to view and explore the below methods work
 */
public class Using_API_Classes {

	public static void main(String[] args) {
		//Random & Math APIs =============================================

//		Random myGen = new Random();
//
//		int x = myGen.nextInt(6); // 0 --> 5
//		x = myGen.nextInt(6) + 2; // numbers from 2 --> 7 
//		x = myGen.nextInt(11) -5; // -5 ... +5
//		System.out.println("X is now: " + x);
//		double y = myGen.nextDouble(); // double value between 0.0 and 1.0 (exclusive)
//		System.out.println("y: " + y);
//
//		// Max
//		System.out.println("Max: " + Math.max(44,-22));// 44
//		System.out.println("Max: " + Math.max(-44,-22)); //-22
//
//		// Min
//		System.out.println("Min: " + Math.min(-44, -22)); // smallest of 2 numbers
//		System.out.println("Min: " + Math.min(-33, Math.min(-44, -22))); // smallest of 3 numbers
//
//		// Other Math API functions
//		System.out.println("PI: " + Math.PI);
//		System.out.println(Math.sqrt(4)); // sqrt of 4 = 2
//		System.out.println(Math.sqrt(Math.pow(3,2))); // sqrt of 3^2
//		System.out.println("Round: " + Math.round(19.57)); //20
//		System.out.println("Floor: " + Math.floor(19.47)); //19
//		System.out.println("Ceiling: " + Math.ceil(19.47)); //20
//
//		System.out.println("Hypotenuse?"); // Hypotenuse?
//		System.out.println(Math.sqrt(Math.pow(3,2) + Math.pow(4, 2)));
//		System.out.println(Math.hypot(3, 4));
//		
//
//		// Variables are mutable =========================================
//		int number = 0;
//		number = 1;
//		number = 2;
//		number = 3;


		// String objects are immutable ==================================
//		String thing0;
//		thing0 = "";
//		thing0 = "Thing";
//		thing0 = "Thing" + " #1";
//
//		
//		// String equality ===============================================
//		String thing1 = "Thing #1";
//		String thing2 = "Thing #1";	
//		boolean theSame = (thing1 == thing2);
//		thing2 = new String("Thing #1");
//		theSame = (thing1 == thing2);
//		theSame = thing1.equals(thing2);
//		
//		// StringBuffers are mutable strings =============================
//
//		// Java's original name was ... 
//		String fact1;
//		fact1 = "Java's original name was";
//		fact1 = fact1 + "oak";


		// Java was invented in ...  in 1995 ... by Sun Microsystems.
//		StringBuffer demo = new StringBuffer();
//		StringBuffer fact2 = new StringBuffer("Java was invented in");
//		fact2.append(" in 1995");
//		fact2.append(" by Sun Microsystems");
//		fact2.toString();
//		fact2.delete(20, 40);
//		fact2.toString();
//
//
//		// String versus StringBuffer manipulation =============
//		String priceUS = "1,234,567.89"; // EU ==> 1.234.567,89
//		String priceEU = priceUS.replace('.', '#'); 
//		priceEU = priceEU.replace(',', '.'); 
//		priceEU = priceEU.replace('#', ','); 
//
//		
//		StringBuffer url = new StringBuffer("www.uprx");
//		// www.uprx --> www.uprx.edu --> www.uprm.edu
//		url.append(".edu");
//		//int loc = url.indexOf("x");
//		url.setCharAt(url.indexOf("x"), 'm');
//
//
//		// Strings
//		String fullName = "José Cruz";  // José Cruz --> Cruz,José
//		
//		// Find the position of the space character 
//		int spacePos = fullName.indexOf(' ');
//
//		// Extract the first-name from full-name 
//		String firstName = fullName.substring(0, spacePos);
//
//		// Extract the last-name from full-name 
//		String lastName = fullName.substring(spacePos + 1);
//
//		// Concatenate last-name space comma & first-name
//		String reversed = lastName + ", " + firstName;		

		String eMail = "duke@images.java.com";
		// Username?
		int loc = eMail.indexOf('@');
		// where is @
		// valid email?, contains @? -1?

		// TLD ==> .com  .edu  .org  
		// find the dot
		//loc = eMail.lastIndexOf('.');
		String tld = eMail.substring(eMail.lastIndexOf('.') + 1);
		
		// substring starting at ??
		// find the last dot
		// substring starting at ??

		eMail = "john.smith@ciic.uprx.edu";
		// Is this a valid educational e-mail with an @ and ending in .edu?

		eMail.indexOf("@");  // check for @
		eMail.substring(eMail.lastIndexOf(".")); // get TLD

		// How about a method?
		validEmail("john.smith@ciic.uprx.edu");

	} // End of main method

	//valid educational e-mail with an @ and ending in TLD edu
	static boolean validEmail(String eMail) {
		return (eMail.indexOf("@") >=1 &&
				eMail.substring(eMail.lastIndexOf(".") + 1).equals("edu"));
	}

}
