package LinkedList;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        next = null;
    }
}

public class Linkedlist {
    Node1 head;
    int count;

    Linkedlist() {
        head = null;
    }

    void AddFirst(int data) {
        Node1 newNode = new Node1(data);
        count++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void lastAdd(int data) {
        Node1 newNode = new Node1(data);
        count++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node1 currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

//    int MidEle() {
//    int lenLL=size();
//    int count=0;
//    Node1 last=head;
//    while (last!=null && )
//        return 0;
//    }
int MidEle() {
        Node1 slow=head;
    Node1 Fast=head;
    while (slow!=null&&Fast!=null&&Fast.next!=null){
        slow=slow.next;
        Fast=Fast.next.next;
    }
    return slow.data;
}

    int size() {
        System.out.println("Size " + count);
        return 0;
    }

    void print() {

        Node1 currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    void addanyPoint(Node1 pre, int data) {
        Node1 newnode = new Node1(data);

        if (pre.next == null) {
            return;
        }
        newnode.next = pre.next;
        pre.next = newnode;
    }

    void sum() {
        int sum = 0;
        Node1 currNode = head;
        while (currNode != null) {
            sum += currNode.data;
            currNode = currNode.next;
        }
        System.out.println("Sum of LinkedList is " + sum);
    }

    public static void main(String[] args) {

        Linkedlist ll = new Linkedlist();

        ll.lastAdd(5);
        ll.lastAdd(15);
        ll.lastAdd(20);
        ll.lastAdd(25);
        ll.lastAdd(30);
        ll.AddFirst(100);
        ll.AddFirst(110);
        ll.AddFirst(120);
        ll.AddFirst(130);

        ll.size();
        ll.sum();

        ll.print();
        System.out.println(" After ");
        Node1 nodeadd = ll.head.next.next.next.next.next.next.next;
        ll.addanyPoint(nodeadd, 111);
        ll.print();
        ll.sum();
        int MidElement=ll.MidEle();
        System.out.println("Mid ele is "+MidElement);
    }
}

