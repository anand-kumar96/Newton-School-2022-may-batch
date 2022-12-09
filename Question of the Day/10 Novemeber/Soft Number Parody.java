import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
   Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    int p=0;
	for(int i=1; i<n; i++){
		int num=i *(i+1);
		if(num>n)
		break;
		int ans=(int)Math.sqrt(2*n - num);
		ans=ans * (ans + 1);
		if(ans ==2*n - num){
			p=1;
		}
	}
    if(p==0){
	System.out.println("NO");
    }else{
        System.out.println("YES");
    }
}
}
/*
Soft Number Parody
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
An integer A is defined to be a soft integer if it can be represented as K*(K+1)/2 where K is some positive integer. Given an integer N, find if it can be represented as the sum of two soft numbers (not necessarily distinct).
Input
The first and the only line of input contains a single integer N.

Constraints:
1 <= N <= 109
Output
If the given integer can be represented as the sum of two soft integers, print "YES", else print "NO", without the quotes.
Example
Sample Input:
16

Sample Output:
YES

Explaination:
16 = 10 + 6
Both 10 and 6 are soft numbers:
10 = 4*(4+1)/2
6 = 3*(3+1)/2
*/
