package fileoperations;

import java.io.*;
import java.util.*;
public class CopyDataFromFiles
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new FileReader("Example.txt"));
            BufferedWriter bw = new BufferedWriter((new FileWriter("Target.txt")));

            String line;
            while((line = br.readLine()) != null)  //reading from a Example.txt file
            {
                bw.write(line);   //writing to Target.txt file
                System.out.println("Data copied Successfully, see your Target.txt");
            }
            bw.close();
            br.close();   //resource close is mandatory point ...
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            sc.close();
        }
    }
}
