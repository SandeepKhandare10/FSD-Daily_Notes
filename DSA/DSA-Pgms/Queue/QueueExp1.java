package Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExp1 {
    void insert(int data){

    }

    public static void main(String[] args) {
        Queue<Integer>qk=new LinkedList<>();

        qk.add(10);
        qk.add(20);
        qk.add(30);
        qk.add(40);
        qk.add(50);
        qk.add(60);
        qk.add(70);
//        qk.remove();
//        System.out.println(qk.peek());
        System.out.println(qk);
        System.out.println(qk.size());
        for(int i = 0 ;i <= qk.size() ; i++ ){
            System.out.println(qk.poll());
        }
//        System.out.println(qk);
    }

}
