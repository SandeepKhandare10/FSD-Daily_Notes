package String;

public class SubString {

    public static void Substrings(String S) {
        int count=0;
        int n = S.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {

                String substring = S.substring(i, j);
                System.out.println(substring);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Substrings("abc");

    }
}
