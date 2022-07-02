package com.company.Newton_School.collection.arrayList;

import java.util.ArrayList;
import java.util.Vector;

public class addingElemwnt {
    public static void main(String[] args) {

        // Case 1
        // Creating a default vector

        ArrayList al1 = new ArrayList ();

        // Adding custom elements using add() method
        al1.add(1);
        al1.add(2);
        al1.add("Anand");
        al1.add("Kumar");
        al1.add(3);
        // Printing the vector elements
        System.out.println("ArrayList al1 is : " + al1);
        // Case 2
        // Creating generic vector
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(32);
        al.add(45);
        al.add(32);
        al.add(97);
        al.add(65);
        System.out.println("Initial arraylist");
        System.out.print(al+" "); // iterating all element in list
        al.remove(0); //removing index element
        al.remove("32"); // remove first occurance of element
        System.out.println();
        System.out.println("after removing element in arraylist");
        System.out.print(al+" ");
        ArrayList<String>str=new ArrayList<String>();
        str.add("Anand");
        str.add("kumar");
        str.add("rajesh");
        System.out.println();
        System.out.println("initial arraylist string ");
        System.out.print(str+" ");
        str.remove(0);
        str.remove("Singh");
        System.out.println();
        System.out.println("after removing element in arraylist");
        System.out.print(str+" ");
    }
}
