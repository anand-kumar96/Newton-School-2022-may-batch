package com.company.Newton_School.LinkedList;
class Node {
    int value;
    Node next; // next is variable //next node, next pointer// next reference

//creating constructor
    Node(int nodevalue){
        value=nodevalue;
    }
}
        public class Single_LinkedList {
        static Node head=null; //static Node head;--> both same

        public static void  PrintLL() {
        Node run =head; // run is variable or object or better to called pointer
        while(run!=null){
        System.out.print(run.value+" ");
        run=run.next;// thn print next value
        }
        System.out.println();
        }


        static void insertAtEnd(int number) {
            // insert number at end
            // creating a temp node for number
            Node temp = new Node(number);
            if (head == null) {   // but if head is null so
                head=temp;
            } else {
                Node run = head;// taking run as pointer
                while (run.next != null) {  // when next compartment of current run become null loop break
                run = run.next;
                }
                run.next = temp;
            }
        }


        static void insertAtPos(int pos,int value){
        Node temp=new Node(value);
        if(pos==1){ // insert at front
            temp.next=head;// this will cover all thing and add
            head=temp;  // if we write this only thn this will give only one linked list element
        }else{  // insert at middle
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
                for(int i=1;i<pos-1;i++){
                    run=run.next;
                }
                run.next=run.next.next;
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
    }
}
