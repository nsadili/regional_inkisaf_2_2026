package topic9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileCopy {
    public static void main(String[] args) {
        copyFile("./data/images/muraz/golden.webp",
                "./data/images/nuraddin/golden.webp");
    }

    static void copyFile(String srcPath, String destPath) {
        File src = new File(srcPath);
        if (!src.exists())
            return;

        File dest = new File(destPath);

        try (BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(src));
                BufferedOutputStream bos = new BufferedOutputStream(
                        new FileOutputStream(destPath))) {

            byte[] buf = new byte[2048];
            int len;

            var count = 0;
            while ((len = bis.read(buf)) != -1) {
                // System.out.println(len);
                count++;
                bos.write(buf, 0, len);
            }
            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
