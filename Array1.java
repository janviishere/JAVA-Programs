import java.util.*;
class Array1
{
	public static void main(String args[])
	{
		ArrayList<Integer> arrA=new ArrayList<Integer>();    //ArrayList<Integer> arrA=new ArrayList<>();
		arrA.add(1);
		arrA.add(2);
		arrA.add(3);
		arrA.add(4);
		ArrayList<Integer> arrB=new ArrayList<Integer>();
		arrB.add(1);
		arrB.add(2);
		arrB.add(3);
		arrB.add(4);
		ArrayList<Integer> sum=new ArrayList<Integer>();
		for(int i=0;i<arrA.size();i++)
		{
			sum.add(arrA.get(i)+arrB.get(i));   
		}
		System.out.println("Sum of array list is: "+sum);
	}
}