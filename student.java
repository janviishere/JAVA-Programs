import java.util.*;
interface Sports
{
	void sports_marks();
}
interface Academics
{
	void academics_marks();
}
class Student implements Sports,Academics
{
	@Override
	public void sports_marks()
	{
		int s;
		System.out.println("Enter the marks of sports:");
		Scanner obj=new Scanner(System.in);
		s=obj.nextInt();
	}
	@Override
	public void academics_marks()
	{
		int a;
		System.out.println("Enter the marks of academics:");
		Scanner obj1=new Scanner(System.in);
		a=obj1.nextInt();
	}
	/*void marks()
	{
		int marks = a+s;
		System.out.println("Total Marks:"+marks);
	}*/
	public static void main(String args[])
	{
		Student obj2=new Student();
		int marks = obj2.sports_marks()+ obj2.academics_marks();
		//obj2.marks();
		System.out.println("Total Marks:"+marks);
	}
}

