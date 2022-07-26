/*
Maximum and Minimum in an Array
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A[ ] of size N containing positive integers, find maximum and minimum elements from the array.
Input
The first line of input contains an integer T, denoting the number of testcases. The description of T testcases follows. The first line of each testcase contains a single integer N denoting the size of array. The second line contains N space-separated integers denoting the elements of the array.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= A[i] <= 10^7
Output
For each testcase you need to print the maximum and minimum element found separated by space.
Example
Sample Input:
2
5
7 3 4 5 6
4
1 2 3 4

Sample Output:
7 3
4 1
*/
// code
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
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i]<min){
				min=arr[i];
			}
			if(arr[i]>max){
				max=arr[i];
			}
	}
	System.out.println(max+" "+min);

	}
    }
}
