package com.company.Newton_School.LinkedList;
class NodeDLL {
    int value;
    NodeDLL next;
    NodeDLL prev;

        NodeDLL(int  nodeValue) {   // constructor - initialize and called   when obj is created
        value= nodeValue;
        }
        }
        // main class
        public class DoublyLinkedList {
        static NodeDLL head;

            // insert a node at end
            static void insertAtEnd(int number) {
                // creating a temp node for number
                NodeDLL temp = new NodeDLL(number); // temp is reference  only have address not value // node have both value and reference
                /*This temp is going to be the last node, so
                 * make next of it as NULL */
                temp.next=null;
                // If the Linked List is empty, then make this temp as head
                if (head == null) {
                    temp.prev=null;   // added -> point to prev node  ---------> one change from sll
                    head=temp;
                } else {
                    NodeDLL run = head;
                    while (run.next != null) {
                        run = run.next;
                    }
                    run.next = temp;
                    temp.prev = run; // added -> point to prev node  ---------> one change from sll
                }
            }


        // traversing or Print forward  linked list
        public  static void transverseForward() {
        NodeDLL run = head;
        //Checks whether the list is empty
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        while (run != null) {
            System.out.print(run.value+ " ");
            run = run.next;
        }
        System.out.println();
       }

        // traversing or Print backward the linked list
        public  static void transverseBackward() {
        NodeDLL tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        //Checks whether the list is empty
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        while (tail!= null) {
            System.out.print(tail.value+ " ");
            tail = tail.prev;
        }
            System.out.println();
        }

        // insert a node at the front of the list
        public  static  void insertFront(int number) {
        // Create New Node and put data in it.
        NodeDLL temp = new NodeDLL(number);
        // Update next of the temp as head and previous as null.
            temp.next = head;
            temp.prev = null;
            // Change prev of head node to temp
            if (head != null) {
                head.prev = temp;
                head = temp;
                }
                }

       // inserting a new node after a given node
        public  static void InsertAfter(NodeDLL previousNode, int number) {
       // Check if the given prev_node is null
            if (previousNode == null) {
                System.out.println("prev node is null ");
                return;
                }
                // Create New Node and put data in it.
                NodeDLL temp = new NodeDLL(number);
                // Make next of temp as next of previousNode
                temp.next = previousNode.next;
                // Make the next of previousNode as temp
                previousNode.next = temp;
                // Make previousNode as previous of temp
                temp.prev = previousNode;
                if (temp.next != null)
                    temp.next.prev = temp;
               }


         // inserting a new node before  a given node
        public static  void insertBefore(NodeDLL nextNode, int number) {
        // Check if the given nextNode is NULL
            if (nextNode == null) {
                System.out.println("prev node is null ");
                return;
                }
                // Create temp and put data in it.
                NodeDLL temp = new NodeDLL(number);
                // Make prev of temp as prev of nextNode
                temp.prev = nextNode.prev;
                // Make the prev of nextNode as temp
                nextNode.prev = temp;
                // Make nextNode as next of temp
                temp.next = nextNode;
                // Change next of temp's previous node
                if (temp.prev != null) {
                    temp.prev.next = temp;
                }else {
                    // If the prev of temp is NULL, it will be the new head node
                    head = temp;
                }

            }

      // insert at any position
      static void insertAtPos(int pos, int val) {
      //pos is valid? how find invalid, len

        // insert at front
        NodeDLL temp = new NodeDLL(val);
        if (pos == 1) {
            temp.next = head;
            temp.prev=null;
            head = temp;
            // insert at middle
        } else {
            NodeDLL run = head;
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
       }

            // delete a given node
            static void deleteNode(NodeDLL del) {
                // If the DLL is Empty or the NodeToDelete is Null, then there is nothing to do.
                if (head == null || del == null) {
                    return;
                }
                // If node to be deleted is head node
                // Head now points to the next of del meaning del is not a part of DLL anymore.
                if (head == del) {
                    head = del.next;
                }
                // If del is NOT the last node:
                if (del.next != null) {
                    del.next.prev = del.prev;
                }
                // If del is NOT the first node
                if (del.prev != null) {
                    del.prev.next = del.next;
                }
            }


            // delete at any position
            static void deletePos(int pos){
                // If the list in NULL or invalid position is given.
                if (head == null || pos <= 0) {
                    return;
                }else{
                    NodeDLL run=head;
                    // Find the key to be deleted
                    for(int i=1;run!=null && i<pos;i++){
                        run=run.next;
                    }
                    if(run==null){
                        return;
                    }
                    deleteNode(run);
                 }

                 }

             static void Reverse() {
                NodeDLL run = head;
                NodeDLL temp = null;
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
            }
            public static void searchNode(int value) {
                int i = 1;
                //Node run will point to head
                NodeDLL run = head;
                //Checks whether the list is empty
                if (head == null) {
                    System.out.println("List is empty");
                    return;
                }
                // Traversing the List.
                while (run != null) {
                    //Compare value to be searched with each node in the list
                    if (run.value == value) {
                        System.out.println("Node is present in the list at the position : " + i);
                        return;
                    }
                    run = run.next;
                    i++;
                }
                System.out.println("Node is not present in the list");
            }



    public static void main(String[] args) {
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);
        transverseForward();
        transverseBackward();
        insertFront(100);
        transverseForward();
        InsertAfter(head.next,40);
        transverseForward();
        transverseBackward();
        insertBefore(head,120);
        transverseForward();
        insertBefore(head.next,150);
        transverseForward();
        insertAtPos(2,53);
        insertAtPos(3,93);
        transverseForward();
        transverseBackward();
        deleteNode(head.next.next);
        deleteNode(head.next);
        transverseForward();
        deletePos(2);
        deletePos(5);
        transverseForward();
        Reverse();
        transverseForward();
        searchNode(120);



    }
}
