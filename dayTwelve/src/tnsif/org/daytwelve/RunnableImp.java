package tnsif.org.daytwelve;

public class RunnableImp implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello"+" "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First way-using Implementable class of Interface
		RunnableImp r=new RunnableImp();
		Thread threadOne=new Thread(r,"Thread 1");
		Thread threadTwo=new Thread(r,"Thread 2");

		Thread threadThree=new Thread(r,"Thread 3"
				+ "");

		threadOne.start();
		threadTwo.start();

		threadThree.start();

	}

}
