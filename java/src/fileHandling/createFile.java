package fileHandling;

import java.io.File;

public class createFile {
    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Users\\sinha\\OneDrive\\Desktop\\java\\src\\oops\\fileHandling\\example.txt";
        try {
            File file = new File(filePath);
            file.createNewFile();
            System.out.println("File created successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
