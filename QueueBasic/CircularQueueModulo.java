package com.company.Newton_School.DSA2.Queue.CircularQueue;
class CQueue {
    int size; // Size of Circular Queue
    int front = -1, rear = -1;
    int[] arr;

    CQueue(int sz) {
        size = sz;
        arr = new int[size];
    }

    // Check if the queue is full
    boolean isFull() {
        if ((front == 0 && rear == size - 1) || (front == rear + 1)) {
            return true;
        } else
            return false;
    }

    // Check if the queue is empty
    boolean isEmpty() {
        if (front == -1) return true;
        else
            return false;
    }

    // Adding an element
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) front++;
            rear = (rear + 1) % size;
            arr[rear] = element;
            System.out.println("Inserted element is " + element);
        }
    }


    // Removing an element
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */ else {
                front = (front + 1) % size;
            }
            return (element);
        }
    }

    void display() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % size)
                System.out.print(arr[i] + " ");
            System.out.println(arr[i]);
            System.out.println("Rear -> " + rear);
        }
    }
}
public class CircularQueueModulo {
    public static void main(String[] args) {
        CQueue cq=new CQueue (5);
        cq.deQueue();
        cq.enQueue(1);
        cq.enQueue(2);
        cq.enQueue(3);
        cq.enQueue(4);
        cq.enQueue(5);
        // Fails to enqueue because front == 0 && rear == SIZE - 1
        cq.enQueue(6);
        cq.display();
        int elem = cq.deQueue();
        if (elem != -1) {
            System.out.println("Deleted Element is " + elem);
        }
        cq.display();
        cq.enQueue(7);
        cq.display();
        // Fails to enqueue because front == rear + 1
        cq.enQueue(8);
    }
}

