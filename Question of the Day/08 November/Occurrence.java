import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
      public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s= sc.next();
        int ans=n-s.replaceAll("ABC", "").length();
        System.out.println(ans/3);
    }
}
/*
Occurrence
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob loves strings. He has a string s of length n consisting of uppercase English letters and he also has string t “ABC”. He wants to know how many times string t occurs in s as contiguous subsequences.
Input
The first line contains a single integer N.
The second line contains a string s.

Constraints
3≤N≤50
s consists of uppercase English letters.
Output
Print the number of occurrences of string t in string s as contiguous subsequences.
Example
Sample Input 1
10
ZABCDBABCQ

Sample Output 1
2
Two contiguous subsequences of S are equal to ABC: the 2- nd through 4- th characters, and the 7- th through 9- th characters.

Sample Input 2
19
THREEONEFOURONEFIVE

Sample Output 2
0
No contiguous subsequences of S are equal to ABC.

Sample Input 3
33
ABCCABCBABCCABACBCBBABCBCBCBCABCB

Sample Output 3
5
*/
