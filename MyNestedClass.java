class OuterClass
{
	static int x=10;
	int y=20;//instance variable
	private static int z=30;

	static class NestedClass
	{
	void show()
	{

		OuterClass obj = new OuterClass();
	System.out.println("Static value of x: "+x);
	System.out.println("Value of y: "+obj.y);
	System.out.println("Private value of z: "+z);
	}
	}
}

//driver class
public class MyNestedClass
{
	public static void main(String args[])
	{
	OuterClass.NestedClass object=new OuterClass.NestedClass();
	object.show();
	}
}

