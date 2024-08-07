package Trees;


import java.util.LinkedList;
import java.util.Queue;

public class ExTree {
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left= null;
            this.right=null;
        }
    }
    static void preorder(Node root){
        if (root==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(Node root){
        if (root==null)
            return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void postorder(Node root){
        if (root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        int sum= leftSum + rightSum + root.data;
        System.out.println(root.data);
        return sum;

    }
    static boolean Found(Node root, int key){
        if (root==null)
            return false;
        if(root.data==key)
            return true;
        return Found(root.left,key)||Found(root.right,key);

    }
    void insertdata(Node root,int key){
        Queue<Node> qt= new LinkedList<>() {
        }
        if (root==null);
        return;
    }

    public  void main(String[] args)

    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.right =new Node(4);
        root.left.left= new Node(5);
        root.right.left=new Node(6);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        System.out.println(Found(root,5));
        System.out.println(sumOfNodes(root));

    }
}
