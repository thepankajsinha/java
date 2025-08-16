package oops.fileHandling;

import java.io.File;

public class deleteFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\sinha\\OneDrive\\Desktop\\java\\src\\oops\\fileHandling\\example.txt";

        File file = new File(filePath);

        if (file.exists()) {  // check if file exists
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
