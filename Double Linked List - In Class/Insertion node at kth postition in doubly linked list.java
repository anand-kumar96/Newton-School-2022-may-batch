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


public static Node insertnew(Node head,int vals, int pos) {  
    Node temp = new Node(vals);
        if (pos == 1) {
            temp.next = head;
            temp.prev=null;
            head = temp;
            // insert at middle
        } else {
            Node run = head;
            for(int i=1;i<pos-1;i++){
                run = run.next;
            }
            temp.next = run.next;
            run.next = temp;
            temp.prev = run;     ///-----> extra from Sll
            if (temp.next != null) {
                temp.next.prev = temp;
            }
           }  
           return head;    
    }
