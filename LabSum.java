interface Add
{
	int Addition(int a,int b);
}
public class LabSum
{
	public static void main(String args[])
	{
	Add add = (a,b) -> a+b ; //parameter -> expression
	Add add1 = (a,b) -> a*b ;
	int res = add.Addition(10,20);
	int res1 = add1.Addition(10,20);
	System.out.println("Sum: "+res);
	System.out.println("Mul: "+res1);
	}
}

