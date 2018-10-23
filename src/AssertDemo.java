import java.util.ArrayList;
import java.util.Scanner;

/*
 * (1) Which technique do you prefer?
 * 		a. Why?
 * 		I prefer the debugger because it has more control over the flow and pace of execution.
 * 
 * (2) Are some debugging techniques more (or less) appropriate for longer programs?
 * 	Some tools would probably be best with small logic programs or areas in large amounts of code that are targeted
 * 	and known to have issues. Using asserts through a massive program with lots of server and client side programming is not
 * 	ideal, but step-throughs are also unncessary for small programs that only require a few lines of code or small classes.
 * 	Each have benefits depending on class and problem size.
 * 	
 * (3) What are the advantages to using a debugger with a GUI?
 * 		a. What can you inspect here that you couldn’t when just printing to the console?
 * 			Having a GUI to work with the debugger and have that in turn affect the compiler is really helpful to control
 * 			the flow of data. It helps to use a more visual approach sometimes when you aren't sure how exactly a line or module
 * 			is behaving.
 * (4) How can proper documentation help in finding and avoiding bugs?
 * 		Proper documentation is key not only for the person writing but the people reading. It's necessary that the 
 * 		language and commentary is understood so future development is faster and troubleshooting is more collaborative.
 * */

/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/22/2018
 * 
 * This class is a series of assertions used in different examples. 
 * Examples include assertions with Objects and primitives as well as some general ones that are independent
 */
public class AssertDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		assert(true);

		//assert(false); //This is the bad assert since if enabled will cause all true statements to fail

		warmUpAsserts();

		assertWithPrimitives();

		assertWithObjects();

		homeworkRelatedAsserts();
	}

	/**
	 * Contains true assertion statements and will fail if assert(false)
	 * is used in main.
	 */
	private static void warmUpAsserts() {	
		assert( 5 > 1 );

		int a = 30;
		assert(a != 0);

		assert(null == null);  
		assert(true == true);
		
		/*Two Extra Asserts*/
		assert(false == false);
		assert(1 < 5);
	}

	/**
	 * Contains Scanner for collecting user input stored in a numerator and denominator
	 * Will produce assertion errors if false assert()'s are added.
	 * 
	 * Checks that if numerator and denominator are equal, the value is 1.
	 */
	private static void assertWithPrimitives() {
		Scanner keys = new Scanner(System.in);
		System.out.println("Enter an integer numerator:");
		int num = keys.nextInt();

		System.out.println("Enter an int denominator, not 0:");
		int denom = keys.nextInt();

		assert(denom != 0); //assert denominator cannot be 0

		//assert that all ArrayLists start empty
		ArrayList<String> emptyList = new ArrayList<String>();
		assert(emptyList.size() == 0);
		keys.close();
		/*Two Extra Asserts*/
		if(num == denom) {
			assert(num/denom == 1);
		}else {
			assert(num/denom > 1 || num/denom < 1);
		}
	}
	
	/**
	 * Using assert statements with object instantiation. Square.class was used in Lab 2 and again here
	 * to check that it's true when copying a Square that their areas are equal.
	 */
	private static void assertWithObjects() {
		AssertDemo ad = new AssertDemo();
		ad.checkAddress(ad);		
		
		assert(ad.equals(ad));  
		
		Square sq1 = new Square(10, 10, 10);
		Square sq2 = sq1;
		
		assert(sq1.getArea() == sq2.getArea()): "Areas are teh same";
		
	}


	/**
	 * @param input <p>Represents and object to compare with.
	 */
	public void checkAddress(Object input) {
		System.out.println("Address of this: " + this);
		System.out.println("Address of input: " + input);
		//2 total instances of this are represented here by the keywords 'this' and 'input'
		assert(this.equals(input));
	}

	/**
	 * Contains assertion statemtents applicable to latest homework.
	 */
	private static void homeworkRelatedAsserts() {
		Object paidDate = null;
		assert(paidDate != null);
		int cents = 101;
		assert( cents >= 0 && cents <=99);  
		
		//assert(month >= 1);
		//assert(day >= 1);
	}
}
