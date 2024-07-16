import java.util.Scanner;

public class StringCompress {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        int count = 1;
        Scanner sc = new Scanner(System.in);
        String Str = sc.next();
        char[] array = Str.toCharArray();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            } else {
                sb.append(array[i - 1]);
                sb.append(count);
                count = 1;
            }

        }
        System.out.println(sb);

    }
}

