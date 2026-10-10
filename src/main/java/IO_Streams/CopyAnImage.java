package IO_Streams;

import java.io.*;
public class CopyAnImage {
    public static void main(String[] args)
    {
        try {
            FileInputStream fin = new FileInputStream("image.jpg");
            FileOutputStream fout = new FileOutputStream("copy.jpg");

            int data = 0;
            while((data = fin.read()) != -1)
            {
                fout.write(data);
            }
            System.out.println("Image copied see your copy.jpg");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
