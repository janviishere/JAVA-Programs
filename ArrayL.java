import java.util.*;
class ArrayL
{
	public static void main(String args[])
	{
		ArrayList<Integer> arrA=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array list: ");
		int n=sc.nextInt();
		System.out.println("enter the elements of 1st array: ");
		for(int i=0;i<n;i++)
			{
				int value=sc.nextInt();
				arrA.add(value);
			}
	    ArrayList<Integer> arrB=new ArrayList<Integer>();
		System.out.println("enter the elements of 2nd array: ");
		for(int i=0;i<n;i++)
			{
				int value=sc.nextInt();
				arrB.add(value);
			}
		ArrayList<Integer> sum=new ArrayList<Integer>();
		for(int i=0;i<arrA.size();i++)
		{
			sum.add(arrA.get(i)+arrB.get(i));   
		}
		System.out.println("Sum of array list is: "+sum);
}
}

