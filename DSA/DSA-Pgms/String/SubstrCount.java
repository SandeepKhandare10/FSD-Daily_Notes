package String;

public class SubstrCount {

        public static int countSubstrings(String S, int X) {
            int count = 0;
            int n = S.length();

            for (int i = 0; i < n; i++) {

                if (S.charAt(i) == '0') continue;

                for (int j = i + 1; j <= n; j++) {
                    String substring = S.substring(i, j);
                    int num = Integer.parseInt(substring);
                    if (num > X) {
                        count++;
                    }
                }
            }

            return count;
        }

        public static void main(String[] args) {

            System.out.println(countSubstrings("471", 47));
            System.out.println(countSubstrings("2222", 97));
        }
    }

