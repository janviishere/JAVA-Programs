import java.util.*;

interface A1
{
	final int a=10;
	void show();
}

class B implements A1
{
	public void show()
	{
	System.out.print("Abstract Method");
	}
}

class C
{
	public static void main(String args[])
	{
	B obj=new B();
	obj.show();
	System.out.print(obj.a);
	}
}