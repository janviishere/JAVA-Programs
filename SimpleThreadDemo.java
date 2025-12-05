import java.util.Scanner;

// Custom thread class
class MyThread extends Thread {
    private int times;

    public MyThread(int times) {
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 1; i <= times; i++) {
            System.out.println("Message " + i + " from thread.");
        }
    }
}

public class SimpleThreadDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of times the message should be printed: \n");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Error: The number of times must be a positive integer.");
                // DO NOT print "Resources released." here
                return;
            }

            MyThread thread = new MyThread(n);
            thread.start();
            thread.join();

            // Only print resources released for normal or valid thread cases
            System.out.println("Resources released.");

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            System.out.println("Resources released."); // print for exception case
        } finally {
            scanner.close();
        }
    }
}
