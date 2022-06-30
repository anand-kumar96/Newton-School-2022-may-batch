package com.company.Newton_School.oops;
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){ // creating void type function
        System.out.println("My id is : " + id);
        System.out.println("and my name is : "+ name);
    }

    public int getSalary(){   // creating return type function
        return salary;
    }
}
public class ClassExample {
    public static void main(String[] args) {
        Employee anand = new Employee(); // Instantiating a new Employee Object
        Employee rajan = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        anand.id = 12;
        anand.salary = 34;
        anand.name = " Anand Kumar ";

        // Setting Attributes for John
        rajan.id = 17;
        rajan.salary = 12;
        rajan.name = "Rajan Singh";

        // Printing the Attributes
        anand.printDetails(); // calling function
        rajan.printDetails();//// calling function
        int income = rajan.getSalary(); // storing return value in income
        System.out.println("get salary is: "+income); // here salary return

        // System.out.println(anand.id);
        // System.out.println(anand.name);
    }
}

