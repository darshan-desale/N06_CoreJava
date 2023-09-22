package tnsif.org.synchronization;

public interface Bank 
{
	public static final int depositLimit=25000;
	public static final int minimumBalance=1000;
	
	void deposit(int amount) throws DepositLimitExceededException;
	void withdraw(int amount) throws InsufficentBalanceException;
	
}
