
public class MyLinkedList {
    public class Node {
        int data;
        Node next;
    }
    Node head;
    Node tail;
    int count;

    int getFirst() {
        if (count == 0) {
            System.out.println("linked list is empty");
        }
        return head.data;
    }

    int getLast() {
        if (count == 0) {
            System.out.println("linked list is empty");
        }
        return tail.data;
    }

    void display() {

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
        void addFirst(int item) {
        Node newnode = new Node();
        newnode.data = item;
        if (count == 0) {
            head = newnode;
            count = count + 1;
        } else {
            newnode.next = head;
            head = newnode;
            count = count + 1;
        }
    }
    int length() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.getFirst();
        ll.display();
        System.out.println("Length of Linked List is " + ll.length());
    }
}