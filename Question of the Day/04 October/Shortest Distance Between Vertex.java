//https://my.newtonschool.co/playground/code/0z0xt2i45cu3/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    
    }
}


/*
Shortest Distance Between Vertex
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
We have an undirected graph G with N vertices and N edges. The vertices are numbered from 1 to N.
For all i = 1, 2, 3,. , N-1, there is an edge between vertex i and vertex i+1.
There is one other edge between vertex A and vertex B.

Now for each k from 1 to N-1, solve the following problem:
Find the number of pairs (i, j) such that the shortest distance between vertex i and vertex j is k.
Input
The only line of the input contains three integers N, A and B.

Constraints:
3 <= N <=2 × 103
1 <= A, B <= N
A+1 < B
Output
For each k = 1, 2,. , N-1, print the answer for the following case in a new line.
Example
Sample Input 1:
5 2 4

Sample Output 1:
5
4
1
0


Sample Input 2:
3 1 3

Sample Output 2:
3
0


Sample Input 3:
10 4 8

Sample Output 3:
10
12
10
8
4
1
0
0
0
*/
