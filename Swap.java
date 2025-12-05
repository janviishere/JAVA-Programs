import java.util.*;
class Swap
{
	public static void main(String args[])
	{
	int a, b;
	System.out.println("Enter the number");
	Scanner obj=new Scanner(System.in);
	a=obj.nextInt();
	b=obj.nextInt();

	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping a="+a);
	System.out.println("After Swapping b="+b);
	}
}