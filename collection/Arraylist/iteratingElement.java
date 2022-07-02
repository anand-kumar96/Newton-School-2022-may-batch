package com.company.Newton_School.collection.arrayList;
import java.util.ArrayList;
public class iteratingElement {
    public static void main(String args[])
    {
        // Creating an Arraylist of string type
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to ArrayList
        //  using standard add() method
        al.add("Anand");
        al.add("Kumar");
        al.add(1, "Singh");

        // Using the Get method and the
        // for loop
        for (int i = 0; i < al.size(); i++) {

            System.out.print(al.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : al)  // storing all value in str variable
            System.out.print(str + " ");
    }
}
