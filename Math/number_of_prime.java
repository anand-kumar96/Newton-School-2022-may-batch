import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int n=1000;
    static boolean isprime[]=new boolean[n+1];
    public static void primesieve(){
        for(int i=0;i<=n;i++){
            isprime[i]=true;
        }
         isprime[0]= isprime[1]=false;
         int sqrt=(int)Math.sqrt(n);
         for(int i=0;i<=sqrt;i++){
             if(isprime[i]){
                 for(int j=i*i;j<=n;j=j+i){
                      isprime[j]=false;
                 }
             }
         }
    }
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int tc=sc.nextInt();
    primesieve();
    for(int t=0;t<tc;t++){
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<=n;i++){
            if(isprime[i]){
                count++;
            }

        }
        System.out.println(count);
    }
	}
}

/*

Number of Primes - Easy Version
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a number n. Your task is to print the number of prime numbers before that number.
Input
The first line of the number of test cases T.
Next T lines contains the value of N.

Constraints
1 <= T <= 100
1 <= N <= 1000
Output
Print the number of primes numbers before that number.
Example
Sample Input 1:
3
10
19
4

Sample Output 1:
4
8
2
*/
