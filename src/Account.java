/* *
 * Class Description:
 * @author Ian Bryan
 * @version 10/22/2018
 * 
 * 
 * */
public class Account
{
	// Instance variables
	private int balance;	// invariant: balance >= 0 (should never be negative)
	private String owner;

	//Constructor
	public Account(String name)
	{
		this.balance = 0;
		this.owner = name;
	}

	// Instance methods
	/** Deposits 'amount' into the account
	 */
	public void deposit(int amount)
	{
		balance = balance + amount;
	}

	/** Withdraws 'amount' from the account.
	 *	This only makes sense if amount <= balance.
	 *	This method should be re-written so that there is not a possibility of
	 *	having a negative balance.
	 */
	public void withdraw(int amount)
	{
		if(balance >= 0 && amount < balance){
			balance = balance - amount;
		}else{
			System.out.println("insufficient funds");
		}
	}

	/* Returns the balance of the Account
	 */
	public int getBalance()
	{
		return balance;
	}

	/* Returns the owner of the Account
	 */
	public String getOwner()
	{
		return owner;
	}
}

