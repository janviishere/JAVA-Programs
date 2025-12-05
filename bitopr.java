import java.util.*;
public class bitopr{
 public static void main(String args[]){
        int x,y;
        System.out.println("Enter the values:");
        Scanner obj=new Scanner(System.in);
        x=obj.nextInt();
        y=obj.nextInt();

        System.out.println("Bitwise AND :"+(x&y));
        System.out.println("Bitwise OR :"+(x|y));
        System.out.println("Bitwise XOR :"+(x^y));
    }
}