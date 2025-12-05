import java.util.*;
class largest
{
	public static void main(String args[])
	{
		int a,b,c;
	System.out.println("Enter the numbers");
	Scanner obj=new Scanner(System.in);
	a=obj.nextInt();
	b=obj.nextInt();
	c=obj.nextInt();

	if (a >= b && a >= c) 
	{
        System.out.println("Greatest number is: " + a);
    }
    else if (b >= a && b >= c) 
    {
        System.out.println("Greatest number is: " + b);
    }
    else 
    {
        System.out.println("Greatest number is: " + c);
    }
    }
}
