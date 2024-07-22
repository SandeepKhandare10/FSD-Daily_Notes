package Stack;

import java.util.Scanner;
import java.util.Stack;

public class EvenOddStack {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        Stack<Integer> sk = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            int y=in.nextInt();
            sk.push(y);
        }
        while (!sk.isEmpty()) {
            Integer value = sk.pop();
            if (value>=0){
                flag=true;}
            else {
                flag=false;
            }
            System.out.println(flag);

        }
    }
}