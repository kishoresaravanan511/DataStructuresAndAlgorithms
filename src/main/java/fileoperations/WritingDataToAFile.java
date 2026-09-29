package fileoperations;

import java.io.*;
public class WritingDataToAFile
{
    public static void main(String[] args) throws IOException {
//         FileWriter fw = new FileWriter("Example.txt");
//         fw.write("javaisbestprogrammingaccordingtome ");
//         System.out.println("written successfully");

        BufferedWriter bw = new BufferedWriter(new FileWriter("Example.txt",true));
        bw.write("java programming ");
        bw.write("is best");

        System.out.println("Written succuessfully");
        bw.close();

    }
}
