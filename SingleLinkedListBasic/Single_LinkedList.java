package com.company.Newton_School.LinkedList;
// Create a node
class Node {
        int value;
        Node next; // next is variable //next node, next pointer// next reference

        //creating constructor
        Node(int nodeValue){
        value=nodeValue;
    }
       }
        public class Single_LinkedList {
        static Node head=null; //static Node head;--> both same

        // Print the linked list
        public static void  PrintLL() {
        Node run =head; // run is variable or object or better to called pointer
        while(run!=null){
        System.out.print(run.value+" ");
        run=run.next;// thn print next value
        }
        System.out.println();
        }

            // insert at end
           static void insertAtEnd(int number) {
            // creating a temp node for number
            Node temp = new Node(number); // temp is reference  only have address not value // node have both value and reference
            if (head == null) {   // but if head is null so
                head=temp;
            } else {
                Node run = head;// taking run as pointer
                while (run.next != null) {  // when next compartment of current run become null loop break
                run = run.next;
                }
                run.next = temp; // means run--> going to connect with temp
            }
           }

            // insert at any position
             static void insertAtPos(int pos,int value){
             Node temp=new Node(value);
             // insert at front
            if(pos==1){
            temp.next=head;// this will cover all thing and add
            head=temp;  // if we write this only thn this will give only one linked list element
            }else{
            // insert at middle
            Node run=head;
            for(int i=1;i<pos-1;i++){
                run=run.next;
            }
            temp.next=run.next;
            run.next=temp;
           }
           }


           // delete at any position
            static void deletePos(int pos){
            if(pos==1){
                head=head.next;
            }else{
                Node run=head;
                // Find the key to be deleted
                for(int i=1;i<pos-1;i++){
                    run=run.next;
                }
                // Remove the node
                run.next=run.next.next;
            }

            }


            // Search a node
            public static  boolean search(int key) {
                Node run = head;
                while (run != null) {
                    if (run.value == key)
                        return true;
                    run = run.next;
                }
                return false;
            }


            // Sort the linked list
            //We will use a simple sorting algorithm, Bubble Sort, to sort the elements of a linked list in ascending order below.
            static  void sortLinkedList(Node head) {
                Node run = head;
                Node index = null;
                int temp;
                if (head == null) {
                    return;
                } else {
                  while (run != null) {
                 // index points to the node next to run
                  index = run.next;
                  while (index != null) {
                  if (run.value > index.value) {
                  temp = run.value;
                  run.value = index.value;
                  index.value = temp;
                  }
                 index = index.next;
                  }
                 run = run.next;
                 }
                  }
            }

            public static void Reverse() {
                Node prev = null;
                Node run = head;
                while (run != null) {
                    Node temp = run.next;
                    run.next = prev;
                    prev = run;
                    run = temp;
                }
                if(prev!=null){
                    head=prev;
                }
            }


         public static void main(String[] args) {
          // Node head=new Node(10); // instead of writing Node head all time define it globally
          // creating compartment and passing value
//        head=new Node(10);
//        Node s1=new Node(20);
//        Node s2=new Node(20);

          // now connecting compartment
//        head.next=s1; // we are connecting head-->s1-->s2 like that
//        s1.next=s2;
             //now to print we are creating print function
//            PrintLL();

            // instead of inserting value one by one insert by calling function (line 24,25,26)insertAtEnd(50);
            // or inserting at end
//            insertAtEnd(10);
//            insertAtEnd(20);
//            insertAtEnd(20);
//            PrintLL();

              // insert at given position
              insertAtPos(1,10);
              insertAtPos(2,20);
              insertAtPos(3,30);
              PrintLL();
              // insert at middle
              insertAtPos(3,50);
              PrintLL();

              deletePos(1); // deleting 10 means first element
              PrintLL();
              deletePos(3); // delete 30
              PrintLL();

              // search node
             insertAtEnd(60);
             insertAtEnd(18);
             insertAtEnd(11);
             insertAtEnd(12);
             insertAtEnd(19);
             PrintLL();
             System.out.println(search(19));
             System.out.println(search(29));

             // sort linked list
             sortLinkedList(head);
             PrintLL();
             Reverse();
             PrintLL();


    }
}
