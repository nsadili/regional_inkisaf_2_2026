package topic9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo {
    public static void main(String[] args) {
        File myFile = new File("./data/myfile.txt");

        // try-with-resources
        try (FileWriter fw = new FileWriter(myFile, true);
                BufferedWriter bw = new BufferedWriter(fw)) {
            // fw.write("\nWelcome");
            // fw.write(" to ");
            // fw.write("Baku");

            bw.newLine();
            bw.write("Test");

            // fw.flush();
            // fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
