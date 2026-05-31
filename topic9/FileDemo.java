package topic9;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) {

        // File myFile = new
        // File("C:/Users/nsadili/Desktop/regional_inkisaf_2/topic9/myfile.txt");
        File myFile = new File("./topic3OOP");
        // try {
        // System.out.println(myFile.createNewFile());

        if (myFile.exists()) {
            System.out.println(myFile.isDirectory());
            System.out.println(myFile.isFile());

            System.out.println(Arrays.toString(myFile.list()));

        } else {
            System.out.println("File/Directory does not exist");
        }
        // }
        // catch (IOException ex) {
        // ex.printStackTrace();
        // }

        File imagesDir = new File("./data/images/muraz");
        if (!imagesDir.exists()) {
            System.out.println(imagesDir.mkdirs());
        }
    }
}

// Absolute path
// C:\Users\nsadili\Desktop\regional_inkisaf_2\topic9\FileDemo.java
// C:\Users\nsadili\Desktop\regional_inkisaf_2\topic9\myfile.txt

// Relative Path
// ./myfile.txt //the same folder
// myfile.txt //the same folder
// ../../topic1/yourfile.txt //another folder
// ./data/numbers.dat