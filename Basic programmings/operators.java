import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner ss=new Scanner(System.in);
		int number1=ss.nextInt();
		int number2=ss.nextInt();
		int sum=number1 + number2;
		int diff=number1 - number2;
		int mul=number1 * number2;
		int div=number1 / number2;
		System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
		System.out.println(div);
                      // Your code here

	}
}
/*
Operators
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two integers a and b, your task is to calculate and print the following four values:-
a+b
a-b
a*b
a/b

Note:- See example for more clarity.
Input
The input contains two integers a and b separated by spaces.

Constraints:
1 <= b <= a <= 1000

Note: It is guaranteed that a will be divisible by b.
Output
Print the mentioned operations each in a new line.
Example
Sample Input:
15 3

Sample Output:
18
12
45
5
*/
