package topic5OOP.students;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person() {
    }

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Person(Person p) {
        this(p.firstName, p.lastName, p.gender);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Ad: " + firstName + "\nSoyad: " + lastName + "\nGender: " + gender;
    }

    public boolean equals(Person person1) {
        return person1.getFirstName() == this.firstName
                && person1.getLastName() == this.lastName;
                        // ? true
                        // : false;
    }

}
