package com.company.Newton_School.DSA2.Queue.CircularQueue;

class CircularQueue{
    int size;
    int rear=-1,front=-1;
    int capacity=0,length=0;
    int ArrayQueue[];
    CircularQueue(int sz){
        size=sz;
        ArrayQueue=new int[size];
        capacity=size;
    }
    void enqueue(int val){
        if(length==capacity){
            System.out.println("Queue sis full");
        }else{
            if(front==-1) front++;
            rear++;
            ArrayQueue[rear]=val;
            length++;
            if(rear==capacity-1) rear=-1;
        }
    }

    void dequeue(){
        if(length==0){
            System.out.println("Queue is empty");
        }else{
            System.out.println("removed element is " +ArrayQueue[front]);
            front++;
            length--;
            if(front==capacity) front=0;
        }
    }
    int peek(){
        int value=-1;
        if(length==0){
            System.out.println("Queue is empty");
        }else
            value=ArrayQueue[front];
            return value;
    }
}
public class CircularQueues {
    public static void main(String[] args) {
        CircularQueue cq=new CircularQueue(3);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.dequeue();
        cq.dequeue();
        System.out.println(cq.peek());
        cq.dequeue();
        System.out.println(cq.peek());
        cq.enqueue(60);
        System.out.println(cq.peek());//60
        cq.enqueue(40);
        cq.dequeue(); //60
        System.out.println(cq.peek());//40
        cq.enqueue(50);



        // using interface
//        Queue<Integer> dq = new LinkedList<Integer>();
//        dq.add(10);
//        dq.add(20);
//        System.out.println(dq.peek());
//        dq.add(30);
//        dq.remove();
//        System.out.println(dq.peek());
//        System.out.println(dq.element());
    }
}
