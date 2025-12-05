import java.util.*;
public class numbers{
 public static void main(String args[]){
        int x;
        System.out.println("Enter the number:");
        Scanner obj=new Scanner(System.in);
        x=obj.nextInt();

        if(x>0){
              System.out.println("number is positive");
        }
        else if(x<0){
              System.out.println("number is negative");
        }
        else{
              System.out.println("number is zero");
        }
    }
}