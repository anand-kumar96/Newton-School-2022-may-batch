package com.company.Newton_School.Basic_programming.math;
import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // method 01

//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int gcd=0;
//        for(int i=1;i<=a && i<=b;i++){
//            if(a%i==0 && b%i==0){
//                gcd=i;
//            }
//        }
//        System.out.println(gcd);

        // tc=min O(a,b)




        // method 02

        /*
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=0;
        int min=Math.min(a,b);
          for(int i=min;i>0;i--){
              if(b%i==0 && a%i==0){
                  gcd=i;
                  break;
              }

              // or
//        for(int i=1;i<=min;i++){
//            if(b%i==0 && a%i==0){
//                gcd=i;
//            }
        }
        System.out.println(gcd);


         */

        // tc=min O(a,b)




        //method 03

//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        while(a!=b)
//        {
//            if(a>b)
//                a=a-b;
//            else
//                b=b-a;
//        }
//        System.out.println(b);




        // method 04 recursive

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int g = gcd(a, b);
//        System.out.println(g);
//
//    }
//
//    public static int gcd(int a, int b) {
//        if (b == 0)
//            return a;
//
//        return gcd(b, a % b);
//
//    }
//}




        // method 05 iterative

        int a=sc.nextInt();
        int b = sc.nextInt();
        int gcd=0;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        gcd=a;
        System.out.println(gcd);
    }
}


