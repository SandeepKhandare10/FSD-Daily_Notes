package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackDataStu {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1="";
        Stack<Character> sk = new Stack<Character>();
//        sk.push("10");
//        sk.push("20");
//        sk.push("30");
//        sk.push("40");
//        sk.push("50");
//        sk.push("60");
        for (int i=0; i<=str.length(); i++){
            sk.push(str.charAt(i));
        }
        while (!sk.isEmpty()){
            str1=str1+sk.pop();
            System.out.print(sk.pop()+" ");
//            sk.pop();
        }
//            System.out.println(sk.pop());
//        sk.pop();
//        sk.pop();
//        sk.pop();
//        sk.pop();
//        sk.pop();
//        System.out.println(sk.peek());
//        System.out.println(sk.isEmpty());
        System.out.println(str1);
    }

}
