package Trees;
import java.util.*;

public class GeneralTree {
    static class Node{
        int key;
        Vector<Node > child = new Vector<>();
    }

 public static Node newNode(int key)
    {
   Node temp = new Node();
        temp.key = key;
        return temp;
    }

    public static void LevelOrderTraversal(Node root)
    {
        if (root == null)
            return;

// Standard level order traversal code
// Queue is used to traverse the tree level-wise starting from the root node
        Queue<Node > q = new LinkedList<>(); // Create a queue
        q.add(root); // Enqueue root
        while (!q.isEmpty()){

            int n = q.size();

// If this node has children
            while (n > 0)
            {
// Dequeue an item from queue
// and print it
                Node p = q.peek();
                q.remove();
                System.out.print(p.key + " ");

// Enqueue all children of
// the dequeued item
                for (int i = 0; i < p.child.size(); i++)
                    q.add(p.child.get(i));
                n--;
            }
// One level is completed
// Now nodes in the next level is printed in the next line and same task is repeated each time the nodes in a level are exhausted
            System.out.println();

        }
    }
    public static void main(String[] args){



// creating a root node with value 10
        Node root_node = newNode(10);

// adding four childs to the root node having values 2, 34, 56, adn 100 respectively
        (root_node.child).add(newNode(2));
        (root_node.child).add(newNode(34));
        (root_node.child).add(newNode(56));
        (root_node.child).add(newNode(100));

// adding two child nodes to the first child node of the root node having values 77, and 88 respectively
        (root_node.child.get(0).child).add(newNode(77));
        (root_node.child.get(0).child).add(newNode(88));


// adding one child nodes to the third child node of the root node having values 1
        (root_node.child.get(2).child).add(newNode(1));

// adding three child nodes to the fourth child node of the root node having values 7, 8, and 9 respectively
        (root_node.child.get(3).child).add(newNode(7));
        (root_node.child.get(3).child).add(newNode(8));
        (root_node.child.get(3).child).add(newNode(9));

        System.out.println("Printing the nodes of tree level wise :");
        System.out.println("Level order traversal : ");

        LevelOrderTraversal(root_node);
    }

}


