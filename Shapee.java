import java.util.Scanner;

class Shape {
    public void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayCircle() {
        System.out.printf("Circle with radius %.2f:\n", radius);
        System.out.printf("Area: %.2f\n", getArea());
        System.out.printf("Circumference: %.2f\n", getCircumference());
    }
}

public class Shapee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double r = sc.nextDouble();

        if (r < 0) {
            System.out.println("Error: Radius cannot be negative.");
        } else {
            Shape s = new Shape();
            s.display(); // print only for valid input

            Circle c = new Circle(r);
            c.displayCircle();
        }
    }
}
