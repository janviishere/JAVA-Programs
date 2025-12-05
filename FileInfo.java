import java.io.*;
import java.lang.*;
class FileInfo {
    public static void main(String[] janvi) throws IOException {
        // Create a File object
        File obj = new File("C:\\Users\\ASUS\\Downloads\\Basic Git cmd.txt");

        // Check if file exists
        if (obj.exists()) {
            System.out.println("File Exists");
            System.out.println("File name: " + obj.getName());
            System.out.println("Absolute path: " + obj.getAbsolutePath());
            System.out.println("Writable: " + obj.canWrite());
            System.out.println("Readable: " + obj.canRead());
            System.out.println("File size: " + obj.length());
        } else {
            System.out.println("File Doesn't Exist");
        }
    }
}
