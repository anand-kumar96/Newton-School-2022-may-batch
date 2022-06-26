import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static int n=100000;  // gloabal variable range of i and range
	static boolean isprime[]=new boolean[n+1]; // creating global array
	public static void primesieve(){ // creating funcion
	for(int i=0;i<=n;i++){
		isprime[i]=true;
	}
     isprime[0]=isprime[1]=false;
	 int sqrt=(int)Math.sqrt(n);
	 for(int i=0;i<=sqrt;i++){
       if (isprime[i]){
		   for(int j=i*i;j<=n;j=j+i){
			   isprime[j]=false;
		   }
	   }
	 }
	}
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int tc=sc.nextInt();
	primesieve();// calling function.. it check all value till 100000 which is prime
	for(int t=0;t<tc;t++){
		int l=sc.nextInt();
		int r=sc.nextInt();
		int sum=0;
		for(int i=l;i<=r;i++){
			if(i>=10 && isprime[i]){
            sum=sum+((i/10)%10);
			}
		}
	   System.out.println(sum);
	}
		
	}
}


/*
Prime Sum
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a range from l to r, Your task is to find the sum of the second last digit of the prime numbers between that range.
Input
The first line of the input contains the T test cases.
Next T lines contains the range value l and r.

Constraints
1 <= T <= 100
1 <= l < r <= 1e5
Difference between l and r dosen't exceed 1e4.
Output
Print the required sum.
Example
Sample Input 1:
3
2 15
1 20
3 10

Sample Output 1:
2
4
0

*/
