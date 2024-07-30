class Node1 {
    int data;
    Node1 next;
    Node1(int data) {

        this.data = data;
        next = null;
    }
}
public class linklist {
    Node1 head;
    int count;
    linklist() {
        head = null;
    }
    void AddFirst(int data){
        Node1 newNode = new Node1(data);
        count++;
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
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

void size(){
    System.out.println("Size "+count);
}
    void print() {

        Node1 currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    void sum(){
        int sum = 0;
        Node1 currNode = head;
        while (currNode != null) {
            sum += currNode.data;
            currNode = currNode.next;
        }
        System.out.println("Sum of LinkedList is "+sum);
    }
    public static void main(String[] args) {

        linklist ll = new linklist();

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
        ll.print();
        ll.sum();

    }
}
