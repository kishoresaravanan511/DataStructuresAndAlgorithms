package IO_Streams;

import java.io.*;
public class ByteArrayInputStreamExample {
    public static void main(String[] args)
    {
        byte[] arr = {65,66,67};
        try
        {
            ByteArrayInputStream b = new ByteArrayInputStream(arr);
            int val = 0;

            while((val = b.read()) != -1)
            {
                System.out.println((char)val);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
