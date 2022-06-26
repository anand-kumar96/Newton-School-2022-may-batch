import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int m=sc.nextInt();
     int count=0;
     for(int i=n;i<=m;i++){
         if(check_prime(i)==1){
             count++;
         }
     }
     System.out.println(count);
	}
// in question said that donot close main
  
  /*
  Functions- prime
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two integers N and M, your task is to print the number of primes present between N and M (both included).

Note:- You have already provided a function that will check if the given number is prime or not. To use the given function you need to call check_prime(x) where x is the number you want to check. If the given number is prime the function will return 1 else it returns 0.

Note:- Do not close your main class.
Input
The input contains two space- separated integers depicting the values of N and M.

Constraints:-
1 <= N <= M <= 10000
Output
Print the count of prime numbers in the given range.
Example
Sample Input:-
1 10

Sample Output:-
4

Sample Input:-
8 10

Sample Output:-
0

*/
