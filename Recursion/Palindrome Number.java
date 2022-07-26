/*
Palindrome Number
Easy

Problem Statement
Given a number N, you need to check whether the given number is Palindrome or not. 
A number is said to be Palindrome when it reads the same from backward as forward.
Input
User task:
Since this is a functional problem you don't have to worry about the input.
You just have to complete the function isPalindrome() which contains N as a parameter.

Constraints:
1 <= N <= 9999
Output
You need to return "true" is the number is palindrome otherwise "false".
Example
Sample Input:
5

Sample Output:
true

Sample Input:
121

Sample Output:
true
*/
//code

static boolean isPalindrome(int N)
    {
    int ans=0;
    int n=N;
     while(N>0){
        ans=ans*10+(N%10);
        N=N/10;
     }
   //   if(ans==N){
   //      return true;
   //   }
   //   return false;

   // in one line
     return ans==n;
    }
