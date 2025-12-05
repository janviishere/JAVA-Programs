import java.util.Scanner;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getValue() {
        return count;
    }
}

// Runnable class
class CounterTask implements Runnable {
    private Counter counter;
    private int increments;

    public CounterTask(Counter counter, int increments) {
        this.counter = counter;
        this.increments = increments;
    }

    @Override
    public void run() {
        for (int i = 0; i < increments; i++) {
            counter.increment();
        }
    }
}

public class RunnableThreadDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of threads to create: \n");
            int numThreads = scanner.nextInt();

            System.out.print("Enter the number of increments per thread: \n");
            int increments = scanner.nextInt();

            // Negative number check
            if (numThreads < 0 || increments < 0) {
                System.out.println("Error: The number of threads and increments must be positive integers.");
                return;
            }

            Counter counter = new Counter();
            Thread[] threads = new Thread[numThreads];

            // Create and start threads
            for (int i = 0; i < numThreads; i++) {
                threads[i] = new Thread(new CounterTask(counter, increments));
                threads[i].start();
            }

            // Wait for all threads to finish
            for (int i = 0; i < numThreads; i++) {
                threads[i].join();
            }

            System.out.println("Final counter value: " + counter.getValue());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
            //System.out.println("Resources released.");
        }
    }
}
