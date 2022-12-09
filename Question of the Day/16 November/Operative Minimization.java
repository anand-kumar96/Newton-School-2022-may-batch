import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long k=sc.nextLong();
    long A=1;
    for(int i=0;i<n;i++){
       if(2*A<=(A+k)){
           A=2*A;
       }else{
           A=A+k;
       }
    }
    System.out.println(A);
    }
}

/*
Operative Minimization
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given two integer N and K. Initially you have an integer A = 1 with you. In one move you can do perform one of the following operations to A:

Replace A by 2*A.

Add K to A.


What is the minimum possible value of A after exactly N operations?
Input
The first line of the input contains two integer N and K.

Constraints:
1 <= N <= 105
1 <= K <= 109
Output
Print the minimum possible value of A after exactly N operations.
Example
Sample Input:
4 3

Sample Output:
10

Explaination:
We perform the moves like this:
1 -> 2 (double)
2 -> 4 (double)
4 -> 7 (add)
7 -> 10 (add)
*/
