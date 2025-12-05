import java.util.*;
class change
{
public static void main(String args[])
{
double x;
        System.out.println("Enter temperature in Celsius:");
        Scanner obj=new Scanner(System.in);
        x=obj.nextDouble();
    double cal;
    cal=(x*9.0/5.0)+32.0;
    System.out.println("Temperature in Fahrenheit: "+cal);
}
}

