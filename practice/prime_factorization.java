package com.company.Newton_School.Basic_programming;
import java.util.Scanner;
public class prime_factorization {
    public static void primeFactorization(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {  // to reduce number 
                    System.out.println(i);
                n = n / i;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primeFactorization(n);
    }
}


//tc: n*logn


   // method 02
    public static void primeFactorization(int n) {
        for (int i = 2; i <=(int)Math.sqrt(n); i++) {
            while (n % i == 0) {
                System.out.println(i); // here we are missing n so to handle it we write below code
                n = n / i;
            }
        }
        if (n>2){ // important --> if  n is prime thn we print n..
            // logic bihind it is if n is non prime then after n=n/i it gives 1 but if n is prime thn it will give >2.
            System.out.println(n);
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primeFactorization(n);
    }
}
//tc= sqrt n*lonn;
