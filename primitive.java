import java.util.*;
public class primitive
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer value:");
        int num = sc.nextInt();

        System.out.println("Enter a float value:");
        float f = sc.nextFloat();

        System.out.println("Enter a character value:");
        char c = sc.next().charAt(0);

        System.out.println("Enter a boolean value (true/false):");
        boolean b = sc.nextBoolean();

        System.out.println("Integer value: " + num);
        System.out.println("Float value: " + f);
        System.out.println("Character value: " + c);
        System.out.println("Boolean value: " + b);
    }
}
