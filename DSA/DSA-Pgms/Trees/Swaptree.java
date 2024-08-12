package Trees;

import java.util.*;

class Source {
    int val;
    Source left, right;

    Source(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Swaptree {

    public static Source buildTree(int[] levelOrder) {
        if (levelOrder.length == 0 || levelOrder[0] == -1) {
            return null;
        }

        Source root = new Source(levelOrder[0]);
        Queue<Source> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < levelOrder.length) {
            Source current = queue.poll();

            if (levelOrder[i] != -1) {
                current.left = new Source(levelOrder[i]);
                queue.add(current.left);
            }
            i++;

            if (i < levelOrder.length && levelOrder[i] != -1) {
                current.right = new Source(levelOrder[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    public static Source invertTree(Source root) {
        if (root == null) {
            return null;
        }

        Source temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static List<Integer> levelOrderTraversal(Source root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Source> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Source node = queue.poll();
            if (node != null) {
                result.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            } else {
                result.add(-1);
            }
        }

        // Remove trailing -1s
        while (!result.isEmpty() && result.get(result.size() - 1) == -1) {
            result.remove(result.size() - 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] levelOrder = new int[n];

        for (int i = 0; i < n; i++) {
            levelOrder[i] = scanner.nextInt();
        }

        // Build the tree from the level-order input
        Source root = buildTree(levelOrder);

        // Invert the tree
        Source invertedRoot = invertTree(root);

        // Output the level-order traversal of the inverted tree
        List<Integer> invertedLevelOrder = levelOrderTraversal(invertedRoot);
        for (int val : invertedLevelOrder) {
            System.out.print(val + " ");
        }
    }
}
