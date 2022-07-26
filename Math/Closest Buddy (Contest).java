/*
Closest Buddy (Contest)
Medium

Time Limit: 2 sec
Memory Limit: 512000 kB
Problem Statement
You are given an integer array A of size N. For each index i (1 <= i <= N), you need to find an index j, such that gcd(A[i], A[j]) = 1, and abs(i-j) is the minimum possible. If there are two values of j satisfying the condition, report the minimum one. If there is no possible value of j, report -1.

Note: gcd(x, y) represents the the greatest common divisor of integers x and y, while abs(i- j) represents the absolute value of (i-j). Eg: gcd(6, 15) = 3 ; abs(6-15) = 9.

See sample for better understanding.
Input
The first line of the input contains a single integer N.
The next line of the input contains N space separated integers, the elements of the array A.

Constraints
1 <= N <= 200000
1 <= A[i] <= 50
Output
Output N space separated integers, the value of j corresponding to each index. If there is no possible value of j, report -1 instead.
Example
Sample Input
5
1 2 4 3 9

Sample Output
1 1 4 3 3

Explanation
For index 1, gcd(A[1], A[1]) = 1, and abs(1-1) = 0.
For index 2, gcd(A[2], A[1]) = 1, and abs(2-1) = 1. gcd(A[2], A[4) is also equal to 1, but abs(2-4) = 2, which is a greater value.
Similarly for index 3, 4, and 5, gcd(A[3], A[4]) = 1, gcd(A[4], A[3]) = 1, and gcd(A[5], A[3]) = 1.

Sample Input
5
3 3 2 3 3

Sample Output
3 3 2 3 3

Sample Input
5
3 21 7 7 21

Sample Output
3 -1 1 1 -1
*/
//code

