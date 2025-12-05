import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    // Constructor 1
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Constructor 2
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Constructor 3
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println();
    }
}

public class Mainn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First book
        System.out.println("Enter the title of the first book:");
        String title1 = sc.nextLine();
        Book b1 = new Book(title1);

        // Second book
        System.out.println("Enter the title of the second book:");
        String title2 = sc.nextLine();
        System.out.println("Enter the author of the second book:");
        String author2 = sc.nextLine();
        Book b2 = new Book(title2, author2);

        // Third book
        System.out.println("Enter the title of the third book:");
        String title3 = sc.nextLine();
        System.out.println("Enter the author of the third book:");
        String author3 = sc.nextLine();
        System.out.println("Enter the price of the third book:");
        double price3 = sc.nextDouble();
        Book b3 = new Book(title3, author3, price3);

        // Output
        System.out.println();
        System.out.println("Book 1 details:");
        b1.displayDetails();

        System.out.println("Book 2 details:");
        b2.displayDetails();

        System.out.println("Book 3 details:");
        b3.displayDetails();
    }
}
