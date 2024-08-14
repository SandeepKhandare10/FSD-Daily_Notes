package Trees;

import java.util.Stack;

public class postOrderTreeonStack {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node current = root;
        Node prev = null;

        do {
            // Go to the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            while (current == null && !stack.isEmpty()) {
                current = stack.peek();
                // Check if the current node has a right child that hasn't been processed yet
                if (current.right == null || current.right == prev) {
                    System.out.print(current.data + " ");
                    stack.pop();
                    prev = current;
                    current = null; // Ensures we don't go back to the left side
                } else {
                    current = current.right;
                }
            }
        } while (!stack.isEmpty());
    }

    public static void main(String[] args) {
        postOrderTreeonStack tree = new postOrderTreeonStack();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        root.right.left = tree.new Node(6);
        root.right.right = tree.new Node(7);
        postOrder(root);
    }
}
