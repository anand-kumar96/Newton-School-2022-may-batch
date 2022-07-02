package com.company.Newton_School.collection.arrayList;

import java.util.ArrayList;

public class removingElement {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(32);
        al.add(45);
        al.add(52);
        al.add(97);
        al.add(65);
        al.add(5,92);
        // al.add(8,2); --> it throw IndexOutOfBoundsException becoz our size is 6 ( 6,7 are empty so we cannot add element in 8)
        System.out.println(al.get(5)); // iterating specific index element
        System.out.print(al+" ");   // iterating all element in list
        System.out.println();
        ArrayList<String>str=new ArrayList<String>();
        str.add("Anand");
        str.add("kumar");
        System.out.print(str+" ");
    }
}
