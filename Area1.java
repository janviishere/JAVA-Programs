import java.util.*;
public class Array {
	public static int circle(int a) { 
		return r*r*3.14;
    }
    public static int rectangle(int a,int b) {
    	return a*b;
    }
    public static int triangle(int a,int b) {
    	return a*b*0.5;
    }

    public static void main(String args[]){
    	int x,y;
    	System.out.println("Enter the values:");
    	Scanner obj=new Scanner(System.in);
    	x=obj.nextInt();
    	y=obj.nextInt();

    	Area obj1=new Area();
    	System.out.println("Area of circle: "+obj1.circle(x));
    	System.out.println("Area of rectangle: "+obj1.rectangle(x,y));
    	System.out.println("Area of triangle: "+obj1.triangle(x,y));
    }
}
