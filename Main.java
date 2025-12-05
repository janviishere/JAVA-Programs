import java.util.Scanner;

public class Main {  // Ensure class name is "Main" for CodeRunner
    
    // Method to calculate volume of a sphere
    public static double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Method to calculate volume of a cylinder
    public static double cylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Method to calculate volume of a cone
    public static double coneVolume(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for shape selection
        System.out.println("Choose a shape to calculate volume:");
        System.out.println("1. Sphere");
        System.out.println("2. Cylinder");
        System.out.println("3. Cone");
        System.out.print("Enter your choice (1-3): \n");
        
        int choice = scanner.nextInt();

        double volume = 0.0;

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the sphere: \n");
                double radius1 = scanner.nextDouble();
                volume = sphereVolume(radius1);
                System.out.printf("The volume of the sphere is: %.2f%n", volume);
                break;

            case 2:
                System.out.print("Enter the radius of the cylinder: \n");
                double radius2 = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: \n");
                double height2 = scanner.nextDouble();
                volume = cylinderVolume(radius2, height2);
                System.out.printf("The volume of the cylinder is: %.2f%n", volume);
                break;

            case 3:
                System.out.print("Enter the radius of the cone: ");
                double radius3 = scanner.nextDouble();
                System.out.print("Enter the height of the cone: ");
                double height3 = scanner.nextDouble();
                volume = coneVolume(radius3, height3);
                System.out.printf("The volume of the cone is: %.2f%n", volume);
                break;

            default:
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }

        scanner.close();
    }
}