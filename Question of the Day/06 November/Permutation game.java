import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    	public static int allNumbers(int[] A, int n){
		int res=0;
		for(int i=0; i<n-1; i++){
			int inv=0;
			for(int j=i+1; j<n; j++){
				if(A[i] > A[j])
				inv++;
			}
			res += inv;
			res *= (n-i-1);
		}
		return res;
	}
      public static void main (String[] args) {
         Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int[] A=new int[n];
		 int[] B=new int[n];

		 for(int i=0; i<n;i++){
			 A[i]=sc.nextInt();
		 }
		 for(int i=0; i<n;i++){
			 B[i]=sc.nextInt();
		 }
		 int ans=allNumbers(A,n)-allNumbers(B,n);
		 System.out.println(Math.abs(ans));
	}
}

/*
Permutation game
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob has two permutations, A and B, of size N.
Let's say
x = lexicographically smallest order of the permutation A.
y = lexicographically smallest order of the permutation B.

Then he wants to find |x- y|. As he is busy, so he wants you to help him.

Notes
For two sequences X and Y, X is said to be lexicographically smaller than Y if and only if there exists an integer k such that Xi = Yi (1≤i<k) and Xk < Yk.
Input
The first line contains a single integer N.
The second line contains N integers A1, A2 ... AN.
The third line contains N integers B1, B2 ... BN.

Constraints
2≤N≤8
A and B are permutations of size N.
Output
Print ∣x−y∣.
Example
Sample Input 1
3
1 3 2
3 1 2

Sample Output 1
3
There are 6 permutations of size 3: (1, 2, 3), (1, 3, 2), (2, 1, 3), (2, 3, 1), (3, 1, 2), and (3, 2, 1). Among them, (1, 3, 2) and (3, 1, 2) come 2- nd and 5- th in lexicographical order, so the answer is ∣2−5∣=3.

Sample Input 2
8
7 3 5 4 2 1 6 8
3 8 2 5 4 6 7 1

Sample Output 2
17517

Sample Input 3
3
1 2 3
1 2 3

Sample Output 3
0
*/
