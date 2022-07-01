package com.company.Newton_School.oops;
class Mobile2 {

// ---> accessing protected  access modiofier from differnt class within same package
    protected void ring() {
        System.out.println("mobile ringing");
    }
    }
public class protectedAccessModifier {
    public static void main(String[] args) {
        Mobile2 redmi=new Mobile2();
        //  redmi.ring(); // throwing error
        redmi.ring();
    }
}