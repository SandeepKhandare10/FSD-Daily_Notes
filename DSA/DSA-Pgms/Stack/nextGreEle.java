package Stack;

import java.util.Stack;

public class nextGreEle {
    public static void main(String[] args) {
        int[] arr={10,5,15,2,6};
        Stack <Integer> sk=new Stack<>();
        for (int i= arr.length-1;i>=0;i--)
        {
            while (!sk.isEmpty() && arr[i]> sk.peek()){
                sk.pop();
            }
            if (!sk.isEmpty()){
                System.out.println(arr[i]+" "+ sk.peek());
            }else {
                System.out.println(arr[i]+" "+(-1));
            }
            sk.push(arr[i]);
        }
    }
}
