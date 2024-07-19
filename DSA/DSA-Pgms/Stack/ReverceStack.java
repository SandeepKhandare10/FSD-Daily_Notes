package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverceStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        StringBuilder reverce = new StringBuilder();
        Stack<Character> sk = new Stack<Character>();
        for (int i = 0; i < Name.length(); i++) {
            sk.push(Name.charAt(i));
        }
        while (!sk.isEmpty()) {
            reverce.append(sk.pop());
        }
        System.out.println(reverce);
    }
}
