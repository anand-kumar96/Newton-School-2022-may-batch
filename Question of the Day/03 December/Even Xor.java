import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       long a=sc.nextLong();
       if((a ^ (a ^ 2)) == 0){
           a +=2;
       }
       else if((a/2) % 2 == 0){
           a +=2;
       }else{
           a -=2;
       }
       System.out.println(a);
    }
}

/*
Even Xor
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton is given a non- negative integer A and his friend Ramanujan wants Newton to find another non- negative integer B such that xor of these two numbers is an even prime number, i. e. A xor B should be an even prime number

Help Newton find such integer B.
Input
The first and the only line of the input contains a single non- negative integer A.

Constraints:
0 ≤ A ≤ 1018
Output
Print the value of B
Example
Sample Input 1:
10

Sample Output 1:
8


Sample Input 2:
29

Sample Output 2:
31
*/
