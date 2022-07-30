package com.company.Newton_School.LinkedList;

class Student{
    // defining variable or blueprint of custom class
    String name;
    int rollno;
    // creating constructor to initialize value
    Student(String studName,int studRollNo){
        name=studName;
        rollno=studRollNo;
        System.out.println("Constructor is called when creating object");
    }
}
public class SimpleClass {
    public static void main(String[] args) {
        Student s1=new Student("Newton", 10);
        Student s2=new Student("ABCD", 101);
        System.out.println(s1.name+" "+s1.rollno);
        System.out.println(s2.name+" "+s2.rollno);
    }
}
