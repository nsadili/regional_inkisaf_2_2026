package topic7Exceptions;

import java.util.Scanner;

public class LoginDemo {
    private static final String DEFAULT_USERNAME = "abcde";
    private static final String DEFAULT_PASSWORD = "12345";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String username = scan.next();
        String password = scan.next();

        try {
            // username or password cannot be less than 3 chars long
            signup(username, password);

            System.out.println("successfull registration");
        } catch (InvalidUsernameException ex) {
            System.out.println(ex.getMessage());
        }

        scan.close();
    }

    static void login(String username, String password) {

        if (DEFAULT_USERNAME.equals(username) &&
                DEFAULT_PASSWORD.equals(password)) {
            System.out.println("Success!");
        } else {
            System.out.println("Login failed!");
        }

    }

    static void signup(String username, String password) throws InvalidUsernameException {

        if (username == null || username.length() <= 3)
            throw new InvalidUsernameException("Username cannot be shorter than 4 chars for " + username);

        if (password == null || password.length() <= 3
                || Character.isDigit(password.charAt(0)))
            throw new IllegalArgumentException("Password cannot be less than 4 digits and cannot start with number");

        // TODO: invalid password exception class yaradin
        // qisa password-larda "Sifre uzunlugu 3den kicik ola bilmez"
        // reqemle baslayanlarda ise "Sifre reqemle baslaya bilmez" xeta mesajlarini
        // cixarin

        System.out.println("Registered successfully!");
    }
}
