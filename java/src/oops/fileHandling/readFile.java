package oops.fileHandling;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class readFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\sinha\\OneDrive\\Desktop\\java\\src\\oops\\fileHandling\\example.txt";

        File file = new File(filePath);

        try {
            if(file.exists()){
                FileReader fr = new FileReader(filePath);
                BufferedReader br = new BufferedReader(fr);

                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
