package com.company.Newton_School.DSA2.LinkedList;
class NodeCll{
    int value;
    NodeCll next;
    NodeCll(int val){
        value=val;
    }
}
public class CircularLL {
    // Insertion in an empty list

    static NodeCll addToEmpty(NodeCll last, int data){
        // This function is only for empty list
        if (last != null)
            return last;
        // Creating a node dynamically.
        NodeCll temp = new NodeCll( data);
//        // Assigning the data
//        temp.value = data;
        last = temp;
        // Note : list was empty. We link single node
        // to itself.
        temp.next = last;

        return last;
    }



    // Insertion at the beginning of the list
   public static NodeCll addBegin(NodeCll last, int data) {
        if (last == null) {
            return addToEmpty(last, data);
        }
        // Creating a node dynamically
        NodeCll  temp = new NodeCll(data);
        // Adjusting the links
        temp.next = last.next;
        last.next = temp;
        return last;
    }



    // Insertion at the end of the list
    public static NodeCll addEnd(NodeCll last, int data){
        if (last == null) {
            return addToEmpty(last, data);
        }
// Creating a node dynamically.
        NodeCll temp = new NodeCll(data);
// Adjusting the links.
        temp.next = last.next;
        last.next = temp;
        last = temp;
        return last;
    }




    // Insertion in between the nodes--> insert data after given item

    public  static NodeCll addAfter(NodeCll last, int data, int item) {
        if (last == null)
            return null;
        NodeCll temp , p;
        p = last.next;
        do {
            // if the item is found, place temp  after it
            if (p.value == item) {
                temp = new NodeCll(data);
                // make the next of the current node as the next of temp
                temp .next = p.next;
                // put temp  to the next of p
                p.next = temp ;
                // if p is the last node, make temp  as the last node
                if (p == last)
                    last = temp;
                return last;
            }
            p = p.next;
        } while (p != last.next);
        System.out.println(item + "The given node is not present in the list");
        return last;
    }




    // delete a node
    static NodeCll deleteNode(NodeCll last, int key) {
        // if linked list is empty
        if (last == null)
            return null;
        // if the list contains only a single node
        if (last.value == key && last.next == last) {
            last = null;
            return last;
        }

        NodeCll temp = last;

        // if last is to be deleted
        if (last.value == key) {
            // find the node before the last node
            while (temp.next != last) {
                temp = temp.next;
            }

            // point temp node to the next of last i.e. first node
            temp.next = last.next;
            last = temp.next;
        }

        // travel to the node to be deleted
        while (temp.next != last && temp.next.value != key) {
            temp = temp.next;
        }
        NodeCll d = new NodeCll(key);
        // if node to be deleted was found
        if (temp.next.value == key) {
            d= temp.next;
            temp.next = d.next;
        }
        return last;
    }




    public  static void traverse(NodeCll last){
        // If list is empty, return.
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        // Pointing to first Node of the list.
        NodeCll run = last.next;
        // Traversing the list.
        do
        {
            System.out.print(run.value + " ");
            run = run.next;
        }
        while(run!= last.next);
        System.out.println();
    }




    public static void main(String[] args) {
        NodeCll last = null;
        traverse(last);
        last = addToEmpty(last, 6);
        traverse(last);
        last = addBegin(last, 4);
        last = addBegin(last, 2);
        traverse(last);
        last = addEnd(last, 8);
        last = addEnd(last, 12);
        traverse(last);
        last = addAfter(last, 10, 8);
        traverse(last);
        deleteNode(last, 8);
        traverse(last);
    }
}
