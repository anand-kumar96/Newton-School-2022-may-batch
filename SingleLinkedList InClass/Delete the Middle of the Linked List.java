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

public static Node deleteMiddleElement(Node head) {
    // first find length of linked list
		Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==1){
            head.val=-1;
            return head;
        }else{
            temp=head;
            int cnt=count/2;
            int I=1;
            while(I!=cnt){
                temp=temp.next;
                I++;
            }
            temp.next=temp.next.next;
          
        }
          return head;
    }


// using slow and fast approach


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
    public static Node deleteMiddleElement(Node head) {
        //find the middle
        // when only one ndoe is give
        if (head.next == null) {
            head.val = -1; // head=new Node(-1);
            return head;
        }

        Node slow = head, fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow; // last slow
            slow = slow.next; //by1
            fast = fast.next.next; // by 2t
        }
        //slow is the middle
        prev.next = prev.next.next;
        return head;
    }
}
