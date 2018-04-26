public class CallStack{

	// Called by func1()
	void func2 (){
		System.out.println("In func2 method");
		int a = 0;
		int b;
		b = 10 / a;
	}

	//Called by Main
	void func1(){
		System.out.println("In func1 method");
		this.func2 ();
		System.out.println("Back in func1 method");

	}


	public static void main (String args[]){
		CallStack myCallStack;
		myCallStack = new CallStack();
		System.out.println("In the main method");
		try{
			myCallStack.func1 ();
		}catch(ArithmeticException ae){
			System.out.println("The denominator was 0, cannot divide.");
		}
	}
}

