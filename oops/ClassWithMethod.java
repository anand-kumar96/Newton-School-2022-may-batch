package com.company.Newton_School.oops;
class Car {
    int seat;
    String brand;
    String model;

    // creating function or method void type under class
    void carseat() {
        System.out.println("car seat is:" + seat);
    }
    // creating function or method return type under class
    String carmodel(){
        return model;
    }
}

public class ClassWithMethod {

    public static void main(String[] args) {
        Car bmw=new Car();
        bmw.seat=6;
        bmw.brand="BMW";
        bmw.model="25";
        System.out.println("seat no is: " +bmw.seat);
        bmw.carseat();
        String modelno=bmw.carmodel();
        System.out.println("car model no:"+modelno);
    }
}
