import java.util.*;
public class Area {
	public static double circle(double a) { 
		return a*a*3.14;
    }
    public static double rectangle(double a,double b) {
    	return a*b;
    }
    public static double triangle(double a,double b) {
    	return a*b*0.5;
    }

    public static void main(String args[]){
    	double x,y;
    	System.out.println("Enter the values:");
    	Scanner obj=new Scanner(System.in);
    	x=obj.nextDouble();
    	y=obj.nextDouble();

    	System.out.println("Area of circle: "+Area.circle(x));
    	System.out.println("Area of rectangle: "+Area.rectangle(x,y));
    	System.out.println("Area of triangle: "+Area.triangle(x,y));
    }
}
