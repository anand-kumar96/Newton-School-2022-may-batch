package com.company.Newton_School.Basic_programming.math;
import java.util.Scanner;

// case 01-02
//public class scanner_test {
//    public static void f(){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        System.out.println(a);
//
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        System.out.println(a);
//        f();
//    }
//}

// case 03-04
//public class scanner_test {
//    public static void f(){
//        Scanner sc=new Scanner(System.in);
//        String a=sc.nextLine();
//        System.out.println(a);
//
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        System.out.println(a);
//        f();
//    }
//}

//case 5-6
//public class scanner_test {
//    public static void f(){
//        Scanner sc=new Scanner(System.in);
//        String a=sc.nextLine();
//        System.out.println(a);
//
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String a=sc.nextLine();
//        System.out.println(a);
//        f();
//    }
//}
// case 7-8 without creating new scanner --> pass Scanner in function with variable name and call function by variable
// method 02 important
public class scanner_test {
    public static void f(Scanner sc){
        String a=sc.nextLine();
        System.out.println(a);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(a);
        f(sc);
    }
}




 // discussion
/*
case 1:
if inuput is 10 20
 thn output-->10
 becoz scanner always looking for new line

case 2:
if inuput is 10 , output-->10
again input 20-->output -->20

case 3: using nexLine and nextInt
if inuput is 10 20
 thn output-->10
 case 4:
if inuput is 10 , output-->10
again input 10 20-->output -->10 20

case 5: using nexLine && nexLine
if inuput is 10 20
 thn output-->10 20
 case 6:
if inuput is 10 20 , output-->10 20
again input 10 20-->output -->10 20
 */
