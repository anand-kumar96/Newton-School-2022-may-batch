package com.company.Newton_School.DSA2.Queue.Deque;
//Implementation of Deque using circular array
class DequeCa{
    int front=-1;
    int rear=0;
    int DequeArr[];
    int size;
    DequeCa(int sz){
       size=sz;
        DequeArr=new int[size];
    }
    // operation
    // Checks whether Deque is full or not.
   boolean isFull(){
       return ((front==0 && rear==size-1) || front==rear+1);
    }
    boolean isEmpty(){
        return (front==-1);
    }

// Inserts an element at front
    void insertfront(int val){
        // full condition
        if((front==0 && rear==size-1)|| front==rear+1){
            System.out.println("Queue is full");
        }else{
            // If queue is initially empty
            if(front==-1) {
                front++;
                rear = 0;
            }else if(front==0) // front is at first position of queue then move Front to point last index of array.
                front=size-1;
              else front--; // decrement front end by '1'

          // insert current element into Deque
            DequeArr[front]=val;
        }
    }

    // function to inset element at rear end of Deque
    void insertrear(int val){
        // check full condition
        if((front==0 && rear==size-1)|| front==rear+1){
            System.out.println("Queue is full");
        }else{
            // If queue is initially empty
            if(front==-1){
                front++;
                rear = 0;
            }else if(rear==size-1) // rear is at last position of queue then move rear to point zeroth index of array.
            rear=0;
          else rear++; // increase rear by 1

            // insert current element into Deque
            DequeArr[rear] = val;
        }
    }

    // Deletes element at front end of Deque
    void deletefront() {
        // check whether Deque is empty or not
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }else{
            // Deque has only one element
            if (front == rear){
                front = -1;
                rear = -1;
            }else

                if (front == size - 1) front = 0; // if front is at last position thn back to initial position
                else // increment front by '1' to remove current front value from Deque
              front = front + 1;
        }
    }

    // Delete element at rear end of Deque
    void deleterear() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        } else{
            // Deque has only one element
            if (front == rear){
                front = -1;
                rear = -1;
            }else if(rear == 0) rear = size - 1; // if rear is at first position thn back to last position of deque
            else
                rear = rear-1;
        }
    }
    // to get front element of Deque
    int getFront(){
        // check whether Deque is empty or not
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return DequeArr[front];
        }
    }

    // to get rear element of Deque
    int getRear(){
        // check whether Deque is empty or not
        if(front==-1 || rear ==-1){
            System.out.println(" Underflow\n");
            return -1 ;
        }
        return DequeArr[rear];
    }
}


public class DequeArray {
    public static void main(String[] args) {
        DequeCa dq=new DequeCa(5);
        dq.deleterear(); //Queue is empty
        dq.insertfront(15);
        dq.insertfront(20);
        dq.insertfront(10);
        System.out.println(dq.getFront()); // 10
        dq.deletefront(); // 20 deleted
        System.out.println(dq.getFront()); // 20
        dq.insertrear(5);
        dq.insertrear(7);
        System.out.println(dq.getRear());//7
        dq.deleterear();
        System.out.println(dq.getRear());//5
        System.out.println(dq.isEmpty());
        System.out.println(dq.isFull());
        dq.insertrear(17);
        dq.insertrear(27);
        dq.insertrear(52); //Queue is full
    }
}
