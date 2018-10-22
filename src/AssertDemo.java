/* 
 * CSS 162 Assert Demo
 * 
 * Usage: This software is configured to crash your program immediately upon execution.
 * If your software doesn't crash, you don't have assertions enabled (use "-ea")
 * in your editor.  Google the name of your editor and "how to enable asserts" or follow
 * the instructions specific to BlueJ or Eclipse in the lab.
 * 
 * Author: Rob Nash
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AssertDemo {

	/****************************************************/
	/* 1) I prefer to use the variable view while stepping
	 * over and into executions. I also like to build the class
	 * around a test-driven environment so that I know the invariance
	 * 
	 * 2) I would say that using asserts is better for longer programs
	 * with a lot of methods. It would cut down on the inconvenience
	 * of having to add print statements and stepping through line
	 * by line.
	 *  
	 * 3) an advantage of using a GUI debugger would be for
	 * translation of what's actually happening without focusing
	 * too heavily on details that are present but not relevant.
	 *  
	 * 4) Proper documentation is key for understanding, later, what
	 * a methods function is or what purpose some variables have. 
	 * This could be especially important when working in teams
	 *  or collaboratively.
	 *  */
	/****************************************************/
	public static void main(String[] args) {
		assert(true);
//		assert(false);
//		
//		warmUpAsserts();
//		
//		assertWithPrimitives();
//		
		assertWithObjects();
//		
//		homeworkRelatedAsserts();
	}

	/*
	 * Just a few warm-up asserts here.
	 * Add two new assert() statements after the TODO below
	 */
	private static void warmUpAsserts() {	
			assert( 5 > 1 );
			
			int a = 30;
			assert(a != 0);
	
			assert(null == null);
			assert(true == true);
			
			//new asserts (x2)
			assert(0 < 1 || 1> 0);
			String str1 = "string1";
			String str2 = "String1";
			assert(str1.equalsIgnoreCase(str2));
	}

	/*
	 * Using asserts in conjunction with primitive types is familiar to you;
	 * just as in a loop or if, you want to form a true/false (boolean) expression
	 * by employing the relational operators.
	 */
	private static void assertWithPrimitives() {
		//assert below to ensure a Fraction's denominator is never 0
		Scanner keys = new Scanner(System.in);
		System.out.println("Enter an integer numerator:");
		int num = keys.nextInt();
				
		System.out.println("Enter an int denominator, not 0:");
		int denom = keys.nextInt();
				
		assert(denom != 0);
	
		//assert that all ArrayLists start empty
		ArrayList<String> emptyList = new ArrayList<String>();
		assert(emptyList.size() == 0);
	}
	
	/*
	 * Asserts work with both primitives and objects.  Just as you 
	 * use "==" with primitives and ".equals()" with objects, so too 
	 * will you use ".equals()" in asserts that deal with object equality. 
	 */
	private static void assertWithObjects() {
		AssertDemo ad = new AssertDemo();
		ad.checkAddress(ad);		
		//guess what .equals() does if you don't create one yourself? (hint ==)
		assert( ad.equals(ad) );  
		//TODO: make a few objects from any previous lab and test them with assert
		//example: make two Point objects at the origin and assert they are equal
		//assert(p1.equals(p2);  //example
	}


	/*
	 * This function compares the address at "this" to the address of the object handed 
	 * into the function.
	 * this references the current object in memory
	 * while 'input' references the copy(?) of the current
	 * object in memory. The addresses should be the same
	 * because it is still the same object.
	 */
	public void checkAddress(Object input) {
		System.out.println("Address of this :" + this);
		System.out.println("Address of input:" + input);
		assert(this.equals(input));
		assert(input.equals(this)); //opposite of above
	}

	/*	
	 * Asserts are a useful tool for transforming postconditions and class invariants into code.
	 * Lets build a few asserts that work with your current Bill & Money assignment.
	 * Change the value of paidDate and cents to trip the asserts and observe the asserted error message. 
	 */
	private static void homeworkRelatedAsserts() {
		Object paidDate = new Object();  //really, a Date 
		assert( paidDate != null);  	 //perhaps one rule is that paidDate shouldn't be null after calling setPaidDate()
		int cents = 0;
		assert( cents >= 0 && cents <=99);  //another class invariant is written as an assert here.
		//TODO: craft 2 more asserts that you could use with any assignment
	}
}
