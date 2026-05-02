package topic3OOP;

public class Person {
    private int age;
    private String username;

    public boolean setAge(int newAge) {
        if (newAge < 0)
            return false;

        age = newAge;
        return true;
    }

    public int getAge() {
        return age;
    }

    public boolean setUsername(String newUsername) {
        if (username == null || username.length() <= 3)
            return false;

        username = newUsername;
        return true;
    }

    public String getUsername() {
        return username;
    }
}
