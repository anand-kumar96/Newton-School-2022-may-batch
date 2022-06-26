import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int tc = sc.nextInt();
 for (int t = 0; t < tc; t++) {
 int n = sc.nextInt();
 int count=0;
  int sqrt = (int) Math.sqrt(n);
for (int i = 1; i <= sqrt; i++){
	if(n%i==0){
	if(i%2==0){
		count++;
		}
	if(i*i!=n){
	if((n/i)%2==0){
		count++;
		}
	}
	}
}
 System.out.println(count);
	}
	}
}

/*
Divisors Of N
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, the task is to find the number of divisors of N which are divisible by 2.
Input
The input line contains T, denoting the number of testcases. First line of each testcase contains integer N

Constraints:
1 <= T <= 50
1 <= N <= 10^9
Output
For each testcase in new line, you need to print the number of divisors of N which are exactly divisble by 2
Example
Input:
2
9
8

Output
0
3

*/
