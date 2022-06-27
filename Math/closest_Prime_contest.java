import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
	public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     if(isprime(n)){
         System.out.println(n);
         return;
     }
     for(int i=0;i<=n;i++){
	     // or
// 	      if(isprime(n)){
//          System.out.println(n);
//          break;
//      }
         if(isprime(n-i)==true || isprime(n+i)==true ){
             if(isprime(n-i)){
                 System.out.println(n-i);
                 break;
             }else  if(isprime(n+i)){
                 System.out.println(n+i);
                 break;
         }

     }

	}
}
}

// method 02
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
 static boolean prime(int n) {
 if (n <= 1)
return false;
for (int i = 2; i <= Math.sqrt(n); i++) {
if (n % i == 0)
return false;
 }
return true;
 }
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
 if (prime(n)) {
 System.out.println(n);
} else {
int i = n - 1, j = n + 1;
for (; ; ) {
if (prime(i)) {
System.out.println(i);
 break;
 } else if (prime(j)){
System.out.println(j);
 break;
  }
 i--;
 j++;

}
}
}
 }
// method 03
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
	public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     if(isprime(n)){
         System.out.println(n);
         return;
     }
      int i=n ,j=n;
       while(true){
             if(isprime(i)){
                 System.out.println(i);
                 break;
             }else  if(isprime(j)){
                 System.out.println(j);
                 break;
         }
         i--;
         j++;

     }

	}
}

/*
Closest Prime (Contest)
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, find the closest prime number to N. If there are multiple print the smaller one.
Input
The input contains a single integer N.

Constraints:
1 <= N <= 1000000000
Output
Print the closest prime to N.
Example
Sample Input 1
12

Sample Output 1
11

Explanation: Closest prime to 12 is 11 and 13 smaller of which is 11.

Sample Input 2
17

Sample Output 2
17

Explanation: Closest prime to 17 is 17.
*/
