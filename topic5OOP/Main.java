package topic5OOP;


import topic5OOP.students.PhdStudent;

public class Main {
    public static void main(String[] args) {

        var s = new PhdStudent(1,
                "Nuraddin",
                "Sadili",
                "MALE",
                "SITE");

        System.out.println(s.toString());

    }
}
