package IO_Streams;

import java.io.*;
public class ByteArrayOutputStreamExample {
    public static void main(String[] args)
    {
        try
        {
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            b.write(65);
            b.write(66);
            b.write(67);
            byte[] arr = b.toByteArray();
            System.out.println(new String(arr));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
