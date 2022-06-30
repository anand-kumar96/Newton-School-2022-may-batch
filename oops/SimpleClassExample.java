package com.company.Newton_School.oops;
class Student{
    String name;  // blue print or properties of class Student
    int age;
    char gender;
    double percentage;
    int rollNo;
}
public class SimpleClassExample {
    public static void main(String[] args) {
        Student s1=new Student(); // instatiating a new Student object s1
        Student s2=new Student();
        // setting attributes for s1
        s1.name="Anand";
        s1.age=24;
        s1.gender='M';
        s1.percentage=89.1;
        s1.rollNo=1;
        // setting attributes for s2
        s2.name="Rashmi";
        s2.age=23;
        s2.gender='F';
        s2.percentage=79.1;
        s2.rollNo=2;
        String s=s1.name; // we can also store it in new data type and can print
        System.out.print("detail of student s1 is : " +" ");
        System.out.print(s1.name+" ");
        System.out.print(s1.age+" ");
        System.out.print(s1.gender+" ");
        System.out.print(s1.percentage+" ");
        System.out.println(s1.rollNo+" ");
        System.out.print("detail of student s2 is : " +" ");
        System.out.print(s2.name+" ");
        System.out.print(s2.age+" ");
        System.out.print(s2.gender+" ");
        System.out.print(s2.percentage+" ");
        System.out.println(s2.rollNo+" ");
        System.out.println(s);// print name by storing
    }
}
