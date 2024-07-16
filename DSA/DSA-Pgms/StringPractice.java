import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        char[] array = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                sb.append(array[i - 1]);
                sb.append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        sb.append(array[array.length - 1]);
        sb.append(count);

        System.out.println("Processed string: " + sb);
    }
}
