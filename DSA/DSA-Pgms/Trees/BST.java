package Trees;

import java.security.Key;
import java.util.LinkedList;
import java.util.Queue;

class BST {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
    Node root;
    BST() {
        root = null;
    }
    void insert(int key) {
        root = insertRec(root, key);
    }
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

     static void LeafNodes(Node root) {
    if (root == null) {
        return;
    }
    if (root.left == null && root.right == null) {
        System.out.print(root.key + " ");
        LeafNodes(root.left);
        LeafNodes(root.right);
    }

}
//    static void spirallevelords(Node key){
//        Queue<Node1> qt=new LinkedList<>();
//        qt.add(key);
//        while (!qt.isEmpty()){
//            Node1 temp=qt.poll();
//            System.out.print(temp.data+" ");
//        }
//    }


    int lowestCommonAncestor(Node root, int Key1, int Key2) {
        if (root == null) {
            return -1;
        }
        if (Key1 < root.key && Key2 < root.key) {
            return lowestCommonAncestor(root.left, Key1, Key2);
        }
        if (Key1 > root.key && Key2 > root.key) {
            return lowestCommonAncestor(root.right, Key1, Key2);
        }
        return root.key;
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(10);
        tree.insert(7);
        tree.insert(12);
        tree.insert(2);
        tree.insert(11);
        tree.insert(8);
        tree.insert(1);
        tree.insert(13);
        tree.insert(5);

        tree.inorder();
        System.out.println();
        LeafNodes(tree.root);
        System.out.println();
        System.out.println(tree.lowestCommonAncestor(tree.root, 2,13));
//        System.out.println(tree.leafnode(tree.root));
    }
}
