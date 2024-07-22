package Stack;
import java.util.Scanner;
import java.util.Stack;
public class sortingStack {
    public static void main(String[] args) {
//        Stack<Integer> sk = new Stack<>();
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] arr=new int[n];
//        for (int i=0;i<n;i++){
//        int s=in.nextInt();
//            sk.push(s);
//        }
//        for (int i=0;i<n;i++){
//        arr[i] = sk.pop();
//        }
        Stack<Integer> sk = new Stack<>();
        sk.push(8);
        sk.push(3);
        sk.push(4);
        sk.push(6);
        sk.push(2);
        sk.push(1);
        Stack<Integer> temp = new Stack<>();
        temp.push(sk.pop());
        while (!sk.isEmpty()) {
            int x = sk.pop();
            int y = temp.peek();
            if (temp.isEmpty() || x > y) {
                temp.push(x);
            } else {
                while (!temp.isEmpty() && x < y) {
                    sk.push(temp.pop());
                    if (!temp.isEmpty()) {
                        y = temp.peek();
                    }
                }
                temp.push(x);
            }
        }
        while (!temp.isEmpty()) {
            System.out.print(temp.pop()+" ");
        }

    }
}
