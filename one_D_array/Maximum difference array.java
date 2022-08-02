/*
Maximum difference array
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of integers of size N, your task is to find the maximum parity index of this array.
Parity Index is the maximum difference between two indices i and j (1 <= i <= j <= N) of an array A such that Ai < Aj.
Input
First line of contains a single integer N, next line contains N space separated integers depicting the values of array.

Constraints:-
1 < = N < = 100000
1 < = Arr[i] < = 100000
Output
Print the maximum value of j- i under the given condition, if no pair satisfies the condition print -1.
Example
Sample Input:-
5
1 2 3 4 5

Sample Output:-
4

Explanation:
The maximum difference of jth - ith index is 4:(4th - 0th), also arr[4] > arr[0]


Sample Input:-
5
5 4 3 2 1

Sample Output:-
-1
*/
// brute force

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int ans=-1;
  int max=0;
    for(int i=0;i<n-1;i++){
     for(int j=i+1;j<n;j++){
       if(arr[j]>arr[i]){
           max=j-i;
           ans=Math.max(ans,max);
       }
     }

    }
    System.out.println(ans);
    }
}

// optimized apparoach
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int maxdiff=Integer.MIN_VALUE;
    int num[]=new int[n];
    num[n-1]=arr[n-1];
    for(int i=n-2;i>=0;i--){
        num[i]=Math.max(arr[i],num[i+1]);
    }
        for(int i=0,j=0; i<n &&j<n;){
            if(arr[i]<num[j]){
                int diff=j-i;
            if(diff>maxdiff){
                maxdiff=diff;
                }
                j++;
            }else 
            i++;
        }
        System.out.println(maxdiff);
    }
}
