import java.util.*;
public class MathUtils {
	public int add(int a,int b) { //static
		return a+b;
    }
    public int sub(int a,int b) {
    	return a-b;
    }
    public int multi(int a,int b) {
    	return a*b;
    }
    public int div(int a,int b) {
    	if(b==0){
    		System.out.println("Can't divide by Zero");
    	}
    	return a/b;
    }

    public static void main(String args[]){
    	int x,y;
    	System.out.println("Enter the values:");
    	Scanner obj=new Scanner(System.in);
    	x=obj.nextInt();
    	y=obj.nextInt();

    	MathUtils obj1=new MathUtils();
    	System.out.println("Addition: "+obj1.add(x,y));
    	System.out.println("Substraction: "+obj1.sub(x,y));
    	System.out.println("Multiplication: "+obj1.multi(x,y));
    	System.out.println("Division: "+obj1.div(x,y));
    }
}
