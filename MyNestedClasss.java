class OuterClass
{
	static int x=10;
	int y=20;//instance variable
	private static int z=30;

	class InnerClass
	{
	void show()
	{
	System.out.println("Static value of x: "+x);
	System.out.println("Value of y: "+y);
	System.out.println("Private value of z: "+z);
	}
	}
}

//driver class
public class MyNestedClasss
{
	public static void main(String args[])
	{
		OuterClass obj = new OuterClass();
	OuterClass.InnerClass object = obj.new InnerClass();
	object.show();
	}
}

