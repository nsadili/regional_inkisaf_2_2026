package topic9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMan {
    private static final String USER_DATA_PATH = "./data/users.txt";
    private static final Map<String, String> USERS = new HashMap<>();
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {
        loadUsers(USER_DATA_PATH);

        System.out.println(USERS);

        registerNewUser(SCANNER);
        System.out.println(USERS);

        // System.out.println(verifyUser("murAZ", "12345"));
        // System.out.println(verifyUser("nsadili", "12345"));
        System.out.println(verifyUser("latifa", "54321"));

        SCANNER.close();

        saveUsers(USER_DATA_PATH);
    }

    static void loadUsers(String path) {
        File usersDB = new File(path);
        if (!usersDB.exists())
            return;

        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {

            String userRec = null;
            while ((userRec = br.readLine()) != null) {
                addRecord(userRec);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void addRecord(String userRecord) {
        if (userRecord == null)
            return;

        String[] userRecordParts = userRecord.split(":");
        if (userRecordParts.length != 2)
            return;

        USERS.put(userRecordParts[0].trim().toLowerCase(), userRecordParts[1].trim());
    }

    static boolean verifyUser(String username, String password) {
        if (username == null || password == null)
            return false;
        // if (!USERS.containsKey(username.toLowerCase())) //username is incorrect
        // return false;

        // if (!USERS.get(username).equals(password)) //password is incorrect
        // return false;

        // return true;

        return USERS.containsKey(username.toLowerCase())
                && password.equals(USERS.get(username.toLowerCase()));
    }

    static void registerNewUser(Scanner scan) {
        System.out.print("Enter username: ");
        var username = scan.next();

        System.out.print("Enter password: ");
        var password = scan.next();

        USERS.put(username.toLowerCase().trim(), password.toLowerCase().trim());
    }

    static void saveUsers(String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            USERS.entrySet().stream().forEach(entry -> {
                try {
                    bw.write(entry.getKey());
                    bw.write(":");
                    bw.write(entry.getValue());
                    bw.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
