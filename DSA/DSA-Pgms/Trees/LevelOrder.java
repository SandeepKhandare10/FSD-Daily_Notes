package Trees;

import java.util.LinkedList;
import java.util.Queue;

class Node1 {
    int data;
    ExTree.Node left, right;

    Node1(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class LevelOrder {
    static void levelord(Node1 root){
        Queue<Node1> qt=new LinkedList<>();
        qt.add(root);
        while (!qt.isEmpty()){
            Node1 temp=qt.poll();
            System.out.print(temp.data+" ");
//            if (temp.left!=null)
//                qt.add(temp.left);
//            if (temp.right!=null);
//            qt.add(temp.right);


        }
    }
}
