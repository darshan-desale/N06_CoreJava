package tnsif.org.multithreading;

public class ChildThreadOne extends Thread{
	public void run()
	{
		System.out.println("Factorial of 5 is "+Operations.getFactorial(5));
	}
}
