import java.util.Scanner;

public class Rectangle {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Method to check if the rectangle is a square
    public boolean isSquare() {
        return width == height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Prompt user for width and height
        System.out.print("Enter the width of the rectangle: \n");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: \n");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        // TODO: Display the calculated area
        System.out.printf("Area of the rectangle: %.1f%n", rectangle.calculateArea());

        // TODO: Display the calculated perimeter
        System.out.printf("Perimeter of the rectangle: %.1f%n", rectangle.calculatePerimeter());

        // TODO: Check if the rectangle is a square and display the result
        if (rectangle.isSquare()) {
            System.out.println("This rectangle is a square.");
        } else {
            System.out.println("This rectangle is not a square.");
        }

        scanner.close();
    }
}