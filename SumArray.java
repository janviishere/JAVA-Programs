import java.util.Arrays;
class SumArray
{
	public static void main(String args[])
	{
	int arr[][]={{1,2,3},
	{4,5,6},
	{7,8,9}};
	int sum=0;
	for(int i=0;i<arr.length;i++){
	for(int j=0;j<arr[i].length;j++){
	sum+=arr[i][j];	
	}
}
	
	System.out.println("Sum of the Array: "+sum);
	}
}



//using method

//import java.util.Arrays;
//class SumArray {
    
  //  static int calculateSum(int arr[])
    // {
      //  int sum = 0;
        //for (int i = 0; i < arr.length; i++)
        //{
          //  sum += arr[i];
        //}
        //return sum;
    //}

    //public static void main(String args[])
    //{
      //  int arr[] = {1, 2, 3, 4, 5};
        //int total = calculateSum(arr);
        //System.out.println("Sum of the Array: " + total);
    //}
//}
