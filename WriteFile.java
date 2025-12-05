import java.io.*;

class WriteFile {
    public static void main(String[] janvi) 
    {
        String data="This is my first file.";
        try{
        FileWriter sc=new FileWriter("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java Codes\\myfile.txt");
        sc.write(data);
        System.out.println("Data Stored");
        sc.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}

