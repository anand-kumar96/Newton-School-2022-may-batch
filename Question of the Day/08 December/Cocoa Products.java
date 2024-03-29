import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner  sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   int sum=a+b;
	   if(sum >= 15 && b >= 8){
		   System.out.println(1);
	   }else if(sum >= 10 && b>= 3){
		   System.out.println(2);
	   }else if(sum >= 3 && b <= 3){
		   System.out.println(3);
      }else{
		   System.out.println(4);
	   }
    }
}

/*
Cocoa Products
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are four major items made of Cocoa Powder:

1. a product with at least 15 percent cocoa powder and at least 8 percent milk is called Cocoa Shake;
2. a product with at least 10 percent cocoa powder and at least 3 percent milk is called Brownie;
3. a product with at least 3 percent cocoa powder is called cake;
4. a product is called flavoured cocoa.

Newton's famous product contains A percent cocoa powder and B percent milk.
Which of the item above does Newton’s product fall into?
Print your answer as an integer according to the Output section.
Input
The first line contains two integers A and B.

Constraints
0 ≤ A ≤ 100
0 ≤ B ≤ 100
A+B ≤ 100
A and B are integers.
Output
Print an integer as follows:

if Newton's product is cocoa Shake, print 1;
if Newton's product is brownie, print 2;
if Newton's product is cake, print 3;
if Newton's product is flavoured cocoa, print 4.
Example
Sample Input 1
10 8

Sample Output 1
1

Explaination
This product contains 10 percent cocoa powder and 8 percent milk, for a total of 18 percent cocoa powder.
Since it contains not less than 15 percent cocoa powder and not less than 8 percent milk, it is an cocoa Shake; the correct output is 1.


Sample Input 2
1 2

Sample Output 2
3

Explaination
Since it contains exactly 3 percent cocoa powder, is a cake; the correct output is 3.


Sample Input 3
0 0

Sample Output 3
4

Explaination
It is a flavoured Shake.
*/
