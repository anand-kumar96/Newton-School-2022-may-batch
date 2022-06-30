package com.company.Newton_School.oops;
class Company2 {
    // data members of the class or blueprint of class(in this case without blue print also work
    String name;
    int year;
    long cash;
    // constructor with one argument
    Company2(String name){
        System.out.println("company name is: "+name);

    }
    // constructor with two argument
    Company2(String name, int year){
        System.out.print("company name is:" +name);
        System.out.println("    and company established year is:"+year);
    }
    // constructor with one argument type long
    Company2(Long cash){
        System.out.println("company value is:" +cash);
    }
}
public class constructorOverloading {
    public static void main(String[] args) {
        Company2 my1=new Company2("Shanvi");
        Company2 my2=new Company2("Shanvi",2020);
        Company2 my3=new Company2(12548675L);
    }
}
