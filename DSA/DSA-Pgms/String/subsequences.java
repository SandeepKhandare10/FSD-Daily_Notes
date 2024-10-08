package String;

public class subsequences {
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

    static int longestPalindrom(String[] str) {
        String ans[] = new String[str.length];

        int k = 0;

        for (int j = 0; j < str.length; j++) {
            boolean flag = true;
            int len = str[j].length();
            for (int i = 0; i < str[j].length() / 2; i++) {
                if (str[j].charAt(i) != str[j].charAt(len - i - 1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans[k] = str[j];
                k++;

            }
        }

        int max = ans[0].length();
        for (int i = 0; i < k; i++) {
            if (ans[i].length() > max) {
                max = ans[i].length();
            }
        }
        return max;
    }


    public static String[] distinctString(String[] str) {
        if (str == null || str.length == 0) {
            return new String[0];
        }

        String[] ans = new String[str.length];
        int k = 0;

        for (int i = 0; i < str.length; i++) {
            boolean flag = true;
            for (int j = 0; j < i; j++) { // Compare with previous elements only
                if (str[i].equals(str[j])) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans[k] = str[i];
                k++;
            }
        }

        // Create a new array with the exact size of unique elements
        return ans;
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans[] = findSubSequence(str);
//        int t = longestPalindrom(ans);
//        System.out.println(str.length() - t);
        // distict element

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
