import java.util.*;
class grade
{
	public static void main(String args[])
	{
      int x;
        System.out.println("Enter the percentage:");
        Scanner obj=new Scanner(System.in);
        x=obj.nextInt();

        switch(x/10) {

        case 10:
          System.out.println("Grade: A");
          break;

        case 9:
          System.out.println("Grade: B");
          break;

        case 8:
          System.out.println("Grade: c");
          break;

        case 7:
          System.out.println("Grade: D");
          break;

        case 6:
          System.out.println("Grade: C");
          break;
        default:
          System.out.println("Grade: Fail");
        }
	}
}