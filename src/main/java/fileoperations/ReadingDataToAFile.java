package fileoperations;

import java.io.*;
public class ReadingDataToAFile {
    public static void main(String[] args){
//        try
//        {
//            FileReader fr = new FileReader("Example.txt");
//            int c;
//            while((c=fr.read()) != -1)  //read() returns char
//            {
//                System.out.print((char)c+" ");
//            }
//        }
//        catch(IOException e)
//        {
//
//        }
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Example.txt"));
            String line;
            while((line = br.readLine()) != null)  //readLine() returns string
            {
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException e)
        {

        }
    }
}
