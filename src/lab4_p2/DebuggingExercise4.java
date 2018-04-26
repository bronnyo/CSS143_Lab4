package lab4_p2;

/****************************************************/
/* 2a) the watch window for me (I moved it) sits on 
 * the right side of the code window
 * 
 * 	2a.i) I can watch variables and assignments happen as soon as they are executed
 * 
 *  2b) the call stack, for me, is placed to the left of the package list.
 *  I moved it there so i could watch the variables and call stacks while seeing the code window
 *  
 *  3a) step over(f6) - will move to the next line execution w/out execution
 *  
 *  3b) step into(f5) - will move one line execution at a time. This
 *  is not the same as stepping over where the line is "stepped over".
 *  
 *  3c) I couldn't find "step out". The closest I found was "step return"[?]
 *  
 *  3d) Continue will run until the next breakpoint or uncaught error 
 *  												*/
/****************************************************/

public class DebuggingExercise4
{
	public static void main(String[] args)
	{
		//creating an object 'a' that represents the Account class
		Account a = new Account("su");
		//call the deposit method to add funds to the account
		//100 is a valid integer that is passed as the value of the parameter
		a.deposit(100); 
		//call the getOwner and getBalance accessors from Account class
		//getOwner uses value assigned to class variable 'owner' through ctor
		//getBalance will grab the balance that is returned from the last method call
		System.out.println(a.getOwner() + " has $" + a.getBalance());
		//call the 'withdraw' method from Account class
		//error checking done in method in Account - checks for negative balance or 
		//if withdraw amount is more than what's available 
		a.withdraw(200);
		System.out.println("After trying to withdraw $200, " + a.getOwner() + " has $" + a.getBalance());
	}
}