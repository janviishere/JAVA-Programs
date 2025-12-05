import java.util.*;
class Result
{
	public static void main(String args[])
	{
		int Hindi,English,Maths,Science;
	System.out.println("Enter the marks");
	Scanner obj=new Scanner(System.in);
	Hindi=obj.nextInt();
	English=obj.nextInt();
	Maths=obj.nextInt();
	Science=obj.nextInt();

	System.out.println("Hindi Result: " +Hindi );
	System.out.println("English Result: " +English );
	System.out.println("Maths Result: " +Maths );
	System.out.println("Science Result: " +Science);
    }
}
