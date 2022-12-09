import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    private static  int[][] xy;
    private static double f(double x){
        double l=0;
        double r=1001;
        int c=0;
        while(c < 80) {
            double c1= (l * 2 + r) / 3;
            double c2= (l + r * 2) / 3;
            if(g(x, c1) < g(x, c2)) {
             r=c2;
            }else {
             l=c1;
            }
            c++;
        }
        return g(x,l);
    }
    private static double g(double x, double y){
        double a=0.0;
        for(int i=0;i<xy.length;i++){
            double r=Math.sqrt((xy[i][0] -x) * (xy[i][0]  -x) + (xy[i][1] -y) * (xy[i][1] -y));
            a=Math.max(a,r);
        }
        return a;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		xy=new int[n][2];
		for(int i=0; i<n; i++){
		    xy[i][0]=sc.nextInt();
		    xy[i][1]=sc.nextInt();
		}
		double l=0;
		double r=1001;
		int c=0;
		while(c < 80){
		    double c1=(l * 2 + r) / 3;
		    double c2=(l + r * 2) / 3;
		    if(f(c1) < f(c2)){
            r=c2;
		    }else {
		    l=c1;
		    }
		    c++;
		}
		System.out.println(String.format("%.8f", f(l)));
	}
}

/*
Newton Circle
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton visits the shop again that he visited in the previous question. He again saw N points on a 2D plane there. This time he wants to buy all the points and take them back home.

At home he got curious and now wants to create a circle on a 2D plane such that all his N points are inside that circle.

Print the minimum radius of the circle that he can make.
Input
The first line contains a single integer N.
The second line contains a string s.
The next N lines contain 2 integers, Xi and Yi, representing a point.

Constraints:
1) 2 <= N <= 50
2) 0 <= Xi, Yi <= 1000
Output
Print the answer and round it off to upto 8 decimal places
Example
Sample Input 1:
3
0 0
1 0
2 0

Sample Output 1:
1.00000000


Sample Input 2:
2
0 0
2 2

Sample Output 2:
1.41421356


Sample Input 3:
10
1 10
2 9
3 8
7 6
5 4
6 11
7 13
3 3
12 1
2 3

Sample Output 3:
7.12321488
*/
