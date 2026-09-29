package fileoperations;

import java.io.*;
public class CreatingAFile
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("Dummy.txt");
        if(f.createNewFile())
        {
            //System.out.println("File is created " + f.getName() + " " + f.getAbsoluteFile());  //return type is "File object"
            //File is created Dummy.txt C:\Users\kisho\Documents\DevBasics\HazhTech_dsa_java\Dummy.txt

            //System.out.println("File is created " + f.getName() + " " + f.getAbsolutePath());  //return type is "String Object"
            //File is created Dummy.txt C:\Users\kisho\Documents\DevBasics\HazhTech_dsa_java\Dummy.txt
        }
        else {
            System.out.println("File is not yet created");
        }
    }
}
