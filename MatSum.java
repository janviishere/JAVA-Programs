import java.util.*;
class MatSum{
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A1[]=new int[n];
		int A2[]=new int[n];
		int sum[]=new int[n];

		//for Array1
		for(int i=0;i<n;i++)
		{
			A1[i]=sc.nextInt();
		}

		//for Array2
		for(int i=0;i<n;i++)
		{
			A2[i]=sc.nextInt();
		}

		//for Sum
		for(int i=0;i<n;i++)
		{
			sum[i]=A1[i]+A2[i];
		System.out.println(sum[i]);
		}
	}
}