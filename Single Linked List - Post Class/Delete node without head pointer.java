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

public static void deleteNode(Node D) {
    Node next=D.next;
    Node temp=next.next;
    D.val=next.val;
    D.next=temp;

}
