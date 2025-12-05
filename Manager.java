import java.util.Scanner;

// Define the first base class as an interface
interface Person {
    void setPersonDetails(String name, int age);
    void displayPersonDetails();
}

// Define the second base class as an interface
interface Employee {
    void setEmployeeDetails(int id, String department);
    void displayEmployeeDetails();
}

// Derived class that implements both Person and Employee interfaces
public class Manager implements Person, Employee {
    private String name;
    private int age;
    private int employeeId;
    private String department;
    
    // Declare a single Scanner object for all input operations
    private Scanner scanner;
    
    public Manager(Scanner scanner) {
        this.scanner = scanner;
    }
    
    // Implement the setPersonDetails method
    public void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Implement the displayPersonDetails method
    public void displayPersonDetails() {
        System.out.println("Manager's Name: " + name);
        System.out.println("Manager's Age: " + age);
    }
    
    // Implement the setEmployeeDetails method
    public void setEmployeeDetails(int id, String department) {
        this.employeeId = id;
        this.department = department;
    }
    
    // Implement the displayEmployeeDetails method
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
    
    public static void main(String[] args) {
        // Create a single Scanner object for the whole program
        Scanner scanner = new Scanner(System.in);
        
        // Create an instance of Manager and pass the scanner
        Manager manager = new Manager(scanner);
        
        // Input name
        System.out.print("Enter Manager's Name: \n");
        String name = scanner.nextLine();
        manager.setPersonDetails(name, 0); // temporary age
        
        // Input age with validation
        int age;
        do {
            System.out.print("Enter Manager's Age: \n");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter valid age: ");
                scanner.next();
            }
            age = scanner.nextInt();
            if (age < 0) {
                System.out.print("Invalid input: Age cannot be negative. Please enter a valid age.\n");
            }
        } while (age < 0);
        manager.setPersonDetails(name, age);
        scanner.nextLine(); // consume newline
        
        // Input employee ID
        System.out.print("Enter Employee ID: \n");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        // Input department
        System.out.print("Enter Department: \n");
        String department = scanner.nextLine();
        
        manager.setEmployeeDetails(id, department);
        
        // Display both person and employee details
        System.out.println("\nManager Details:");
        manager.displayPersonDetails();
        manager.displayEmployeeDetails();
        
        scanner.close();
    }
}