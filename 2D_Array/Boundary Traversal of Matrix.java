/*
Boundary Traversal of Matrix
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a matrix A of dimensions n x m. The task is to perform boundary traversal on the matrix in clockwise manner.
Input
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase two lines of input. The first line contains dimensions of the matrix A, n and m. The second line contains n*m elements separated by spaces.

Constraints:
1 <= T <= 100
1 <= n, m <= 30
0 <= A[i][j] <= 100
Output
For each testcase, in a new line, print the boundary traversal of the matrix A.
Example
Input:
4
4 4
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
3 4
12 11 10 9 8 7 6 5 4 3 2 1
1 4
1 2 3 4
4 1
1 2 3 4

Output:
1 2 3 4 8 12 16 15 14 13 9 5
12 11 10 9 5 1 2 3 4 8
1 2 3 4
1 2 3 4

Explanation:
Testcase1: The matrix is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
The boundary traversal is 1 2 3 4 8 12 16 15 14 13 9 5
Testcase 2: Boundary Traversal will be 12 11 10 9 5 1 2 3 4 8.
Testcase 3: Boundary Traversal will be 1 2 3 4.
Testcase 4: Boundary Traversal will be 1 2 3 4.
*/

//code

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int tc=sc.nextInt();
	for(int t=0;t<tc;t++){
	int n=sc.nextInt();
	int m=sc.nextInt();
	int arr[][]=new int[n][m];
	for(int r=0;r<n;r++){
		for(int c=0;c<m;c++){
			arr[r][c]=sc.nextInt();
		}
	}
	if(m==1){
		for(int i=0;i<n;i++){
      System.out.print(arr[i][0]+" ");
		}
	}else if(n==1){
	for(int j=0;j<=m-1;j++){
	System.out.print(arr[0][j]+" ");
	}
	}else{
	for(int c=0;c<m;c++){
	System.out.print(arr[0][c]+" ");
	}
   	for(int r=1;r<n;r++){
	 System.out.print(arr[r][m-1]+" ");
	}
	for(int c=m-2;c>=0;c--){
	System.out.print(arr[n-1][c]+" ");
    }
	for(int r=n-2;r>0;r--){
	System.out.print(arr[r][0]+" ");
    }
	}
	System.out.println();
	}
	}
}
