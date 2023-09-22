package tnsif.org.synchronization;

public class InsufficentBalanceException extends Exception
{
	public InsufficentBalanceException()
	{
		super("Can't Withdraw... Insufficent Balance.");
	}
	
	public InsufficentBalanceException(String message)
	{
		super(message);
	}
	
}
