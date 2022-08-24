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
// for this we need two node so that we can get d next 
//and d next next node
//2 - > 3 - > 4 - > 5  // D-->3
Node nextNode=null;
nextNode=D.next; // nextNode-->4
 Node temp=nextNode.next; // temp-->5
 D.val=nextNode.val; //D-->4
 D.next=temp;//D.next->5 i.e 3 is deleted means D become next

}
