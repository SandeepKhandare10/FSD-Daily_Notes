package Stack;

import java.util.Stack;

public class CheckParenthises {
    static boolean Chekbalence(String s) {
        Stack<Character> stack = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '(') {
                stack.push(')');
            } else if (i == '[') {
                stack.push(']');
            } else if (i == '{') {
                stack.push('}');
            } else if (i == ')' || i == ']' || i == '}') {
                if (stack.isEmpty() || stack.pop() != i) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(Chekbalence("()"));
        System.out.println(Chekbalence("()[]{}"));
        System.out.println(Chekbalence("(]"));
        System.out.println(Chekbalence("([)]"));
        System.out.println(Chekbalence("{[]}"));
    }

}
