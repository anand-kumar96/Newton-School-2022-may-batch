import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int max=0;
    for(int i=0;i<n;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        //code
    }
    
    System.out.println(max);
}
}
/*
Newton likes Geometry
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton visits a shop that has N points on a 2D plane. He wants to buy two points and take them back home.

He selects these points in such a way that they are at maximum distance from each other. The distance between two points (X1, Y1) and (X2, Y2) can be calculated as: |X2- X1| + |Y2- Y1|.

Print the maximum distance that Newton can get.
Input
The first line contains a single integer N.
The next N lines contain 2 integers, Xi and Yi, representing a point.

Constraints:
1) 2 <= N <= 4 x 10^5
2) 1 <= Xi, Yi <= 10^9
Output
Print the answer
Example
Sample Input 1:
3
1 10
2 8
2 7

Sample Output 1:
4


Sample Input 2:
3
2 2
2 2
2 2

Sample Output 2:
0
*/
