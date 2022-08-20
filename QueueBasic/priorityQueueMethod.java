package com.company.Newton_School.DSA2.Queue.PriorityQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueueMethod {
    public static void main(String[] args) {
        /*
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(); // by default min heap means increasing order i.e. start one is minimum
        // to insert
        pq1.add(10);
        pq1.add(1);
        pq1.add(20);
        pq1.add(2);
        pq1.add(0);
        pq1.add(25);

        // iterating queue

//  while(!pq1.isEmpty()){
//      System.out.println(pq1.poll());
//  }


//        int n= pq1.size();
//        for(int i=0;i<n;i++){
//            System.out.print(pq1.poll()+" "); // this method iterate but also remove all element
//        }    // 0 1 2 10 20 25

        System.out.println(pq1); //We will not get sorted elements by printing PriorityQueue.

// point:--->>I guess you expect PriorityQueue to return elements in particular order when you iterate it.
// However, PriorityQueue doesn't provide such a behaviour, because it's implemented as a priority heap rather than sorted list. From javadoc:
//The Iterator provided in method iterator() is not guaranteed to traverse the elements of the priority queue in any particular order.
// If you need ordered traversal, consider using Arrays.sort(pq.toArray()).

// important-->The only guarantee provided by PriorityQueue is that poll(), peek(), etc return the least element.
// If you need ordered iteration of elements, use some other collection such as TreeSet
        // use iterator

        Iterator iterator = pq1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // 0 1 20 10 2 25
        }
        System.out.println();

        // peek operation
        System.out.println(pq1.peek()); //0--> Printing the top element of PriorityQueue
        System.out.println(pq1.poll()); //0 remove top--> Printing the top element and removing top  from the PriorityQueue container..
        System.out.println(pq1.peek());// 1
        System.out.println(pq1);
        // remove element--> removing the top element
        pq1.remove();// 1
        pq1.remove(); // 2
        System.out.println(pq1);
*/



        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());// creating max heap means decreasing order
        pq2.add(20);
        pq2.add(2);
        pq2.add(0);
        pq2.add(5);
        pq2.add(30);
        pq2.add(8);
        pq2.add(12);

        System.out.println(pq2.peek());//30
        pq2.remove();// remove 30
        System.out.println(pq2.poll());//20

         // other way to print
//        Iterator iterator = pq1.iterator();
            Iterator iterator=pq2.iterator();
          int n=pq2.size();
        int arr[]=new int[n];
        int i=0;
        while (iterator.hasNext()) {
            arr[i++]= (int) iterator.next();  // important to typecast
        }
        for( i=0;i<n;i++){
            System.out.print(arr[i]+" "); //12 8 0 2 5
        }
//        System.out.println();
//
//                while(!pq2.isEmpty()){
//            System.out.print(pq2.poll()+" "); // 12 8 5 2 0  // in decreasing order but queue is empty
//        }


        // to sort pq & how to store in array
        System.out.println();
       Object [] arr1=pq2.toArray();
        Arrays.sort(arr1);
        for(i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

    }
}
