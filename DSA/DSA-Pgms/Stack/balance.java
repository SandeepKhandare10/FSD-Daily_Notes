package Stack;

import java.util.Scanner;
import java.util.Stack;

public class balance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean flag = false;
        Stack<Character> sk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                sk.push(x);
            }else {
                if (!sk.isEmpty()){
                    char y= sk.pop();
                    if (x==')'&& y=='('||x==']'&& y=='['||x=='}'&& y=='{');{
                        flag=true;
//                        System.out.println(flag);
                    }

                }
            }
        }if (flag==true){
            System.out.println("balance");
        }else
            System.out.println("Not balance");

    }
}
