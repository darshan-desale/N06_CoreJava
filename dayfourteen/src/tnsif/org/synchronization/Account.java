package tnsif.org.synchronization;

public class Account implements Bank
{
	private int accNo;
	private int Balance;
	private String name;
	
	public Account(int accNo, int balance, String name) {
		super();
		this.accNo = accNo;
		Balance = balance;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", Balance=" + Balance + ", name=" + name + "]";
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void deposit(int amount) throws DepositLimitExceededException
	{
		if(amount>Bank.depositLimit)
		{
			throw new DepositLimitExceededException();
		}
		Balance+=amount;
	}
	public void withdraw(int amount) throws InsufficentBalanceException
	{
		if(amount<Bank.minimumBalance)
		{
			throw new InsufficentBalanceException();	
		}
		Balance-=amount;
	}
}
