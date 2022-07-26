/*
Identical Groups
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Myra has x red colour balls and y blue colour balls. She wants to distribute these balls into identical groups without any balls left. 
What is the largest number of groups she can make?

Identical groups mean there are equal number of same coloured balls in each group.
Input
A single line containing two integers x and y.

Constraints:
1<=x, y<=10000000
Output
Return the largest number of groups that can be made.
Example
Sample Input
3 9

Sample Output
3

Explanation:-
1 red ball and 3 blue ball will be in each group.

Sample Input:
4 9

Sample Output:
1
*/
// code
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int ans=gcd(x,y);
    System.out.println(ans);
    }
}
