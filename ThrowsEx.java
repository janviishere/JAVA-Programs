import java.util.*;
class ThrowsEx{
	static void checkAge(int age){
	if(age<18){
	throw new ArithmeticException("Age must be 18 or above");
	}
	}
	public static void main(String args[]){
	int age;
	Scanner sc=new Scanner(System.in);
	age=sc.nextInt();
	checkAge(age);
	}
}