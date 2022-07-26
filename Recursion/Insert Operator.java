/*
Insert Operator
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a sequence of numbers of size N. You have to find if there is a way to insert + or - operator in between the numbers so that the result equals K.
Input
The first line of input contains two integers N and K. The next line of input contains N space- separated integers depicting the values of the sequence.

Constraints:-
1 <= N <= 20
-10^15 <= K <= 10^15
0 <= Numbers <=10^13
Output
Print YES if possible else print NO.
Example
Sample Input:-
4 4
1 2 3 4

Sample Output:-
YES

Sample Input:-
4 1
1 2 3 4

Sample Output:-
NO
*
/
//code

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  static boolean isPoss(long a[],int i,long sum,int n, long k){
    if(i==n)
    return sum==k;
    if(isPoss(a,i+1,sum+a[i],n,k) || isPoss(a,i+1,sum-a[i],n,k)){
    return true;
    }
    return false;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextLong();
        if(isPoss(a,0,0L,n,k))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
