/*
Sum of product of Balls
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob and n-1 of his friends want to play a game. The game is to calculate the sum of the product of balls. The game is as follows:
All n people stand in a circle. They all initially have some balls in their hands. So for each i from 1 to n, let bi be the balls in their hand.
Now each person has to perform exactly one move simultaneously. They have to choose any amount of balls they have (possibly 0) and hand it over to the next person to their right. Person 1 will have Person 2 to their right. Person n will have Person 1 to their right.
Suppose they end up with a combination of balls after performing the moves. Now you have to multiply all the balls in a particular combination and sum up the values for all the unique combinations.

For example: Let there be 2 persons initially with 1 ball each.
So we have (1, 1) as our initial combination. Now the possible combination after both perform their move is:
(1, 1) - > Both give 0 balls to each other
(0, 2) - > 1st person gives 1 ball to 2nd person. 2nd person gives 0 balls to 1st person
(2, 0) - > 1st person gives 0 balls to 2nd person. 2nd person gives 1 ball to 1st person
(1, 1) - > Both give 1 ball to each other

Unique combinations that we get are (1, 1), (0, 2), (2, 0). So the product of each combination is 1, 0, 0 respectively. There the sum of the product is 1+0+0 = 1.
Hence the answer for the above case is 1.

As the answer may be very large, calculate it modulo 998244353.
Input
The first line contains a single integer N.
The next line contains n integers ith of them represents the balls with the ith person

Constraints:
2 <= N<=10^5
0 <= bi <=10^9
Output
Calculate the sum of product of all the combinations, modulo 998244353.
Example
Sample Input 1:
3
1 1 1

Sample Output 1:
1


Sample Input 2:
20
5644 493 8410 8455 7843 9140 3812 2801 3725 6361 2307 1522 1177 844 654 6489 3875 3920 7832 5768

Sample Output 2:
864609205
*/

