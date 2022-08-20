package com.company.Newton_School.DSA2.Queue.SimpleQueue;

import java.util.LinkedList;
import java.util.Queue;

class ArrayQueue{
    int size;
    int front=-1,rear=-1;
    int QueueArray[];
    ArrayQueue(int sz){
        size=sz;
        QueueArray=new int[size];
    }
    //operation


    // add an element into q - stand in the q line
    void enqueue(int val) { // same as push operation
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) front++;
            rear++;
            QueueArray[rear] = val;
        }
    }


    //remove an element from q - issue ticket
    void dequeue(){ //--->same as pop operation in stack
        if(front==-1 || front >rear){
            System.out.println("Queue is empty");
        }else
            System.out.println("removing element: " + QueueArray[front]);
            front++;
    }



    //next element to be removed or top of element it will  not removed
    int peek(){ // same as peek operation in stack
        int num = -1;
        if(front==-1 || front >rear){
            System.out.println("Queue is empty");
            return -1;
        }else {
          num = QueueArray[front];
        }
        return num;
            //return QueueArray[front];  //-->just in one line
        }
        boolean isEmpty(){
        if(front==-1 || front>rear) return true;
        else{
            return false;
        }
        }
}


public class Queues {
    public static void main(String[] args) {
//    ArrayQueue q=new ArrayQueue(3) ;
//        System.out.println(q.isEmpty()); // true
//        q.enqueue(10);
//        q.enqueue(20);
//        q.enqueue(30);
//        q.enqueue(40); // queue is full
//        System.out.println(q.peek()); //10
//        q.dequeue(); // 10
//        System.out.println(q.isEmpty());// false
//        System.out.println(q.peek()); //20
//        q.dequeue(); // 20
//        q.dequeue(); // 30
//        q.dequeue(); // queue is empty
//        System.out.println(q.peek()); //-1


//        // using Queue class method
//       // Queue<Integer>q=new Queue<>();  // this showing errror why? use linkedList
       Queue<Integer> q=new LinkedList<>();
        //q.remove(); // throw error
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.remove(); // 10
        System.out.println(q.peek()); // 20
        System.out.println(q.isEmpty());
        System.out.println(q.element());
        System.out.println(q);

    }
}


