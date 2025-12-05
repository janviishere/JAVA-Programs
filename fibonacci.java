import java.util.*;
class fibonacci 
{
	public static void main(String args[])
	{
	int a=0,b=1,n;
	System.out.print("Enter the value of n: ");
	Scanner obj=new Scanner(System.in);
	n=obj.nextInt();
	for(int i=0;i<=n;i++)
	{
		System.out.print(a+ " ");
		int c=a+b;
		a=b;
		b=c;
	}
	System.out.print("Fibonacci Series: "+n);
}
}
