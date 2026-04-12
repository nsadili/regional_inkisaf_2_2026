package topic5Strings;

public class StringReversed {
    public static void main(String[] args) {

        var res = reverseV2("ali");
        System.out.println("\n\n" + res);
    }

    static String reverse(String str) {

        var res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res = res + str.charAt(i);
            System.out.println(res);
        }

        return res;
    }

    static String reverseV2(String str) {
        char[] charSeq = str.toCharArray();

        var len = str.length();
        for (int i = len / 2 - 1; i >= 0; i--) {
            // charSeq[i] <-> charSeq[len - 1 - i]
            var tmp = charSeq[i];
            charSeq[i] = charSeq[len - 1 - i];
            charSeq[len - 1 - i] = tmp;
        }

        return String.valueOf(charSeq).intern();
    }
}
