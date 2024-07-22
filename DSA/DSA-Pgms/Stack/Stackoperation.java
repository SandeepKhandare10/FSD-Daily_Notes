package Stack;
import java.util.Scanner;
import java.util.Stack;

public class Stackoperation {
    public static boolean flag(int[] num) {
        Stack<Integer> sk = new Stack<>();

        for (int operation : num) {
            if (operation > 0) {
                sk.push(operation);
            } else if (operation == -1 && !sk.isEmpty()) {
                sk.pop();
            }
        }

        return sk.isEmpty();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] operations = new int[size];

        for (int i = 0; i < size; i++) {
            operations[i] = scanner.nextInt();
        }

        boolean result = flag(operations);
        System.out.println(result);
        scanner.close();
    }
}

