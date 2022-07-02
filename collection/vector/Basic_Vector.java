package com.company.Newton_School.collection.vector;

import java.util.Vector;

public class Basic_Vector {
        public static void main(String[] args) {
            //ArrayList/vector----> array?
            // dynamic size  ----> static size
            Vector<Integer> list = new Vector<Integer>(); // size is not mandatory
            // Vector<Integer> List =new Vector<>(5);    //same
            // ClassName<datatype> object=new ClassName<datatype>();
            // Scanner sc=new Scanner(System.in);  //---> same as

            // to add element at the end --->  syntax: objectName.add(element)
            list.add(20);
            list.add(45);
            // to print complete list--->use  System.out.println(objectName);
            System.out.println(list);  // to print complete list--->use  System.out.println(objectName);


            // to add element at specific index or insert in middle --->  syntax: objectName.add(index,element)
            list.add(1,25);  // [20, 45]-->45 move right -->[20, 25 , 45]   ---> in array:arr[1]=25;
            list.add(2,28);  //[20, 25 , 45]-->45 move right -->[20, 25 , 28 , 45]

            // to print index store value in list--->use  System.out.println(objectName.get(index));
            System.out.println(list.get(2));

            // to set or modify the index value ---> syntax: objectName.set(index,value);
            list.set(0,92);    //---> [20, 25 , 28 , 45]-->20 is replace by 92 -->[92, 25 , 28 , 45]
            list.add(100);
            System.out.println(list);

            // size of Vector -->syntax:objectName.size();--> list.size(); ----> equivalent in array:  arr.length;
            for(int i=0;i<list.size();i++){
                System.out.print(i+" ");
            }
            System.out.println();
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");   // to get value
            }
            System.out.println();
            // How to check weather element is present of not --> syntax: objectName.indexOf(element)-->list.indexOf(40);
            // but in array we are using for loop and checking but in arraylist not need
            // if element present it will give that index else -1;
            System.out.println(list.indexOf(25));  // it will search and give  index: 1
            System.out.println(list.indexOf(200)); // it will search and give  index: -1

            //  How to remove or delete element in array list -->syntax:objectName.remove(index)-->list.remove(1);
            list.remove(1);   // previous arraylist was [92, 25, 28, 45, 100]--->it will remove 25.
            System.out.println(list);  // output [92, 28, 45, 100]
        }
    }

// arraylist increase size during adding element by 50% of size its arraylist size
// vector increase size during adding element by 50% of size its vector size
// so both are wasting extra space where array didn't do that


// TimeComplexity --> to add (means add function has) is O(1);becoz we are adding n element directly one by one element
// TimeComplexity -->to set (means set function has)is   O(n);becoz while doing set we are modifying by replacing the element (in worst case)



