/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
static public Node moveZeroes(Node head){
Node run=head;
Node temp=null;
while(run.next!=null){
    temp=run.next;
    if(temp.data==0){
        run.next=run.next.next;
        temp.next=head;
        head=temp;
    }else{
    run=run.next;
    }  
    }
    return head;
}
