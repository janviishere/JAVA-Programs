import java.util.*;
class bubblee
{
	public static void main(String  args[])
	{

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements in array:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }


        //bubble sort
        for (int i = 0; i =< n - 1; i++) 
        {
            for (int j = 0; j =< n - i - 1; j++) 
            {
                if (a[j] > a[j + 1]) 
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i=0;i=<n-1;i++)
        {
        	System.out.println(a[i]);
        }
	}
}
