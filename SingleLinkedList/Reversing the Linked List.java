/*
// information about the class Nodeclass Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/


public static Node ReverseLinkedList(Node head) {
    Node prev=null;
    Node currNode=head;
    while(currNode!=null){
        Node temp=currNode.next;
        currNode.next=prev;
        prev=currNode;
        currNode=temp;
    }
		return prev;
    }
