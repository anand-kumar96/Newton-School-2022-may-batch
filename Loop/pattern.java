static void Pattern(int N){
System.out.println("*");
for(int i=1;i<=N-2;i++){
    System.out.print("*");
    for(int j=1;j<=i;j++){
   System.out.print("^");
    }
   System.out.print("*");
    System.out.println();
}
  for(int i=0;i<=N;i++){
    System.out.print("*");
}
}

/*
Pattern
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, you have to print the given below pattern for N >= 3.

Pattern for N = 4:-
*
*^*
*^^*
*****
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Pattern() that takes integers N as argument.

Constraints:-
1 <= N <= 100
Output
Print the given pattern for size N.
Example
Sample input:-
N = 3

Sample Output:-
*
*^*
****

Sample Input:-
N = 6

Sample Output:-
*
*^*
*^^*
*^^^*
*^^^^*
*******
*/
