/*
class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
  public static Node Reverse(Node head) {
        Node run = head;
       Node temp = null;
       while (run != null) {
           //swap two (prv, next) numbers
           temp = run.prev;
           run.prev = run.next;
           run.next = temp;
           // moving forward
           run = run.prev;
       }
       // making the riht head
       if (temp != null) {
           head = temp.prev;
       }
       return head;
}
