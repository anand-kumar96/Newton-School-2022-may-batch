/*

class Node {
    Node next;
    Node random;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        random = null;
    }
}
*/

public static Node CloneList(Node head) {
    Node curr=head;
    while (curr!=null) {
        Node temp=curr.next;
        curr.next=new Node(curr.val);
        curr.next.next=temp;
        curr=temp;
    }
    curr=head;
    while(curr!=null) {
        if (curr.next!=null) {
            curr.next.random=(curr.random!=null)?
                    curr.random.next:curr.random;
        }
        curr=curr.next.next;
    }
    Node org=head,copy=head.next;
    Node temp=copy;
    while (org!=null) {
        org.next=org.next.next;
        copy.next=(copy.next != null) ?
                 copy.next.next: copy.next;
        org=org.next;
        copy=copy.next;
    }
    return temp;
}
