/*
Find Mex
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Let us define mex of an array X as the smallest non- negative integer that does not occur in X.

Newton has an integer array of length N.

let’s say an array B of length N- M+1 contains mex of every subarray of length M, means for each integer i such that 0 ≤ i ≤ N−M, Bi+1 = mex(Ak) where i+1 ≤ k ≤ i+M.

Find the minimum element in array B.
Input
Constraints
1 ≤ M ≤ N ≤ 1.5×106
0 ≤ Ai < N
All values in input are integers.
Output
Print the answer.
Example
Sample Input 1
3 2
0 0 1

Sample Output 1
1

Explaination
We have:
for i=0: mex(Ai+1, Ai+2)=mex(0, 0)=1
for i=1: mex(Ai+1, Ai+2)=mex(0, 1)=2
Thus, the answer is the minimum among 1 and 2, which is 1.


Sample Input 2
3 2
1 1 1

Sample Output 2
0

Explaination
We have:
for i=0: mex(Ai+1, Ai+2)=mex(1, 1)=0
for i=1: mex(Ai+1, Ai+2)=mex(1, 1)=0


Sample Input 3
3 2
0 1 0

Sample Output 3
2

Explaination
We have:
for i=0: mex(Ai+1, Ai+2)=mex(0, 1)=2
for i=1: mex(Ai+1, Ai+2)=mex(1, 0)=2


Sample Input 4
7 3
0 0 1 2 0 1 0

Sample Output 4
2
*/
