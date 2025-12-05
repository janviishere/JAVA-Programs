import java.util.Scanner;

// Custom Exception Class
class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {
    private double balance = 1000.0; // Initial balance (you can modify if needed)

    public void deposit(double amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InvalidTransactionException("Insufficient funds.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        try {
            System.out.print("Enter deposit amount: \n");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Enter withdrawal amount: \n");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);

            System.out.println("Final balance: " + account.getBalance());

        } 
        catch (InvalidTransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
        finally {
            scanner.close();
            System.out.println("Resources released.");
        }
    }
}
