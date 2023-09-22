package tnsif.org.synchronization;

@SuppressWarnings("serial")
public class DepositLimitExceededException extends Exception
{
	public DepositLimitExceededException()
	{
		super("Limit Exceeded... Can't Deposit");
	}
	public DepositLimitExceededException(String message)
	{
		System.out.println(message);
	}
}
