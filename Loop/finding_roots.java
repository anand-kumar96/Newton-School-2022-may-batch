import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	float a=sc.nextFloat();
	float b=sc.nextFloat();
	float c=sc.nextFloat();
	double d=((b*b)-(4*a*c));
    double e=((4*a*c)-(b*b));
	double f=Math.sqrt(d);
	double g=Math.sqrt(e);
	double h=(2*a);
	int temp=(int)d;
	if(d>=0){
		temp=0;
	}else if(d<0){
	temp=1;
	}
	switch(temp){
		case 0: System.out.printf("%.2f%n",((f-b)/h));
		         System.out.printf("%.2f%n",((-f-b)/h));
				 break;
	    case 1: System.out.printf("%.2f%s%.2f%n",(-b)/h, "+i",(g/h));
		         System.out.printf("%.2f%s%.2f%n",(-b)/h, "-i",(g/h));
				 break;
	}
	}
}

/*
Finding roots
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program to find roots of a quadratic equation using switch case.
Input
The first line of the input contains the three float values a, b, and c of equation ax^2 + bx + c.

Constraints
1<= a, b, c <= 50
Output
Print the two roots in two different lines and for imaginary roots print real and imaginary part of one root with (+/- and i )sign in between in one line and other in next line. For clarity see sample Output 2.

Note Imaginary roots can also be there and roots are considered upto 2 decimal places.
Example
Sample Input 1 :
4 -2 -10

Sample Output 2 :
1.85
-1.35

Sample Input 2 :
2 1 10

Sample Output 2:
-0.25 + i2.22
-0.25 - i2.22
*/
