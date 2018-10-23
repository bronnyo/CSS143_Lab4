public class Debug {
     // set dmode to false to compile out debug code
     public static final boolean dmode = true;
}

/* Questions from the reading:
 * a. Where is the variable watch window on your screen?
 * 	I moved the watch screen to the left side of the code window so I can watch the events fire in real time line by line.
 * 		i. What information does this present to you?
 * 			A real time evaluation of variables' and objects' data that 
 * 			are manipulated by each module as you step through the program.
 * 
 * 1. Describe this in comments in your code.
 * 	b. Where is the method call stack on your screen?
 * 	The call stack screen is usually on the left but can be moved around. I usually hide it unless needed.
 * 		i. What information does this describe?
 * 			It shows the current line, method, and call stack number and the calls nest position.
 * 
 * (3) Find the shortcut keys for the following debugging commands, and describe what each does in comments.
 *	a. Step over
 * 		i. What does this do?
 * 			F6 - Skips to next call, then waits.
 * 	b. Step into
 * 		i. What does this do?
 * 			F5 - Moves into the method called and increments line by line. Waits after each line executes.
 * 		ii. How is it different from step over?
 * 			The difference is F5 moves line by line, F6 moves call to call.
 * 	c. Step out
 * 		i. What does this do?
 * 			F7 - Will return <i>from</i> a method that was stepped in to.
 * 		ii. How is it different from step over or step into?
 * 			The difference is F7 will execute the code the same way but not step into the call but rather move directly to the next.
 * 	d. Continue
 * 		i. What does this do?
 * 			Run to the next breakpoint if one exists. If not, the program executes until the end or a compiler error.
 * 
 * 		ii. How is it different than moving in steps?
 * 			This is different because you are moving from breakpoint to breakpoint where code in between is not checked.
 */