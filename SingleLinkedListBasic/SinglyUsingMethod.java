package com.company.Newton_School.LinkedList;

import java.util.LinkedList;

public class SinglyUsingMethod {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<Integer>();
        // insertion
        ll.add(10);
        ll.add(20);
        ll.add(50);
        System.out.println(ll);
        ll.add(1,30);
        ll.add(2,40);
        System.out.println(ll);
        // deletion
        ll.remove(3);
        System.out.println(ll);
        Integer x=40;
        ll.remove(x);
        System.out.println(ll);
        System.out.println(ll.size());

    }
}
