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
