//https://my.newtonschool.co/playground/code/qh5e5xatkcc4/
/*
Problem Statement
Let’s play a box game.
Bob has N boxes arranged in a row from left to right. He can write an integer between 1 and K (inclusive) on each of these boxes, which are initially blank.
To make the game more interesting, there are K restrictions numbered 1 through K. Restriction i is composed of a character ci​ and an integer ki​. If ci​ is L, the ki​- th box from the left in the row must be the leftmost box on which Bob write i. If ci​ is R, the ki​- th box from the left in the row must be the rightmost box on which Bob write i.
Note that for each integer i from 1 through K, there must be at least one box on which we write i.
Calculate the number of ways Bob can write integers on these boxes under the K restrictions, modulo 998244353.
Input
The first line contains 2 integers N and K.
ith of the next N lines contains 2 integers, ci and ki

Constraints:
1≤N, K≤1000
ci​ is L or R
1≤ki​≤N
ki​=kj​ if i=j.
Output
Calculate the number of ways Bob can write integers on these boxes under the K restrictions, modulo 998244353.
Example
Input:
3 2
L 1
R 2

Output:
1

Explanation:

The only way to meet the two restrictions is to write 1, 2, 1 from left to right on the three cards.
*/
