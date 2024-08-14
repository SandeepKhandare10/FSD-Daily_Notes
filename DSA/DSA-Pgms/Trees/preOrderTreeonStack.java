package Trees;

import java.util.*;
public class preOrderTreeonStack {
    class Node {
        int data;
        Node left;
        Node Right;

        Node(int data) {
            this.data = data;
            left = Right = null;
        }
    }

    static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            Node node = st.pop();
            System.out.print(node.data + " "); // Use print to stay on the same line

            if (node.Right != null) {
                st.push(node.Right);
            }
            if (node.left != null) {
                st.push(node.left);
            }
        }
    }

    public void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.Right = new Node(3);
        root.left.left = new Node(4);
        root.left.Right = new Node(5);
        root.Right.left = new Node(6);
        root.Right.Right = new Node(7);
        preOrder(root);
    }
}
