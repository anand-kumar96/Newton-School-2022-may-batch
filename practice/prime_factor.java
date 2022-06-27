package com.company.Newton_School.Basic_programming;
import java.util.Scanner;
public class prime_factors {
//    public static boolean isprime(int n) {
//        if(n<2){
//            return false;
//        }
//        if(n==2){
//            return true;
//        }
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int sqrt=(int)Math.sqrt(n);
//        for(int i=1;i<=sqrt;i++){
//            if(n%i==0){
//              if(isprime(i)) {
//                    System.out.println(i);
//                }
//                    if(n/i!=i){
//                        if(isprime(n/i)) {
//                            System.out.println(n / i);
//                        }
//
//                    }
//                }
//            }
//        }
//    }

// method 02
    static int n=100000;
    static boolean isprime[]=new boolean[n+1];
public static void primesieve() {
    for(int i=0;i<=n;i++){
        isprime[i]=true;
    }
    isprime[0]=isprime[1]=false;
    int sqrt=(int)Math.sqrt(n);
    for(int i=2;i<=sqrt;i++){
        if(isprime[i]){
            for(int j=i*i;j<=n;j=j+i){
                isprime[j]=false;
            }
        }
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sqrt=(int)Math.sqrt(n);
        primesieve();
        for(int i=1;i<=sqrt;i++){
            if(n%i==0){
                if(isprime[i]){
                    System.out.println(i);
                }
                if(n/i!=i){
                    if(isprime[n/i]) {
                        System.out.println(n / i);
                    }

                }
            }
        }
    }
}
