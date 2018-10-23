public class Square {

	/*
	 * Square class
	 * Begins with three constructors for different values
	 * used when creating a square.
	 * */
	private int x,y;
	private double sideLength;
	private String shape_Square = "[]";
	
	//No arg constructor
	//Has no action and will not create object. Simply overloads the detault no-arg constructor
	public Square() {}
	
	//Another overloaded constructor that takes an X and Y coordinate value
	public Square(int newX, int newY) {
		x = newX;
		y = newY;
	}
	
	//The last of the overloaded constructors.
	//Like with the previous c'tors, this one simply adds the final variable
	//assignment for the class
	public Square(int newX, int newY, double newSideLength) {
		x = newX;
		y = newY;
		sideLength = newSideLength;
	}

	//draw() method simply outputs the String declared at class level labeled "shape_Square"
	public void draw() {
		System.out.println(shape_Square);
	}
	
	/*Getters & Setters*/
	/*
	 * I wrote most of these in just single lines because it takes less space 
	 * and isn't required to expand when the module has so few lines
	 * */
	public int getX() {return x;}

	public int getY() {return y;}

	public double getSideLength() {return sideLength;}
	
	public double getArea() {return sideLength * sideLength;}

	public void setX(int x) {this.x = x;}

	public void setY(int y) {this.y = y;}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	//isEqual(arg1) - Boolean module that compares Square objects using their constructs
	//Since the data type being compared is integer, the `==` equivalence is used
	public boolean isEqual(Square sq_Object) {
		//The area of the objects is checked and if they are the same along with the same lengths
		//of the side, then they must be equal.
		if(this.getArea() == sq_Object.getArea() && this.sideLength == sq_Object.sideLength) {
			return true;
		}else {
			return false;
		}
	}
	
	/*
	 * This method is overridden
	 * The @Override mention is used here to tell the program 
	 * that where toString is used, to use the one marked as the override option.
	 * */
	@Override
	public String toString() {
		return "[]";
	}
}
