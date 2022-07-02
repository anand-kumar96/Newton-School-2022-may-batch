package com.company.Newton_School.collection.vector;

import java.util.Vector;

public class removingElement {
    public static void main(String[] arg)
    {

        Vector<Integer> v2 = new Vector<Integer>();

        // Adding custom element using add() method
        v2.add(1);
        v2.add(45);
        v2.add(3);
        // Printing the vector elements
        System.out.println("Vector v2 is " + v2);
        v2.remove(1);
        v2.remove("32"); // since 32  not present so not remove
        v2.remove("45");

        System.out.println("after removing element  v2 vector is : "+v2);
        System.out.println(v2.remove("32")); // it will give false
    }
}
