import java.util.Arrays;

public class StringtoInt {
    public static void main(String[] args) {
        String name = "12 56 56 88 99 ";

        String[] str = name.split(" ");
        int[] ans = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            ans[i] = Integer.parseInt(str[i]);
            System.out.print(ans[i] + " ");
        }

    }


}
