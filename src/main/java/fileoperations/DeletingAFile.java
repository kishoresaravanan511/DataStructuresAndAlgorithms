package fileoperations;

import java.io.*;
public class DeletingAFile {
    public static void main(String[] args) throws IOException
    {
        File f = new File("Dummy.txt");
        if(f.delete())
        {
            System.out.println("File is deleted");
        }
        else {
            System.out.println("File is not yet deleted");
        }
    }
}
