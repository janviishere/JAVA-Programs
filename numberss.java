import java.util.*;
class numberss
{
	 public static void main(String args[]){
    	int x,y,z;
    	System.out.println("Enter the numbers:");
    	Scanner obj=new Scanner(System.in);
    	x=obj.nextInt();
    	y=obj.nextInt();
    	z=obj.nextInt();
	
	if(x>=y && x>=z){
	System.out.println(x+"is the largest number.");
	}
	if(y>=x && y>=z){
    System.out.println(y+"is the largest number.");
	}
    else{
    System.out.println(z+"is the largest number.");
    }
}	
}