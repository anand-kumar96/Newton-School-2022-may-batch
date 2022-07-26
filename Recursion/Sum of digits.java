/*
Sum of digits
Easy

Problem Statement
Given a number N, find the sum of all the digits of the number

Note: Use a recursive method to solve this problem.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Sum() that takes the integer N as a parameter.

Constraints:
1 ≤ T ≤ 100
0 ≤ N ≤ 1000000000
Output
Return sum of digits.
Example
Sample Input
2
25
28

Sample Output
7
10
*/

// code
static long  Sum(long  n) 
    { 
 long ans=0;
 while(n>0){
 long digit=n%10;
 ans=ans+digit;
  n=n/10;
  }
 return ans;

    }
    // without recursion
