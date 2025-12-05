import java.util.Scanner;

// Define a simple interface
interface InputOutput {
    void takeInput();
    void print();
}

// Implement the interface in a class
public class Maine implements InputOutput {

    private String userInput;

    public void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: \n");
        userInput = scanner.nextLine();
        // scanner.close();  // 
    }

    public void print() {
        System.out.println("Printing user input: " + userInput);
    }

    public static void main(String[] args) {
        Maine main = new Maine();   // 
        main.takeInput();
        main.print();
    }
}
