package com.company.Newton_School.oops;
class Company{
    String name;
    int year;
    // this would be call while an object of that class is created.
   Company(){
    System.out.println("Constructor called");
}
}
public class DefaultConstructor {
    public static void main(String[] args) {

        // this would invoke (or call)default constructor.
        Company my=new Company();

        // Default constructor provides the default values to the object like 0, null
        System.out.println(my.name);
        System.out.println(my.year);

    }
}
