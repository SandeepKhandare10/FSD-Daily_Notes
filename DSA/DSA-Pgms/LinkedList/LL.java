package LinkedList;

class Nodes {

    int data;
    Nodes next;

    Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LL {
    Nodes head;
    int count;
    LL() {
        head = null;
    }
    void AddFirst(int data){
        Nodes newNode = new Nodes(data);

        if (head==null){
            head=newNode;
        }
        newNode.next=head;
        head=newNode;
    }
    void lastAdd(int data) {
        Nodes newNode = new Nodes(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Nodes currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    void prinData(){
        Nodes last = head;
        while (last != null) {
            System.out.println(last.data + " ");
            last = last.next;
        }
    }

    public static void main(String[] args) {
        LL ll=new LL();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddFirst(40);
        ll.AddFirst(50);
        ll.prinData();
    }

    }
