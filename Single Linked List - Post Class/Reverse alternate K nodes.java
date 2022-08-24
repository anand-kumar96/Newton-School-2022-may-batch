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
 public static Node ReverseAlternateK(Node head,int k){
 Node currNode=head;
 Node prev=null;
 int count=0;
 while(currNode!=null && count<k){
     Node temp=currNode.next;
     currNode.next=prev;
     prev=currNode;
     currNode=temp;
     count++;
 }
 if(head!=null){
     head.next=currNode;
 }
    count=0;
    while(currNode!=null && count<k-1){
    currNode=currNode.next;
    count++;
    }
    if(currNode!=null){
    currNode.next=ReverseAlternateK(currNode.next,k);
    }
 return prev;  // think recusively to find prev pointer locattion via stack
}
