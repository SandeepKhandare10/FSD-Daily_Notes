package LinkedList;

class Node10 {
    int data;
    Node10 next;

    public Node10(int data) {
        this.data = data;
        next = null;
    }
}

public class nLinkedList {
    Node10 head;

    public nLinkedList() {
        head = null;
    }

    void addFirst(int data) {
        Node10 newNode = new Node10(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(int data) {
        Node10 newNode = new Node10(data);
        if (head == null) {
            head = newNode;
        } else {
            Node10 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void display() {
        Node10 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        CustomLinkedList nll = new CustomLinkedList();
        nll.addFirst(10);
        nll.addFirst(20);
        nll.addFirst(30);
        nll.addFirst(40);
        nll.addLast(20);
        nll.addLast(30);
        nll.display();
    }
}
