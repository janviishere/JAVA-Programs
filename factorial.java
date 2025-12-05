import java.util.*;
class factorial
{
	public  static void main(String args[])
	{
	int N,fact=1;
	int i=1;
	System.out.println("Enter the number:");
	Scanner obj=new Scanner(System.in);
	N=obj.nextInt();
	do
	{
		fact=fact*i;
		i++;
	}
	while(i<=N);
		System.out.println("Factorial:"+fact);
	}
}