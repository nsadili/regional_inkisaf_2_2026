package topic5Strings;

public class SubstringOccurence {
    public static void main(String[] args) {
        String a = "12abcdefgxy345";
        String b = "23abcxxfgay345";

        var saylari = substrOccurs(a, b);
        System.out.println(saylari);
    }

    static int substrOccurs(String a, String b) {

        int count = 0;
        boolean isFound = false;
        int i = 0;
        int startIdx = 0;
        for (; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                if (!isFound)
                    startIdx = i; // eger false-dan true-a kecirikse, startIdx yenilenir

                isFound = true;
                continue;
            }

            if (isFound) {// eger true-dan false-a kecirikse, en boyuk substr tapildi demekdir
                System.out.println(a.substring(startIdx, i));
                count++;
            }

            isFound = false;
        }

        if (isFound) {// eger true-dan string sonuna catiriqsa, en boyuk substr tapildi demekdir
            System.out.println(a.substring(startIdx, i));
            count++;
        }
        return count;
    }
}
