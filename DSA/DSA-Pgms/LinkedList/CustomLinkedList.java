package LinkedList;


public class CustomLinkedList {
    class node1 {
        int data;
        node1 next;

        public node1(int data) {
            this.data = data;
            next = null;
        }
    }
    node1 head;

    public CustomLinkedList() {
        head = null;
    }

    void addFirst(int data) {
        node1 newNode = new node1(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(int data) {
        node1 newNode = new node1(data);
        if (head == null) {
            head = newNode;
        } else {
            node1 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void display() {
        node1 current = head;
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
        nll.display();
    }
}

