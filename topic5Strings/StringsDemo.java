package topic5Strings;

public class StringsDemo {
    public static void main(String[] args) {

        String myName = "Nuraddin"; // string literal
        String yourName = new String("Ali");

        String hisName = "Nuraddin";

        System.out.println(myName == hisName);

        myName = myName.toLowerCase();

        System.out.println(myName);
        System.out.println(hisName);

        var s1 = new String(hisName);

        System.out.println(s1 == hisName); // object equality
        System.out.println(s1.equals(hisName)); // value equality

        var s2 = s1.intern();
        System.out.println(s2 == hisName); // object equality
        System.out.println(s2.equals(hisName)); // value equality
    }
}