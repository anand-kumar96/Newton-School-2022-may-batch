import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String str=sc.next();
    int ans=n;
    for(int i=1;i<n;i++){
        if(str.charAt(i-1)!=str.charAt(i)){
            ans=Math.min(Math.max(i,n-i),ans);
        }
    }
    System.out.println(ans);
    }
}

/*
String Conversion
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a binary string S of length N. Suppose there is an integer K (1 <= K <= N). You can perform the following operation on the string any number of times (possible zero):

Select a substring in S whose size is at least K i. e, R − L + 1 >= K must be followed and flip this substring. Flipping here means if Si is equal to '1', make it equal to '0' and if Si is equal to '0', make it equal to '1'.

Find the maximum value of K such that you can make string S a null string. A null string is defined as a binary string in which all the characters are '0'.
Input
The first line of the input contains a single integer N.
The second line of the input contains a binary string of lenth N.

Constraints:
1 <= N <= 105
Output
Print the maximum value of K such that you can make string S a null string.
Example
Sample Input:
3
010

Sample Output:
2

Explaination:
We can make S a null string by the following operations:

First, we pick the segment S[1,3] with length 3. S is now 101.

Next, we pick the segment S[1,2] with length 2. S is now 011.

And finally we pick the segment S[2,3] with length 2. S is now 000.

*/
