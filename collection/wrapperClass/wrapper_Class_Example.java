package com.company.Newton_School.collection.wrapperClass;

public class wrapper_Class_Example {
    public static void main(String[] args) {
        //accessing value using primitive data type
        int a=10;
        double d=20.36;
        String str="Anand";
        char alpha='A';
        //accessing value using wrapper class
        Integer aa=a; // taking data type value in wrapper
        Integer ab=20; // taking new value in wrapper
        String name=str;
        Integer num=new Integer(25); // object oriented class
        String names=new String("kumar");
    //  Classname(data type) variable= new Classname(value);
        System.out.println(aa);
        System.out.println(ab);
        System.out.println(num);
        System.out.println(name);
        System.out.println(names);
    }
}
