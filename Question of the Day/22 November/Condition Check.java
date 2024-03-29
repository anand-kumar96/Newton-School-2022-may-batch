import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         long[] A=new long[n];
         long[] B=new long[n];
         for(int i=0; i<n; i++){
          A[i]=sc.nextInt();
         }
         long ans=0;
         for(int i=0; i<n; i++){
             B[i]=sc.nextInt();
             ans +=A[i] * B[i];
         }
         System.out.println(ans==0 ? "Yes" : "No");
    }
}

/*
Condition Check
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Two arrays of size N are given, A and B.
Determine whether the sum of Ai*Bi for all i such that (1<=i<=N).
Input
The first line contains one integer N.
The second line contains N integers A1, A2 ... AN.
The third line contains N integers B1, B2 ... BN.

Constraints
1≤N≤100000
100≤Ai≤100
100≤Bi ≤100
All values in input are integers.
Output
If the inner product of A and B is 0, print Yes; otherwise, print No.
Example
Sample Input 1
2
-3 6
4 2

Sample Output 1
Yes
The inner product of A and B is (−3)×4+6×2=0.

Sample Input 2
2
4 5
-1 -3

Sample Output 2
No
The inner product of A and B is 4×(−1)+5×(−3)=−19.

Sample Input 3
3
1 3 5
3 -6 3

Sample Output 3
Yes
The inner product of A and B is 1×3+3×(−6)+5×3=0.
*/
