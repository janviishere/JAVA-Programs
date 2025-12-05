import java.util.*;
class multiT extends Thread
{
	public void run()
	{
	System.out.println("run method executed");
	System.out.println("write the code here for execution");
	}
	public static void main(String args[])
	{
		//Thread t=new Thread();
		multiT a =new multiT();
		a.start();
	}
}     