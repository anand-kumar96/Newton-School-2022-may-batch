package com.company.Newton_School.collection.arrayList;

import java.util.ArrayList;

public class changingElement {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(32);
        al.add(45);
        al.add(52);
        al.add(97);
        al.add(65);
        System.out.println("Initial arraylist");   // iterating all element in list
        System.out.print(al+" ");
        al.set(0,65);
        al.set(2,98);
        System.out.println();
        System.out.println("after arraylist");
        System.out.print(al+" ");
        ArrayList<String>str=new ArrayList<String>();
        str.add("Anand");
        str.add("kumar");
        System.out.println();
        System.out.println("initial arraylist string ");
        System.out.print(str+" ");
        str.set(0,"Aryan");
        str.set(1,"Singh");
        System.out.println();
        System.out.println("after changing arraylist");
        System.out.print(str+" ");
    }
}
