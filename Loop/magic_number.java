/*Problem Statement
A magic number is a natural number that contains both the digits 7 and 9 in it. For eg:- 79, 879, 53729 etc.
Given a number N, your task is to find the closest Magic number from the given number N.
Note:- If more than one answer exists return the minimum one
Input
User Task:
Since this will be a functional problem, you don't have to take input.
You just have to complete the function MagicNumber() that takes integer N as argument.
Constraints:-
1 <= N <= 100000
Output
Return a magic number closest to the given number N.
Example
Sample Input:-
8
Sample Output:-
79
Sample Input:-
900
Sample Output:-
897

 */
package com.company.Newton_School;
import java.util.Scanner;
public class magic_number {

// method 01
/*
public static boolean checkSevenNine(int N) {
boolean Seven = false;
boolean Nine = false;
while (N > 0) {
if (N % 10 == 7) {
Seven = true;
}
if (N % 10 == 9) {
Nine = true;
}
N = N / 10;
}
if (Seven ==true && Nine==true) {
return true;
}
return false;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int i;
for ( i = 0; i < Integer.MAX_VALUE; i++) {
if (checkSevenNine(N - i) == true || checkSevenNine(N + i) == true) {
break;
} else continue;
}
if (checkSevenNine(N - i) == true) {
System.out.println(N - i);
}
if (checkSevenNine(N + i) == true) {
 System.out.println(N + i);
}
}
}


*/
// 2nd method
static boolean isSevenNinePresent(int N){
boolean seven=false; // initializing and defining variable seven and nine as boolean as taking 0 mean false
boolean nine =false;
while(N>0){
if(N%10==7){
seven=true;
}else if(N%10==9){
nine=true;
}
N=N/10;
}
if (seven==true && nine ==true){
return true;
}
return false;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int i=0;
while(isSevenNinePresent(N-i)==false && isSevenNinePresent(N+i)==false){
i++;
}
if(isSevenNinePresent(N-i)==true){
System.out.println(N-i);
}
System.out.println(N+i);
}
}

// class solution
    /*
static int MagicNumber(int N){
    int i=0;
    while(isSevenNinePresent(N-i)==false && isSevenNinePresent(N+i)==false){
        i++;
    }
    if(isSevenNinePresent(N-i)==true){
        return N-i;
    }
    return N+i;
}
    static boolean isSevenNinePresent(int N){
        boolean seven=false;
        boolean nine =false;
        while(N>0){
            if(N%10==7){
                seven=true;
            }else if(N%10==9){
                nine=true;
            }
            N=N/10;
        }
        if(seven==true && nine ==true){
            return true;
        }
        return false;
    }


     */