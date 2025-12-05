import java.io.*;
class MyFile
{
    public static void main(String args[])
    {
        File obj=new File("MyFile.txt");
        System.out.println("File is created");
        obj.close();
    }
}