//https://my.newtonschool.co/playground/code/z67m51q7c9co/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     long x[]=new long[n];
     long y[]=new long[n];
     for(int i=0;i<n;i++){
         x[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++){
         y[i]=sc.nextInt();
     }
      
    // code hidden

    }
}






/*
Good Integer
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob has two sequences x and y, each of length N, consisting of non- negative integers. 
The i- th elements of x and y are xi​ and yi​, respectively. Bob wants to know the number of good non- negative integers. 
A non- negative integer a is said to be good when the following condition is satisfied:
Condition: It is possible to permute y so that xi​ XOR yi​=a holds for every integer i such that 1≤i≤N, where XOR is the bitwise XOR.
Print all good integers in ascending order.
Input
First line contains a single integer N.
Next line contains n space separated integers (x1, x2, … xn)
Last line contains n space separated integers (y1, y2, … yn)

Constraints
All values in input are integers.
1≤N≤2000
0≤xi​, yi​<2^30
Output
In the first line, print K, the number of good integers. 
Then, print K more lines. In the i- th of these K lines, print the i- th smallest good integer
Example
Sample Input 1:
3
1 2 3
6 4 7

Sample Output 1:
1
5

Sample Input 2:
2
0 1
0 2

Sample Output 2:
0
*/
