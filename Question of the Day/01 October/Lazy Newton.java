//https://my.newtonschool.co/playground/code/a5v0tamgx3bc/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    int K=sc.nextInt();
    int n=sc.nextInt();
    int D[]=new int[n];
    for(int i=0;i<n;i++){
        D[i]=sc.nextInt();
    }
    int Maxdistance=0;
for(int i=1;i<n;i++){
    Maxdistance=Math.max(Maxdistance,D[i]-D[i-1]);
}
    Maxdistance=Math.max(Maxdistance,(D[0]+K-D[n-1]));
    System.out.print(K-Maxdistance);
    }
}

/*
Lazy Newton
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton is a delivery boy and has to deliver goods to N different houses. The houses are built across a circular park of perimeter K meters. The ith house is built at a distance of Di meters from the northmost point of the park.

Newton can start at any house. As he is lazy, he wants to deliver all the items in the minimum time possible. Find the minimum distance he needs to travel to visit all the N houses. Newton can move only around the park in a circular manner.
Input
The first line contains two integers K and N.
The second line contains N space separated integers, D0, D1, … Dn-1 representing the distance of all the houses from the northmost point

Constraints:
2 <= k <= 10^6
2 <= N <= 2 × 10^5
0 <= Di ​<. . < Dn ​< k
Output
Find the minimum distance that Newton has to travel.
Example
Sample Input 1:
20 3
5 10 15

Sample Output 1:
10

Sample Input 2:
20 3
0 5 15

Sample Output 2:
10
*/
