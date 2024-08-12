package Trees;


import java.util.LinkedList;
import java.util.Queue;

public class findtreeEle {
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        int sum = leftSum + rightSum + root.data;
        return sum;
    }

    static boolean Found(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        return Found(root.left, key) || Found(root.right, key);
    }

    void insertdata(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return;
        }

        Queue<Node> qt = new LinkedList<>();
        qt.add(root);

        while (!qt.isEmpty()) {
            Node temp = qt.poll();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                qt.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                qt.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        findtreeEle tree = new findtreeEle();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.right = tree.new Node(4);
        root.left.left = tree.new Node(5);
        root.right.left = tree.new Node(6);

        // Traversals
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();

        // Searching
        System.out.println("Found 5: " + Found(root, 5));
        System.out.println("Found 10: " + Found(root, 10));

        // Sum of Nodes
        System.out.println("Sum of Nodes: " + sumOfNodes(root));
        System.out.println();
        // Insert new data into the tree
        tree.insertdata(root, 7);

    }
}

