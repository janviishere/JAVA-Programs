import java.util.*;
public class Calculate {
	public static int add(int a,int b) { 
		return a+b;
    }
    public static int sub(int a,int b) {
    	return a-b;
    }
    public static void main(String args[]){
        int x,y;
        System.out.println("Enter the values:");
        Scanner obj=new Scanner(System.in);
        x=obj.nextInt();
        y=obj.nextInt();

        System.out.println("Addition: "+Calculate.add(x,y));
        System.out.println("Substraction: "+Calculate.sub(x,y));
    }
}