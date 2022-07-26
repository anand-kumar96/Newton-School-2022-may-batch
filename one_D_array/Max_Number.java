/*
Max numbers
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of size N, you need to find its maximum, 2nd maximum and 3rd maximum element.

Try solving it in O(N) per test case
Input
The first line of the input contains the number of test cases T.

For each test case, the first line of the input contains an integer N denoting the number of elements in the array A.
The next line contains N (space separated) elements of A.


Constraints:
1 <= T <= 100
3 <= N <= 10^6
1 <= A[i] <= 10^9

Note:-It is guaranteed that the sum of N over all text cases does not exceed 10^6
Output
For each test case, output the first, second and third maximum elements in the array.
Example
Sample Input:
3
5
1 4 2 4 5
6
1 3 5 7 9 8
7
11 22 33 44 55 66 77

Sample Output:
5 4 4
9 8 7
77 66 55

Explanation(might now be the optimal solution):
Testcase 1:
[1 4 2 4 5]
First max = 5
Second max = 4
Third max = 4
*/
// code
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int tc=Integer.parseInt(sc.nextLine());
	for(int t=0;t<tc;t++){
	int n=Integer.parseInt(sc.nextLine());
	String num[]=sc.nextLine().split(" ");
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=Integer.parseInt(num[i]);
	}
	int firstidx=0,secondidx=0,thirdidx=0;
	int firstvalue=0,secondvalue=0,thirdvalue=0;
	int max=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
       if(arr[i]>max){
		   max=arr[i];
		   firstidx=i;
	   }
	  }
	  max=Integer.MIN_VALUE;
     firstvalue=arr[firstidx];
	 arr[firstidx]=-1;

	 for(int i=0;i<n;i++){
       if(arr[i]>max){
		   max=arr[i];
		   secondidx=i;
	   }
	  }
	 max=Integer.MIN_VALUE;
     secondvalue=arr[secondidx];
	 arr[secondidx]=-1;
     for(int i=0;i<n;i++){
       if(arr[i]>max){
		   max=arr[i];
		   thirdidx=i;
	   }
	  }
     thirdvalue=arr[thirdidx];
	 arr[thirdidx]=-1;
	 System.out.println( firstvalue+" "+secondvalue+" "+thirdvalue);
	}
    }
}
