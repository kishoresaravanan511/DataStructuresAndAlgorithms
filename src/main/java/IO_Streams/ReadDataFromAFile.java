package IO_Streams;

import java.io.*;
public class ReadDataFromAFile
{
    public static void main(String[] args)
    {
        try {
            FileInputStream fin = new FileInputStream("Example.txt");
            int c = 0;
            while((c = fin.read()) != -1)
            {
                System.out.print((char)c);
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
