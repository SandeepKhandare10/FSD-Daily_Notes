package Trees;
//
//class Node {
//    static public Node root;
//    int data;
//    Node left, right, nextRight;
//
//    Node(int item) {
//        data = item;
//        left = right = null;
//    }
//}
//public class Sumtree {
//    public static Node root;
//
//    static int sum(Node ndata) {
//        if (ndata == null) {
//            return 0;
//        }
//        return (sum(ndata.left) + ndata.data + sum(ndata.right));
//    }
//    static int FindHeight(Node root){
//        if (root==null)
//            return -1;
//        int lHeight=FindHeight(root.left);
//        int rHeight=FindHeight(root.right);
//        return 1*Math.max(lHeight,rHeight);
//    }
//    static boolean isSumTree(Node ndata){
//        int leftsum,rightsum;
//
//        if(ndata == null || (ndata.left == null && ndata.right == null)){
//
//            return true;
//        }
//        leftsum = sum(ndata.left);
//        rightsum = sum(ndata.right);
//
//        if((ndata.data == leftsum + rightsum) && isSumTree(ndata.left)  && isSumTree(ndata.right) ){
//            return true;
//        }
//        return false;
//    }
//    static boolean identicalTrees(Node a, Node b){
//        if (a == null && b == null)
//            return true;
//        if (a.data!= b.data){
//            return false;
//        }
//        if (a != null && b != null)
//            return (a.data == b.data && identicalTrees(a.left, b.left) && identicalTrees(a.right, b.right));
//        return false;
//    }
//    public static void main(String[] args) {
//
//        Sumtree tree = new Sumtree();
//        tree.root = new Node(26);
//        tree.root.left = new Node(10);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(6);
//        tree.root.right.right = new Node(3);
//        System.out.println(isSumTree(root));
//
////        Sumtree tree1 = new Sumtree();
////
////        tree1.root = new Node(26);
////        tree1.root.left = new Node(10);
////        tree1.root.right = new Node(3);
////        tree1.root.left.left = new Node(4);
////        tree1.root.left.right = new Node(6);
////        tree1.root.right.right = new Node(3);
//        System.out.println(FindHeight(tree));
//
////        System.out.println(tree.identicalTrees(tree1,tree)
//    }
//}

class Node {
    int data;
    Node left, right, nextRight;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Sumtree {
    public static Node root;

    // Calculate the sum of all nodes in the tree
    static int sum(Node ndata) {
        if (ndata == null) {
            return 0;
        }
        return (sum(ndata.left) + ndata.data + sum(ndata.right));
    }

    static int FindHeight(Node root) {
        if (root == null)
            return -1;
        int lHeight = FindHeight(root.left);
        int rHeight = FindHeight(root.right);
        return 1 + Math.max(lHeight, rHeight);
    }

    static boolean isSumTree(Node ndata) {
        int leftsum, rightsum;

        if (ndata == null || (ndata.left == null && ndata.right == null)) {
            return true;
        }

        leftsum = sum(ndata.left);
        rightsum = sum(ndata.right);

        if ((ndata.data == leftsum + rightsum) && isSumTree(ndata.left) && isSumTree(ndata.right)) {
            return true;
        }
        return false;
    }

    static boolean identicalTrees(Node a, Node b) {
        if (a == null && b == null)
            return true;

        if (a != null && b != null)
            return (a.data == b.data && identicalTrees(a.left, b.left) && identicalTrees(a.right, b.right));

        return false;
    }

    public static void main(String[] args) {

        // Create a tree to check if it's a sum tree
        Sumtree tree = new Sumtree();
        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(3);

        // Check if the tree is a SumTree
        System.out.println("Is the tree a SumTree? " + isSumTree(root));

        // Find the height of the tree
        System.out.println("Height of the tree: " + FindHeight(tree.root));

        // Create another tree and compare them
        Sumtree tree1 = new Sumtree();
        tree1.root = new Node(26);
        tree1.root.left = new Node(10);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(6);
        tree1.root.right.right = new Node(3);
//        System.out.println(FindHeight(tree1 root));
        // Check if tree and tree1 are identical
        System.out.println("Are the two trees identical? " + identicalTrees(tree.root, tree1.root));
    }
}

