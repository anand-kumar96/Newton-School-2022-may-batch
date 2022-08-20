/*
class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
*/
 static Node addOne(Node head) {
       Node temp=new Node(1); 
    Node dummyhead = new Node(0);
    Node curr = dummyhead;
    int carry = 0;
    while (head != null || temp != null) {
        int x = (head != null) ?head.data : 0;
        int y = (temp != null) ? temp.data: 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new Node(sum % 10);
        curr = curr.next;
        if (head != null)head =head.next; 
        if (temp != null)temp = temp.next;
    }
    if (carry > 0) {
        curr.next = new Node(carry);
    }
    return dummyhead.next;
}
