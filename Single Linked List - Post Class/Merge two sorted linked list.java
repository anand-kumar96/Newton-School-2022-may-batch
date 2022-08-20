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
/*
below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

*/
public static Node Merge (Node h1, Node h2){
if(h1==null) return h2;
if(h2==null) return h1;
if(h1.val>h2.val){
    Node temp=h1;
    h1=h2;
    h2=temp;
}
Node res=h1;
while(h1!=null && h2!=null){
    Node temp=null;
    while(h1!=null && h1.val<=h2.val){
        temp=h1;
        h1=h1.next;
    }
    temp.next=h2;
    // swap
    temp=h1;
    h1=h2;
    h2=temp;
}
return res;
}
