package String;
import java.util.Arrays;
public class longesUncomSec {
    public static String[] findSubSequence(String str) {
        if (str.isEmpty()) {
            return new String[]{""};
        }
        String smallAns[] = findSubSequence(str.substring(1));
        String ans[] = new String[2 * smallAns.length];
        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = smallAns[i];
            k++;
        }

        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = str.charAt(0) + smallAns[i];
            k++;
        }
        return ans;
    }
    static int longestUncommonSubsequence(String[] str1, String[] str2) {

        String s1 = Arrays.toString(str1);
        String s2 = Arrays.toString(str2);

        if (s1.equals(s2))
            return 0;

        int count = 0;

        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i] != str2[j]) {
                    if (str1[i].length() > count) {
                        count = str1[i].length();
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] str1 = findSubSequence("");
    }
}
