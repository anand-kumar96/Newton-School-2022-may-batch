static int DivisorProblem(int N){
int count=-1;
for(int i=N;i>0;i--){
   if(N%i==0){
      count++;
       N=i;
   }
  
}
return count;
}


/*
Divisor's problem
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara is solving a math problem in which she has given an integer N and her task is to find the number of operations required to convert N into 1.
Where in one operation you replace the number with its second-highest divisor.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function DivisorProblem() that takes integer N as argument.

Constraints:-
1 <= N <= 100000
Output
Return the number of operations required.
Example
Sample Input:-
100

Sample Output:-
4

Explanation:-
100 - > 50
50 - > 25
25 - > 5
5 - > 1

Sample Input:-
10

Sample Output:-
2

*/
