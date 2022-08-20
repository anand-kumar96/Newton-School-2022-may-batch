package com.company.Newton_School.DSA2.Queue.PriorityQueue;
// decreasing order
class priorityQueues {
    int[] arr;
    int nItems;
    int size;

    priorityQueues(int sz) {
        size = sz;
        arr = new int[sz];
        nItems = 0; // tracking current number of element
    }

    public void enqueue(int val) {
        int i;
        if (nItems == 0) {
            arr[0] = val;
            nItems++;
            return;
        }
        for (i = nItems - 1; i >= 0; i--) {
            if (val > arr[i]) {
                arr[i + 1] = arr[i];
            } else
                break;

        }
        arr[i + 1] = val;
        nItems++;
    }

    public void display() {
        if (nItems == 0) {
            System.out.println("Queue is empty");
        }else {
            for (int i = 0; i < nItems; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public int dequeue() {
        int value = 0;
        if (nItems == 0) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            value = arr[nItems-1];
            nItems--;
        }
        return value;
    }

    public boolean isFull() {
        return (nItems == size); // return boolean ans
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public int peek() {
        int element = 0;
        if (nItems == 0) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = arr[0];
        }
        return element;
    }
}
public class priorityQueueUsingArray {
    public static void main(String[] args) {
        priorityQueues pq=new priorityQueues(5);
        pq.enqueue(10);
        pq.enqueue(20);
        pq.enqueue(5);
        pq.enqueue(15);
        pq.enqueue(9);
        pq.display(); // 20 15 10 9 5
        System.out.println(pq.isFull()); // true
        System.out.println(pq.isEmpty());//false
        pq.dequeue();//5
        pq.display();
        pq.dequeue();//9
        System.out.println(pq.isEmpty());//false
        pq.display();
        System.out.println(pq.peek());//20
        pq.dequeue();//10
        pq.enqueue(1);
        pq.dequeue();//1
        pq.display();

    }
}

