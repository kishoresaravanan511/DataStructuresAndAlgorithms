package fileoperations;

import java.io.*;
public class CountCharactersInAFile {
    public static void main(String[] args)
    {
        int count = 0;
        //try with resources
        try (BufferedReader br = new BufferedReader(new FileReader("Target.txt"))){
            //EOF value of read() is -1 and readLine() is null
            while((br.read()) != -1)   //return type int and readline() return type is String
            {
                count++;
            }
            System.out.println("Characters Count : " + count);
            br.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
