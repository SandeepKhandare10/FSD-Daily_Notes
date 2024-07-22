package Stack;

import java.util.*;
public class BalancedBrackets {

    static boolean areBracketsBalanced(String expr)
    {
        Stack<Character> sk=new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                sk.push(x);
            }

            if (sk.isEmpty())
                return false;
            char find;


            switch (x) {
                case ')':
                    find = sk.pop();
                    if (find == '{' || find == '[')
                        return false;
                    break;

                case '}':
                    find = sk.pop();
                    if (find == '(' || find == '[')
                        return false;
                    break;

                case ']':
                    find = sk.pop();
                    if (find == '(' || find == '{')
                        return false;
                    break;

            }
        }
        return (sk.isEmpty());
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String exp=sc.next();

        if (areBracketsBalanced(exp))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}




