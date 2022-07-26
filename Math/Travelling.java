/*
Travelling
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given N cities in a line and your initial position, you want to visit all the cities at least once. You can go to one coordinate P to P+D or P-D where D is the number of steps which you choose initially. Your task is to find the maximum value of D such that you can visit all the cities at least once.
Input
The first line of input contains two integers N and X(initial position). The second line of input contains N space separated integers representing the location of cities.

Constraints:-
1 <= N <= 100000
1 <= City[] <= 100000000
Output
Print the maximum value of D such that you can visit all the cities.
Example
Sample Input:-
3 3
1 7 11

Sample Output:-
2

Sample Input:-
3 81
33 105 57

Sample Output:-
24
*/
//code
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();

        int[] city = new int[n];
        for(int i=0; i<n; i++){
            city[i] = Math.abs(scn.nextInt()-x);
        }
        //now solve the problem
        int gcd_=gcd(city[0],city[1]);
        for(int i=2; i<n; i++){
            gcd_= gcd(gcd_,city[i]);
        }
        System.out.println(gcd_);
    }
    //method to find gcd
    static int gcd(int m, int n){
        if(m==0){
            return n;
        }if(n==0){
            return m;
        }if(m==n){
            return m;
        }if(m>n){
         return gcd(m%n, n);
        }
        return gcd(n%m, m);
    }
}
