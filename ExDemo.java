import java.util.*;
class ExDemo
{
	public static void main(String args[])
	{
	int a=10;
	int b=0;
	try{
	a=a/b;                        //Exception occurance chance
	System.out.println("Answer: "+a);
	}
	catch(Exception e){         //e=object of exception class      //catch is a function
	System.out.println("Exception occured: "+e);
	}
}
}
