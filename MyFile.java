import java.io.*;

class MyFile {
    public static void main(String[] janvi) throws IOException 
    {
        // Create a File object
        File obj = new File("myfile.txt");

        // Create a new file
        obj.createNewFile();
        System.out.println("File is created");

        // Check if file exists
        if (obj.exists()) {
            System.out.println("File Exists");
        } else {
            System.out.println("File Doesn't Exist");
        }
    }
}


import java.io.*;

class MyFile {
    public static void main(String[] janvi) 
    {
        // Create a File object
        File obj = new File("myfile.txt");

        // Create a new file
        try{
            boolean value=obj.createNewFile();
            if(value){
        System.out.println("File is created");
}
else{
            System.out.println("File Exists");
        } }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
