import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       long arr[]=new long[200];
       long ans=0;
       for(int i=0; i<n; i++){
           int input=sc.nextInt();
           ans = ans + arr[input % 200]++;
       }
       System.out.println(ans);
    }
}

/*
Number 200
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob's friend gave him a gift on which integer 200 has been written.

He has an array B of size N.
He wants to find the pair of integers (i, j) - (1 ≤i < j ≤ N) such that their difference (Bi - Bj) is a multiple of 200.
Input
The first line contains one integer, N.
The second line contains N integers B1, B2 ... BN.

Constraints
All values in the input are integers.
2 ≤ N ≤ 2×105
1 ≤ Bi ≤ 109
Output
Print the answer as an integer.
Example
Sample Input 1
6
123 223 123 523 200 2000

Sample Output 1
4
For example, for (i, j)=(1, 3), B1−B3=0 is a multiple of 200.
We have four pairs satisfying the conditions: (i, j)=(1, 3), (1, 4), (3, 4), (5, 6).

Sample Input 2
5
1 2 3 4 5

Sample Output 2
0
There may be no pair satisfying the conditions.

Sample Input 3
8
199 100 200 400 300 500 600 200

Sample Output 3
9
*/
