class node {
    int data;
    node next;
    node(int data) {
        this.data = data;
        next = null;
    }
}
public class LinkedList {
    node head;
    LinkedList() {
        head = null;
    }

    void insertAtEnd(int data) {
        node newnode = new node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newnode;
    }

    void printLinkelist() {
        node last = head;
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.next;
        }
    }
    public static void main(String[] args) {
        LinkedList sk = new LinkedList();
        sk.insertAtEnd(10);
        sk.insertAtEnd(20);
        sk.insertAtEnd(30);
        sk.insertAtEnd(40);
        sk.insertAtEnd(50);
        sk.printLinkelist();
    }
}
