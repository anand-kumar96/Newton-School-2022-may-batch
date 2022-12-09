import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    int c=sc.nextInt();
    if(x>=c){
        System.out.println(c);
        return;
    }else if(y>=(c-x)){
        System.out.println(x);
        return;
    }else{
        System.out.println(x-(c-x-y));
    }
    }
}

/*
Maximum Value Possible
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton has 3 groups of cards. Group 1 has X total of cards, Group 2 has Y cards, Group 3 has Z cards. All X cards have 1 written on them, all Y cards have 0 written on them, all Z cards have -1 written on them.

Now Newton wants to pick C cards and add the values written on them. Help Newton pick C cards to get the maximum possible value.
Input
The only line of the input contains 4 integers, X, Y, Z and C.

Constraints:
1) 0 <= X, Y, Z <= 10^9
2) 1 <= k <= X+Y+Z;
Output
Print the maximum sum of any C cards.
Example
Sample Input 1:
3 2 1 4

Sample Output 1:
3

Explanation 1 :
Newton will pick 3 cards of 1 value and 1 card of 0 value.


Sample Input 2:
1 2 3 5

Sample Output 2:
-1

*/
