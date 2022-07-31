// method01
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

public static Node deleteElement(Node head,int k) {
Node run=head;
int pos=0;
while(run!=null){
    pos++;
    run=run.next;
}
if(k==pos){
    head=head.next;
    return head;
}else
 run=head;
for(int i=1;i<pos-k;i++){
    run=run.next;
}
run.next=run.next.next;
return head;
}

// method 02
