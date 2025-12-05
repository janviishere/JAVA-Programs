import java.util.ArrayList;
import java.util.Scanner;

// Book class
class Book {
    private String title;
    private String author;
    private String isbn;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("-----------------------");
    }
}

// Library class
class Library {
    private String libraryName;
    private String location;
    private ArrayList<Book> books;
    
    public Library(String libraryName, String location) {
        this.libraryName = libraryName;
        this.location = location;
        this.books = new ArrayList<>();
    }
    
    public void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
    }
    
    public boolean searchBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println("\nBook Found:");
                book.display();
                return true;
            }
        }
        System.out.println("Book not found with ISBN: " + isbn);
        return false;
    }
    
    public void displayLibrary() {
        System.out.println("\nLibrary Name: " + libraryName);
        System.out.println("Location: " + location);
        System.out.println("\nBooks in Library:");
        if (books.isEmpty()) {
            System.out.println("No books in library.");
        } else {
            for (Book book : books) {
                book.display();
            }
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Library details input
        System.out.print("Enter Library Name and Location (separated by comma): ");
        String[] libraryInfo = scanner.nextLine().split(",");
        String libraryName = libraryInfo[0].trim();
        String location = libraryInfo[1].trim();
        Library library = new Library(libraryName, location);
        
        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Search Book by ISBN");
            System.out.println("3. Display Library Details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Invalid choice. Please select a valid option.");
                continue;
            }
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
                System.out.print("Enter Book Title, Author, ISBN (comma separated): ");
                String input = scanner.nextLine();
                String[] parts = input.split(",");
                if (parts.length == 3) {
                    String title = parts[0].trim();
                    String author = parts[1].trim();
                    String isbn = parts[2].trim();
                    if (isbn.matches("\\d{9}")) {
                        library.addBook(title, author, isbn);
                        System.out.println("Book added successfully!");
                    } else {
                        System.out.println("Invalid ISBN. Must be exactly 9 digits.");
                    }
                } else {
                    System.out.println("Invalid format. Use: Title,Author,ISBN");
                }
            } else if (choice == 2) {
                System.out.print("Enter ISBN to search: ");
                String isbn = scanner.nextLine();
                library.searchBook(isbn);
            } else if (choice == 3) {
                library.displayLibrary();
            } else if (choice == 4) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        scanner.close();
    }
}