/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node addElement(Node head, int k) {
Node temp=new Node(k);
if(head==null){
    head=temp;
    return head;
}else{
    Node run=head;
    while(run.next!=null){
        run=run.next;
    }
    run.next=temp;
   
}
 return head;
}
