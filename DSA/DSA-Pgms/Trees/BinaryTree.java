package Trees;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    // Method to perform level order traversal of the binary tree
    void printLevelOrder() {
        if (root == null) {
            return;
        }

        // Initialize a queue to store nodes
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // Remove the front of the queue and print it
            TreeNode tempNode = queue.poll();
            System.out.print(tempNode.val + " ");

            // Enqueue the left child
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            // Enqueue the right child
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);

        System.out.println("Level order traversal of binary tree is:");
        tree.printLevelOrder();
    }
}

