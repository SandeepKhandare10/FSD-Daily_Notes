package Stack;
import java.util.Stack;
public class ReverceString {
    public static void main(String[] args) {
        String str = "Hello How are you";
        String rev = "";
        Stack<Character> sk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sk.push(str.charAt(i));

            } else {
                while (!sk.isEmpty()) {
                    rev = rev + sk.pop();
                }
            }
            rev += ' ';
        }
        while (!sk.isEmpty()){
            rev=rev+sk.pop();
        }
        System.out.println(rev.trim());
    }
}
