package IO_Streams;

import java.io.*;
public class PrintWriterExample
{
    public static void main(String[] args)
    {
        String name = "Kishore Saravanan";
        Integer rollNo = 106;
        try
        {
            PrintWriter pw = new PrintWriter("Example.txt");

            pw.println("Name : " + name);
            pw.printf("Roll_no : %d" , rollNo);

            System.out.println("see the Example.txt file");
            pw.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
