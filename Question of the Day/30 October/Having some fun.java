import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int exact_k_nonZero_digits(String s, int n, int k) {
    int dp[][][] = new int[n+1][2][k+1];
    for(int i=0; i<=n; i++)
    for(int j=0; j<2; j++)
    for(int x=0; x<=k;x++)    
    dp[i][j][x] = 0;
    dp[0][0][0] = 1;
    for(int i=0; i<n;i++){
    int sum=0;
    while(sum < 2){
    for(int j=0; j<k+1; ++j){
    int x=0;
                    
    while(x <= (sum != 0? 9 :s.charAt(i) - '0')){
    if(j + (x > 0 ? 1 : 0) < k+1){
    dp[i+1][(sum !=0 || x <(s.charAt(i) - '0')) ? 1 : 0 ][j + (x > 0 ? 1 : 0)] +=dp[i][sum][j];
    }
    ++x;
    }
    }       
    ++sum;
    }
    }   
    return dp[n][0][k] + dp[n][1][k];
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int k=sc.nextInt();
	int n=s.length();
	System.out.println(exact_k_nonZero_digits(s,n,k));
    }
}

/*
Having some fun
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Shrey loves to play with numbers. So he has two integers N and K and wants to find number of integers between 1 and N (inclusive). But he wants only those integers that contains exactly K non- zero digits when written in base ten.
Input
The first line contains a single integer N. The second line contains a single integer K.

Constraints
1 ≤ N < 10^100
1 ≤ K ≤3
Output
Print the count.
Example
Sample Input 1:
100
1

Sample Output 1:
19

Sample Input 2:
25
2

Sample Output 2:
14

Sample Input 3:
9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999
3

Sample Output 3:
117879300
*/
