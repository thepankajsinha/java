package oops.fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class writeFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\sinha\\OneDrive\\Desktop\\java\\src\\oops\\fileHandling\\example.txt";

        try {
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.newLine();
            bw.write("This is first line");
            bw.close();

            System.out.println("Successfully appended to the file.");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
