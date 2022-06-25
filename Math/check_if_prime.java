import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static boolean isPrime(long n){
if(n <= 1){
return false;
} 
long sqrt_n = (long)Math.sqrt(n); 						
for(long i = 2; i <= sqrt_n; i++){										
	if(n % i == 0){										
	return false;
	}
	}
	return true;
	}
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int testcases = sc.nextInt();
while(testcases > 0){
long n = sc.nextLong();
if(isPrime(n)){
	System.out.println("Yes");
}														
else{																	
	System.out.println("No");																					
	}																	
	testcases--;																									}
	}
}
// mehod 02

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Checkifprime {
    static public boolean isPrimeSqrt(int n) {
        if (n < 2) return false;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {//7%6==1
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            if (isPrimeSqrt(n)) { //true
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
/*
Check if prime
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer, print whether that integer is a prime number or not.
Input
First line of input contains an integer T, showing the number of test cases. Every test case is a single integer A.

Constraints
1 <= T <= 100
1 <= A <= 10^8
Output
If the given integer is prime, print 'Yes', else print 'No'.
Example
Sample Input
3
5
9
13

Output
Yes
No
Yes
*/
