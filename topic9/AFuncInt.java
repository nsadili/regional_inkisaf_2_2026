package topic9;

public interface AFuncInt {
    void apply(String str);

    static void print(String str) {
        System.out.println("Inside static method: " + str);
    }

    default void print(String str1, String str2){
        System.out.println("Inside default method: " + str1 + " -> " + str2);
    }

}
