import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        System.out.println("\nBitwise AND: " + num1 + " & " + num2 + " = " + (num1 & num2));
        System.out.println("Bitwise OR: " + num1 + " | " + num2 + " = " + (num1 | num2));
        System.out.println("Bitwise XOR: " + num1 + " ^ " + num2 + " = " + (num1 ^ num2));

        sc.close();
    }
}
