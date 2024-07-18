package LinkedList;

public class NLL {
    node head;
    NLL(){
        head=null;
    }
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            next=null;
        }}

    void AddFirst(int data){
        node newNode = new node(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void Dispaly() {

        node last = head;
        node first=head.next;
        while (last != null) {
            System.out.print(last.data+" ");
            last = last.next;
        }
    }

    public static void main(String[] args) {
        NLL obj=new NLL();
        obj.AddFirst(50);
        obj.AddFirst(40);
        obj.AddFirst(30);
        obj.AddFirst(20);
        obj.AddFirst(10);
        obj.AddLsat(60);
        obj.AddLsat(70);
        obj.AddLsat(80);
        obj.revese();
        obj.Dispaly();
         System.out.println();
        obj.FindEle(20);
    }

     void revese() {
        node pvrnode=null;
        node last=head;
        node next=null;
        while (last!=null){
            next=last.next;
            last.next=pvrnode;
            pvrnode=last;
            last=next;
        }
        head=pvrnode;
    }
    void FindEle(int ele){
        boolean flag=false;
        node last=head;
        int count=0;
        while (last!=null){
            count++;

        if (last.data==ele) {
            flag = true;
            break;
        }
        last=last.next;
        }
        if (flag==true){
            System.out.println("Ele is present "+count);
        }else {
            System.out.println("Ele is not Present "+count);
        }
    }
    void AddLsat(int data){
        node newNode = new node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
}
