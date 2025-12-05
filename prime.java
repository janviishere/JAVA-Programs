import java.util.*;
class prime
{
	public static void main(String args[])
	{
	int a;
	int i=2;
	System.out.println("Enter the number: ");
	Scanner obj=new Scanner(System.in);
	a=obj.nextInt();
	Boolean checkP=true;
	while(i<a)
	{
		if(a%i==0)
		{
			checkP=false;
		break;
	}
		i++;
	}
	if(a<=1)
		checkP=false;
	if(checkP){
		System.out.println("Prime");
	}
	else{
	System.out.println("Not Prime");
}
	}
}