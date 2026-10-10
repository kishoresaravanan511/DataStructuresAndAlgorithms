package IO_Streams;

import java.io.*;
public class WriteDataToAFile {
    public static void main(String[] args)
    {
        try(FileOutputStream fout = new FileOutputStream("Example.txt"))  //try with resources
        {
            String text = "Welcome to next topic , Byte streams";
            fout.write(text.getBytes());

            System.out.println("written successfully");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
