//public class NewtonSchoolAssignment {
//}
/*  Basics of Programming, Java Programming - [Syntax], Input, Output, Variables & O ... - In Class

Question 01:

Area of Square Easy

Problem Statement
Given a side of a square, your task is to calculate its area.
Input :The first line of the input contains the side of the square.
Constraints:
1 <= side <=100
Output
You just have to print the area of a square
Example
Sample Input:-
3
Sample Output:-
9
Sample Input:-
6
Sample Output:-
36


--->Approcah:-





--> code:

*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int side =sc.nextInt();
	int area= side*side;
     System.out.println(area);

	}
}

/*



Question 02:

Ram Grades
Problem Statement
Ram is studying in Class V and has four subjects, each subject carry 100 marks.
 He passed with flying colors in his exam, but when his neighbour asked how much percentage
 did he got in exam, he got stuck in calculation. Ram is a good student but he
 forgot how to calculate percentage. Help Ram to get him out of this problem.

Input : First line contains four variables a, b, c and d.
Constraints
1<= a, b, c, d <= 100
Output
Print single line containing the percentage.
Example
Sample Input 1:
25 25 25 25

Sample Output 1:
25

Sample Input 2:
75 25 75 25

Sample Output 2:
50


-->Approcah:-





--> code:


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int sum=a+b+c+d;
		System.out.println((sum*100)/400);

	}
}




Question 03:

RMS of an array
Easy

Problem Statement
Given an array A of size N. You need to find the root mean square (RMS) of the array i. e you
first need to square all values of array and take its mean. Then you need to return the square root of mean.
 Print the answer with precision upto 6 decimal places.

Input : First line contains an integer N - the size of array
Next line contains N space separated integers - the elements of array.

Constraints
1 <= N <= 100
1 <= Ai <= 100
Output
Print the RMS value of the array.
Example
Sample Input 1:
4
1 2 3 4

Output:
2.738613

Explanation:
Sum of squares = 1 + 4 + 9 + 16 = 30
Mean = 30 / 4 = 7.5
Taking square root of 7.5 gives 2.738613

Sample Input 2:
2
7 13

Output:
10.440307

Explanation:
Sum of squares = 49 + 169 = 218
Mean = 218 / 2 = 109
Taking square root of 109 gives 10.440307


-->Approcah:-






--> code:


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		 Scanner sc=new Scanner(System.in);
	   int sum = 0;
	   int N=sc.nextInt();
	   int[] Ai = new int[N];
	   for(int i=0;i<N;i++)
	   {
		   Ai[i]=sc.nextInt();
	   }
	   for(int i=0;i<N;i++)
	   {
		   int s = Ai[i];
		   int product = s*s;
		   sum = sum + product;
	   }
	   double mean = sum/(double)N;
	   System.out.printf("%.6f",Math.sqrt(mean));

	}
}


------------------------------------------------------------------
Basics of Programming, Java Programming - [Syntax] - Post Class
-------------------------------------------------------------------

Question 01:

String Typecast
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, you need to typecast this integer to String.
If the typecasting is done successfully then we will print "Nice Job" otherwise "Wrong answer".

Input
User task:
Since this is a functional problem you don't have to worry about the input.
 You just have to complete the function checkConvertion(), which contains N as a parameter.
Output
You need to return the typecasted string value. The driver code will print "Nice Job" otherwise "Wrong answer".
Example
Sample Input:
5

Sample Output:
Nice Job

Sample Input:
6

Sample Output:
Nice Job


-->Approcah:-




 --> code:

static String checkConevrtion(int a)
 {
String s=Integer.toString(a);
return s;
 }


Question 02:

Number dilemma
Easy

Problem Statement
Nobita likes a number if it is stored in an integer while Doraemon likes it
when it is stored in a String. Your task is to write a code so that they can easily convert
an integer to a string or a string to an integer whenever they want.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the following functions:-
StringToInt() that takes String S as parameter.
IntToString() that takes the integer N as parameter.

Constraints:-
1 <= (Given Number) <= 100
Output
Return an integer in StringToInt() while return a integer integer in IntToString().
        The driver code will print "Nice Job" if your code is correct otherwise "Wrong answer".
Example
Sample Input:-
5

Sample Output:-
Nice Job

Sample Input:-
12

Sample Output:-
Nice Job


-->Approcah:-


--> code:




 static int StringToInt(String S){
int a=Integer.parseInt(S);
return a;
}

static String IntToString(int N){
String p=Integer.toString(N);
return p;
}



-----------------------------------------------------------------------
Input, Output, Variables & Operators, Datatypes & Variables - In Class
-----------------------------------------------------------------------
Question 01:

Print the input!
Easy

Problem Statement
Take an integer as input and print it.
Input
The first line contains integer as input.

Constraints
1 <= N <= 10
Output
Print the input integer in a single line
Example
Sample Input:-
2

Sample Output:-
2

Sample Input:-
4

Sample Output:-
4



-->Approcah:-






--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(a);
                      // Your code here
	}
}


Question 02:

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


-->Approcah:



--> code:
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




Question 02:

Data types
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Some Data types are given below:-
Integer
Long
float
Double
char
Your task is to take input in the given format and print them in the same order.
Input
The input contains the following values separated by lines:- integer, Long, float, double, char
Output
Print each element in a new line in the same order as input.

Note:- Print float round off to two decimal places and double to 4 decimal places.
Example
Sample Input:-
2
2312351235
1.21
543.1321
c

Sample Output:-
2
2312351235
1.21
543.1321
c


-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		long l=sc.nextLong();
		float f=sc.nextFloat();
		double d=sc.nextDouble();
		char c=sc.next().charAt(0);
		System.out.println(i);
		System.out.println(l);
		System.out.printf("%.2f%n",f);
		System.out.printf("%.4f%n",d);
		System.out.println(c);
	}

	}

Question 04:

Simple Sum
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given three integers A, B, and C, your task is to print the sum of these three integers.
Input
The input contains 3 integers separated by spaces A, B, and C.

Constraints:-
1 <= A, B, C <= 100
Output
Print the sum of A, B and C.
Example
Sample Input
1 2 3

Sample Output:-
6

Sample Input:-
5 4 2

Sample Output:-
11


-->Approcah:



--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int sum=A+B+C;
		System.out.println(sum);
                      // Your code here
	}
}


Question 05:

Simple Input- String
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S, your task is to take input of the given string and print the same string.
Input
The input contains a single string S.
Output
Print the string S.
Example
Sample Input:-
NewtonSchool

Sample Output:-
NewtonSchool

Sample Input:-
Hello

Sample Output:-
Hello


-->Approcah:



--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		String S=sc.nextLine();
		System.out.println(S);

	}
}



Question 06:

Simple Input- Integer
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, your task is to take input of the given integer and print it.
Input
The input contains a single integer N.

Constraints:-
1 <= N <= 100
Output
Print the integer N.
Example
Sample Input:-
3

Sample Output:_
3

Sample Input:-
56

Sample Output:-
56




-->Approcah:



--> code:
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n);
                      // Your code here
	}
}




Question 07:

Dishes
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sheldon and Leonard are gone for lunch but none of them have money so they decided to wash dishes. In total, they washed T dishes from which N dishes are washed by Leonard. Now Leonard wants to know the number of dishes Sheldon washed. Help him to find it.
Input
The first line of the input contains N and T

Constraints:-
1 <= N <= T <= 1000
Output
Return the number of dishes Sheldon washed.
Example
Sample Input:-
3 6

Sample Output:-
3

Sample Input:-
2 4

Sample Output:-
2


-->Approcah:



--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int T=sc.nextInt();
	    System.out.println(T-N);
                      // Your code here
	}
}


-------------------------------------------------------------------------
Input, Output, Variables & Operators, Datatypes & Variables - Post Class
--------------------------------------------------------------------------

Question 01:

Steps Execution
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Take 4 digit number input from the user, add 8 to it and then divide it by 3(Only take integer part) Now, the modulus of that number is taken with 5 and then multiply the resultant value by 5. Display the final result.
Input
First line contains 4 digit number

Constraints
1000 <= number <= 9999
Output
Print the final result
Example
Sample Input :
2345

Sample Output :
20



-->Approcah:



--> code:

\import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println((((a+8)/3)%5)*5);
                      // Your code here
	}
}




Question 02:

Magic Trick
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara is trying a new magic trick on you, The magic trick goes in 6 steps:-
1. Think of a number X(don't tell Sara)
2. Add A(Given by Sara) to it.
3. Double the sum in your mind.
4. Add an even number B(Given by Sara) to it.
5. Half the amount
6. Subtract the initial number which you had taken from the sum
After this Sara will tell the resulting amount without knowing the initial number, can you print the result for her?
Input
Input Contains two integers A and B separated by spaces.

Constraints:-
1 <= A, B <= 1000
Output
Print the resulting amount
Example
Sample Input:-
3 4

Sample Output:-
5

Sample Input:-
8 4

Sample Output:-
10


-->Approcah:



--> code:


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int X= 6;
		System.out.println(((((X+A)*2)+B)/2)-X);

		 // Your code here
	}
}



------------------------------------------------
Operators, Control Structures - In Class
-------------------------------------------------
Question 01:

Nobita and Profit
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Nobita wants to become rich so he came up with some ideas. Nobita buys some gadgets from the future at a price of C and sells them at a price of S to his friends. Now Nobita wants to know how much he gains by selling 1 gadget. As we all know Nobita is weak in maths help him to find the profit he gets
Input
The input contains two integer C and S separated by spaces.

Constraints:-
1 <= C <= S <= 1000
Output
Print the profit Nobita gets from selling one gadget.
Example
Sample Input:-
3 5

Sample Output:-
2

Sample Input:-
9 15

Sample Output:-
6


-->Approcah:



--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int C=sc.nextInt();
		int S=sc.nextInt();
		System.out.println(S-C);
                      // Your code here
	}
}


Question 02:

Nobits's Test
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Nobita wants to score well in his upcoming test, but he is not able to solve the simple division problems, seeing Nobita's determination Doraemon gives him a gadget that can do division problems easily but somehow Nobita deleted the internal program which calculates the division.
As an excellent coder, Nobita came to you for help. Help Nobita to write a code for his gadget.
You will be given two integers D and Q, you have to print the floor value of D/Q
Input
The input contains two space- separated integers depicting the values of D and Q.

Constraints:-
0 <= D, Q <= 100
Output
Print the values of D/Q if the value can be calculated else print -1 if it is undefined.

Note:- Remember division by 0 is an undefined value that will give runtime error in your program.
Example
Sample Input:-
9 3

Sample Output:-
3

Sample Input:-
8 5

Sample Output:-
1

Explanation:-
8/5 = 1.6 = 1(floor)



-->Approcah:



--> code:


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int D=sc.nextInt();
		int Q=sc.nextInt();
		if(Q!=0){
			System.out.println(D/Q);
		}else{
			System.out.println("-1");

		}

                      // Your code here
	}
}


Question 03:

Waiting Time
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara is standing in a line for her turn to see the doctor. There are N people standing in front of Sara and for each person, the doctor takes exactly X minutes. Sara wants to know the time after which her number comes. Since Sara is weak in maths, your task is to calculate the time for her.
Input
Th input contains two integers N and X.

Constraints:-
1 <= N <= 1000
1 <= X <= 1000
Output
Return the total time Sara needs to wait before her turn in minutes.
Example
Sample Input:-
5 3

Sample Output:-
15

Sample Input:-
3 2

Sample Output:-
6



-->Approcah:



--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		System.out.println(N*X);

                      // Your code here
	}
}

-------------------------------------------------------------
Control Structures, Operators, If else ladder - Post Class
-------------------------------------------------------------------


Question 01:

Logical operators
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two integers a and b, your task is to check following conditions:-
1. If a <= 10 and b >= 10 (Logical AND).
2. Atleast one from a or b will be even (Logical OR).
3. if a is not equal to b (Logical NOT).
Input
The first line of the input contains 2 integers a and b.

Constraints:
1 <= a, b <= 100
Output
Print true if the condition holds in each function else false
Example
Sample Input:-
3 12

Sample Output:-
true true true

Sample Input:-
10 10

Sample Output:-
true true false




-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		if(a<=10 && b>=10){
			System.out.print("true ");
		}else{
			System.out.print("false ");
		}if(a%2==0 || b%2==0){
			System.out.print("true ");
		}else{
			System.out.print("false ");
		}if(a!=b){
			System.out.print("true ");
		}else{
			System.out.print("false ");
		}

                      // Your code here
	}
}




Question 02:

MCQ Exam
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara has an MCQ exam containing 100 questions this sunday but she isn't prepared. She came to know that in her exam
- >P number of Questions will have A as the correct option
- >Q number of Questions will have B as the correct option
- >R number of Questions will have C as the correct option
- >S number of Questions will have D as the correct option
Sara doesn't know the order of the questions. If Sara filled the MCQs optimally using the above information what will be the maximum of minimum marks she can get.
Input
The input contains 4 integers P, Q, R, and S.

Constraints:-
0 <= P, Q, R, S <= 100

Note:- P + Q + R + S will always be 100
Output
Print the maximum marks Sara can get.
Example
Sample Input:-
8 10 20 62

Sample Output:-
62


-->Approcah: use if else ladder : logic--> if P>(Q,R,S) -->print p
            if p is not greater thn (Q,R,S)-->one of them will be greater so no need to compare with p
            similarly if q is not greater thn comparision btwn r and s.
2nd method : if case--> take seperate if condition and solve
if(P>Q && P>R && P>S)
similarly for rest and print...



--> code:


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int P=sc.nextInt();
	int Q=sc.nextInt();
	int R=sc.nextInt();
	int S=sc.nextInt();
	if(P>Q && P>R && P>S){
		System.out.println(P);
	}else if( Q>R && Q>S){
		System.out.println(Q);
	}else if(R>S){
		System.out.println(R);
	}else
		System.out.println(S);
                      // Your code here
	}
}

--------------------------------------
Loops - In Class
----------------------------------------
Question 01:
Print Digits
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a natural number N, your task is to print all the digits of the number in words. The words have to separated by space and in lowercase english letters.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Print_Digit() that takes integer N as a parameter.

Constraints:-
1 <= N <= 10000000
Output
Print the digits of the number as shown in the example.

Note:- Print all digits in lowercase English letters
Example
Sample Input:-
1024

Sample Output:-
one zero two four

Sample Input:-
2

Sample Output:-
two



-->Approcah:




--> code:
static void Print_Digits(int N){
String ans=" ";
while(N>0){
 int curr = N%10;
    if(curr==0){
        ans="zero "+ans;
    }else if(curr==1){
        ans="one "+ans;
        }else if(curr==2){
        ans="two "+ans;
        }else if(curr==3){
        ans="three "+ans;
        }else if(curr==4){
        ans="four "+ans;
        }else if(curr==5){
        ans="five "+ans;
        }else if(curr==6){
        ans="six "+ans;
        }else if(curr==7){
        ans="seven "+ans;
        }else if(curr==8){
        ans="eight "+ans;
        }else if(curr==9)
        ans="nine "+ans;


       N= N/10;
}
System.out.println(ans);
}


Question 02:

Ice cream
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara is fond of ice- cream initially she had N icecreams with her. If Sara eats exactly half of the ice cream she has in a day and the remaining icecreams get tripled each night. How many ice creams does Sara have at the end of D days?

Note:- Take floor value while dividing by 2.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Icecreams() that takes integers N and D as parameters.

Constraints:-
1 <= N <= 100
1 <= D <= 20
Output
Return a single integer denoting the number of ice creams at the end of D days.
Example
Sample Input:-
5 1

Sample Output:-
9

Explanation:-
Sara will eat 2 ice creams and the remaining 3 will be tripled i. e 9.

Sample Input:-
5 3

Sample Output:-
24

Explanation:-
Day 1:- N=5, eaten = 2, rem = 3 => remaining = 3*3 = 9
Day 2:- N=9, eaten = 4, rem = 5 => remaining = 5*3 = 15
Day 3:- N=15, eaten = 7, rem = 8 => remaining = 8*3 = 24


-->Approcah:




--> code:

static int Icecreams (int N, int D){
        for(int i=1;i<D+1;i++){
        int eat= N/2;
        int remain=N-(N/2);
        int triple=3*remain;
        N=triple;
        }
        return N;
        }
  /*
  static int Icecreams (int N, int D){
    /* for(int i=1;i<D;i++){
        N=((N-(N/2))*3);
    }
    return N;
    }








Question 03:

Magic number
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A magic number is a natural number that contains both the digits 7 and 9 in it. For eg:- 79, 879, 53729 etc.
Given a number N, your task is to find the closest Magic number from the given number N.

Note:- If more than one answer exists return the minimum one
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function MagicNumber() that takes integer N as argument.

Constraints:-
1 <= N <= 100000
Output
Return a magic number closest to the given number N.
Example
Sample Input:-
8

Sample Output:-
79

Sample Input:-
900

Sample Output:-
897


-->Approcah:




--> code:

static int MagicNumber(int N){
       int i = 0;

       while(checkNotMagic(N-i)==true && checkNotMagic(N+i)==true ){
           i++;
       }
       if(checkNotMagic(N-i)==false){
           return N-i;
       }

       else{
           return N+i;
       }
}
 static boolean checkNotMagic(int n){
           boolean seven = false;
           boolean nine = false;
           while(n>0){
              if (n%10 == 7){
                   seven = true;

               }
               if(n%10 == 9){
                  nine = true;
               }
               n = n/10;
           }
           if(seven && nine){
               return false;
           }
           else{
               return true;

           }


}




Question 03:

Sara and pattern (Functional Problem)
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara loves patterns, today she encounters an interesting pattern and wants to write a code that can print the pattern of a given height N. As Sara is weak in programming help her to code it.

The pattern for height 6:-

0 4 8 12 16 20
6 10 14 18 22 26
12 16 20 24 28 32
18 22 26 30 34 38
24 28 32 36 40 44
30 34 38 42 46 50
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Pattern() that takes integer N as an argument.

Constraints:-
1 <= N <= 100
Output
Print the given pattern.
Example
Sample Input:-
3

Sample Output:-
0 4 8
6 10 14
12 16 20

Sample Input:-
5

Sample Output:-
0 4 8 12 16
6 10 14 18 22
12 16 20 24 28
18 22 26 30 34
24 28 32 36 40


-->Approcah:




--> code:

static void Pattern(int N){
for(int i=0;i<N;i++){
  int numb=i*6;
  for(int j=0;j<N;j++){
      System.out.print(numb+" ");
      numb=numb+4;
  }
  System.out.println();
}
}


Question 05:

Rectangle
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Give integer values M and N. Using the character ‘*’ draw a rectangle of height M and breadth N.
Input
The input contains two integers M and N.

Constraints:-
3 <= M, N <= 20
Output
Print the rectangle as shown in the example
Example
Sample Input:-
3 3

Sample Output:-
***
* *
***

Sample Input:-
5 3

Sample Output:-
***
* *
* *
* *
***


-->Approcah:




--> code:
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(i==1 ||i==m ||j==1 ||j==n){
				System.out.print("*");
				}
				else{
				System.out.print(" ");
			}
			}
			System.out.println();
		}

	}


                      // Your code here
	}

------------------------------------------
Switch case, Ternary Operator - Post Class-
-----------------------------------------------

Question 01:
Student Grades
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given marks of a student in 5 subjects(any). You need to find the grade he/she would get on the basis of percentage obtained. Grades computed are as follows:

If the percentage of marks is >= 80 then print Grade ‘A’
If the percentage is <80 and >=60 then print Grade ‘B’
If the percentage is <60 and >=40 then print Grade ‘C’
else prins Grade ‘D’
Input
The input contains 5 integers separated by spaces.

Constraints:
1 <= marks <= 100
Output
You need to print the grade obtained by him/her.
Example
Sample Input:
75 70 80 90 100

Sample Output:
A



-->Approcah:




--> code:
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
	int A=sc.nextInt();
	int B=sc.nextInt();
	int C=sc.nextInt();
	int D=sc.nextInt();
	int E=sc.nextInt();
	double grade=((A+B+C+D+E)*100)/500;
	if(grade>=80){
		System.out.println("A");
	} else if(grade>=60 && grade<80){
		System.out.println("B");
	} else if(grade>=40 && grade<60){
	System.out.println("C");
	}else
	System.out.println("D");


	}
}




Question 02:

Checking a Number
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program to check whether a number is positive, negative or zero using switch case.
Input
The first line of the input contains the number

Constraints
-1e9 <= n <= 1e9
Output
Print the single line wether it's "Positive", "Negative" or "Zero"
Example
Sample Input :
13

Sample Output :
Positive

Sample Input :
-13

Sample Output :
Negative


-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		if(temp>0){
			temp=1;
		}else if(temp==0){
			temp=0;
		}else if(temp<0){
		temp=-1;}
		switch(temp){
		case -1: System.out.println("Negative");
	    break;
		case 0: System.out.println("Zero");
	    break;
		case 1: System.out.println("Positive");
	    break;
      }          // Your code here
	}
}


Question 03:

Leap Year
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a year, find if it is a leap year. Leap year is the year that is multiple of 4. But, multiples of 100 which are not multiples of 400 are not leap years.
Input
User Task:
Complete the function LeapYear() that takes integer n as a parameter.

Constraint:
1 <= n <= 5000
Output
If it is a leap year then print YES and if it is not a leap year, then print NO
Example
Sample Input:
2000

Sample Output:
YES

Sample Input:
2003

Sample Output:
NO

Sample Input:
1900

Sample Output:
NO


-->Approcah:




--> code:

import java.util.Scanner;
class Main {
   public static void main (String[] args)
   {
       //Capture the user's input
       Scanner scanner = new Scanner(System.in);
       //Storing the captured value in a variable
       int n = scanner.nextInt();
       LeapYear(n);


   }
static void LeapYear(int year){
    if ((year%4==0 && year%100!=0) || (year%4==0 && year%100==0 && year%400==0 )){
       System.out.println("YES");
       }
       else{
       System.out.println("NO");
       }

    }
}




Question 04:

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


-->Approcah:




--> code:
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		double d=(b*b)-(4*a*c);
		double e=(4*a*c)-(b*b);
		double E=Math.sqrt(e);
		double D=Math.sqrt(d);
		double r=2*a;
		double root1=(D-b)/r;
		double real=(-b/r);
		double imag=E/r;
		double root2=(-D-b)/r;
		int temp=(int)D;  // for swith we need d value in integer so typecasting
		if(D>=0){
			temp=0;
		}else  {
			temp=1;

		}

         switch(temp){
	     case 0: System.out.printf("%.2f%n",root1);
		         System.out.printf("%.2f%n",root2);
		         break;
		 case 1: System.out.printf("%.2f%s%.2f%n",(-b/r), "+i",E/r );  // Printf me contanation not possible
		         System.out.printf("%.2f%s%.2f%n",(-b/r), "-i",E/r);
		         break;

		 }
	}
}


---------------------------------------------------------------------------------------------
Loops, Functions (DSA) - Post Class
------------------------------------------------------------------------------------------------

Question 01:

Loop debugging 14
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, your task is to print all the even integer from 1 to N.
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions For_Loop() that takes the integer n as a parameter.

Constraints:
1 <= n <= 100

Note:
But there is a catch here given user function has already code in it which may or may not be correct, now you need to figure out these and correct if it is required
Output
Print all the even numbers from 1 to n.
Example
Sample Input:-
5

Sample Output:-
2 4

Sample Input:-
6

Sample Output:-
2 4 6


-->Approcah:




--> code:

public static void For_Loop(int n){
        for(int i=2;i<=n;i++){
            System.out.print(i+" ");
            i+=1;
        }
    }




Question 02:

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


-->Approcah:




--> code:
static int DivisorProblem(int N){
int count=-1;
for(int i=N;i>=1;i--){
   if (N%i==0){
       count=count+1;
       N=i;
   }
}
   return count;
}
// good one well done to you




Question 03:

Pattern Printing
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a positive integer N, your task is to print a right angle triangle pattern of consecutive numbers of height N.

For N = 5, the following pattern is printed.
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function pattern() that takes integer n as a parameter.

Constraint:
1 <= N <= 100
Output
Print a right angle triangle of numbers of height N.
Example
Sample Input:
5

Sample Output:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

Sample Input:
2

Sample Output:
1
1 2


-->Approcah:




--> code:

static void pattern(int n){
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j);
        System.out.print(" ");
    }
System.out.println();
}
}



Question 04:

Pattern
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, you have to print the given below pattern for N >= 3.

Pattern for N = 4:-
*
*^*
*^^*
*****
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Pattern() that takes integers N as argument.

Constraints:-
1 <= N <= 100
Output
Print the given pattern for size N.
Example
Sample input:-
N = 3

Sample Output:-
*
*^*
****

Sample Input:-
N = 6

Sample Output:-
*
*^*
*^^*
*^^^*
*^^^^*
******


-->Approcah:




--> code:

static void Pattern(int N) {
     System.out.println("*");

  for (int i = 1; i <= N - 2; i++) {
            System.out.print("*");

            for (int j = 1; j <= i; j++) {
            System.out.print("^");
             }
            System.out.print("*");

            System.out.println();
        }
        for (int i = 1; i <= N+1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }// good one try more time


-------------------------------------------------------------------------------------
1-D Array - In Class
---------------------------------------------------------------------------------------

Question 01:

Donation
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
After the decimation, all world went into chaos. People had to rebuild the planet so Shield came up with a donation strategy. They feel all the rich guys need to donate more than the poor guys. So, they make a rule. They would make a donation list in which the donation of each person would be shown. But the rule is that a person can’t pay less than what has already been paid before them. Find the extra amount each person will pay, and also, tell shield the total amount of donation.
Input
The first line contains n, the total number of people donating. The next line contains n space separated integers denoting the amount of money paid by the people. The amounts are mentioned in the order in which the people paid.

Constraints:-
1 <= n <= 100000
0 <= money <= 100000
Output
The first line contains the extra money that each student has to pay after their teacher applied the rule. The second line contains the total amount collected by the teacher at the end.
Example
Sample Input:-
10
1 2 3 2 4 3 6 6 7 6

Sample Output:-
0 0 0 1 0 1 0 0 0 1
43

Sample Input:-
7
10 20 30 40 30 20 10

Sample Output:-
0 0 0 0 10 20 30
220


-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr []=new int [n];
	long sum=0;
	int count=0;
	int max=0;
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
  for(int i=0;i<n;i++){
	  if(max<=arr[i]){
		  max=arr[i];
   System.out.print("0 ");
	  }else if(max>arr[i]){
		  count=count+(max - arr[i]);
		   System.out.print((max - arr[i] +" "));
	  }
	   sum=sum+arr[i];
	  }
	  System.out.println();
	   System.out.println(sum+count);

	  }
}





Question 02:

Max numbers
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of size N, you need to find its maximum, 2nd maximum and 3rd maximum element.

Try solving it in O(N) per test case
Input
The first line of the input contains the number of test cases T.

For each test case, the first line of the input contains an integer N denoting the number of elements in the array A. The next line contains N (space separated) elements of A.


Constraints:
1 <= T <= 100
3 <= N <= 10^6
1 <= A[i] <= 10^9

Note:-It is guaranteed that the sum of N over all text cases does not exceed 10^6
Output
For each test case, output the first, second and third maximum elements in the array.
Example
Sample Input:
3
5
1 4 2 4 5
6
1 3 5 7 9 8
7
11 22 33 44 55 66 77

Sample Output:
5 4 4
9 8 7
77 66 55

Explanation(might now be the optimal solution):
Testcase 1:
[1 4 2 4 5]
First max = 5
Second max = 4
Third max = 4


-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		while(tc>0){
			int n =  Integer.parseInt(sc.nextLine());
			String nums[] = sc.nextLine().split(" ");
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = Integer.parseInt(nums[i]);
			}
			int firstMax = 0, secondMax = 0, thirdMax = 0;
			int firstMaxValue = 0, secondMaxValue = 0, thirdMaxValue = 0;
			for(int i=0;i<n;i++){
				if(arr[firstMax]<arr[i]) firstMax = i;
			}
			firstMaxValue = arr[firstMax];
			arr[firstMax] = -1;
			for(int i=0;i<n;i++){
				if(arr[secondMax]<arr[i]) secondMax = i;
			}
			secondMaxValue = arr[secondMax];
			arr[secondMax] = -1;
			for(int i=0;i<n;i++){
				if(arr[thirdMax]<arr[i]) thirdMax = i;
			}
			thirdMaxValue = arr[thirdMax];
			System.out.println(firstMaxValue+" "+secondMaxValue+" "+thirdMaxValue);
			tc--;
		}
	}
}



Question 03:

Maximum difference array
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of integers of size N, your task is to find the maximum parity index of this array.
Parity Index is the maximum difference between two indices i and j (1 <= i <= j <= N) of an array A such that Ai < Aj.
Input
First line of contains a single integer N, next line contains N space separated integers depicting the values of array.

Constraints:-
1 < = N < = 100000
1 < = Arr[i] < = 100000
Output
Print the maximum value of j- i under the given condition, if no pair satisfies the condition print -1.
Example
Sample Input:-
5
1 2 3 4 5

Sample Output:-
4

Explanation:
The maximum difference of jth - ith index is 4:(4th - 0th), also arr[4] > arr[0]


Sample Input:-
5
5 4 3 2 1

Sample Output:-
-1


-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
        class Main{
        public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
       if (n <= 0) {
            return;
        }
       int []nums = new int[n];

      for (int i=0;i<n;i++) {
          nums[i]= sc.nextInt();
       }
        int diff= Integer. MIN_VALUE;
        int[] aux =new int[n];

         aux[n-1]= nums[n-1];
         for(int j=n-2;j>=0;j--) {

        aux[j]= Integer.max(nums[j], aux[j+1]);
         }
       for(int i=0, j=0; i<n && j<n;) {
           if(nums[i] <aux[j]){

        diff= Integer.max(diff, j-i);
           j++;
        }

        else {
              i++;
           }
       }

         System.out.println(diff);
        }
        }
-------------------------------------------------------------------------------
1-D Array - In Class
----------------------------------------------------------------------------------

Question 01:

Buildings
Easy

Time Limit: 1 sec
Memory Limit: 128000 kB
Problem Statement
There are N buildings in a row with different heights H[i] (1 <= i <= N).
You are viewing the buildings from the left and you can see the roof of a building i if no building to the left of the ith building has a height greater than the ith building.
You are asked to find the number of buildings whose roofs you can see.
Input
The first line contains N denoting number of buildings.
The next line contains N space seperated integers denoting heights of the buildings from left to right.


Constraints
1 <= N <= 100000
1 <= H[i] <= 1000000000000000
Output
The output should contain one integer which is the number of buildings whose roofs you can see.
Example
Sample input:
5
1 2 2 4 3

Sample output:
3

Explanation:-
the building at index 3 will hide before building at index 2 and building at index 5 will hide before building at index 4

Sample input:
5
1 2 3 4 5

Sample output:
5



-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr []=new int [size];
	int count =0;
	int max= arr[0];
	for(int i=0;i<size;i++){
		 arr[i]=sc.nextInt();
	}
	for(int j=0;j<size;j++){
    if(max < arr[j]){
     max=arr[j];
	 count=count+1;
	}

	}
	System.out.println(count);
}
}




Question 02:

Hip Hip Array
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You will be given an array of N numbers. Your task is to first reverse the array (first number becomes last, 2nd number becomes 2nd from the last and so on) and then print the sum of the numbers at even indices and print the product of the numbers at odd indices.
Input
First line contains single integer N: number of elements
Second line contains N different integers separated by spaces

constraints:-
1 <= N <= 35
1 <= a[i] <= 10
Output
Two space separated integers representing sum of the numbers at even places and the product of the numbers at odd places.

Example
Sample Input:
6
1 2 3 4 5 6

Sample Output:
9 48

Explanation:-
After reversing 1 2 3 4 5 6 becomes 6 5 4 3 2 1
Hence sum of the numbers at even indices : 5+3+1=9
product of the numbers at odd indices: 6*4*2=48

Sample Input:
3
1 2 3

Sample Output:
2 3


-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc =new Scanner (System.in);
		int size=sc.nextInt();
		 int sum=0;
		long product=1; // here i got error i take int so i changed in long
		int i;
		int arr1 []=new int[size];
		int arr2 []=new int[size];
		for( i=0;i<size;i++){
		  arr1 [i]=sc.nextInt();
		}
		for(i=0;i<size;i++){
			     arr2[i]=arr1[size-(i+1)];
		}
		for(i=0;i<size;i++){
			if(i%2!=0){
             sum=sum+arr2[i];
			}else
				product=product*arr2[i];

		}

		System.out.print(sum);
		System.out.println(" " + product);
		// Your code here
	}
}




Question 03:

Maximum and Minimum in an Array
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A[ ] of size N containing positive integers, find maximum and minimum elements from the array.
Input
The first line of input contains an integer T, denoting the number of testcases. The description of T testcases follows. The first line of each testcase contains a single integer N denoting the size of array. The second line contains N space-separated integers denoting the elements of the array.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= A[i] <= 10^7
Output
For each testcase you need to print the maximum and minimum element found separated by space.
Example
Sample Input:
2
5
7 3 4 5 6
4
1 2 3 4

Sample Output:
7 3
4 1


-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int testcase=sc.nextInt();
	for(int i=1;i<=testcase;i++){
	int size=sc.nextInt();
	int arr []=new int [size];
	for(int j=0;j<size;j++){
		arr[j]=sc.nextInt();
	}
	int max=arr[0];
	int min=arr[0];
	for(int j=1;j<size;j++){
		if(max <arr[j]){
			max=arr[j];

		}if(min >arr[j]){
			min=arr[j];
	}
	}
   System.out.print(max +" ");
   System.out.println(min);
	}
}
}
-----------------------------------------------------------------------------------------------
1-D Array - Post Class
------------------------------------------------------------------------------------------------
Question 01:

Mohit and array
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Mohit has an array of N integers containing all elements from 1 to N, somehow he lost one element from the array.
Given N-1 elements your task is to find the missing one.
Input
First line of input contains a single integer N, the next line contains N-1 space separated integers.

Constraints:-
1 < = N < = 1000
1 < = elements < = N


-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum1=0;
	int sum2=0;
	int arr[]=new int[n-1];
	if(n<2){
		return;
	}
	for(int i=0;i<(n-1);i++){
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<(n-1);i++){
		sum1=sum1+arr[i];
	}
	sum2=sum2+ (n*(n+1))/2;
	int missingnumber=sum2-sum1;
	System.out.println(missingnumber);
	}



    // 2nd method

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<(n-1);i++){
            arr[i]=sc.nextInt();
        }
        for(int num=1;num<=n;num++){
            boolean present =false;

            for(int i=0;i<(n-1);i++){
                if(arr[i]==num){
                    present=true;
                }
            }

            if(present==false){
                System.out.println(num);
            }
        }
    }
}




Question 02:

NoXor (Simple Contest)
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
We need a problem on xor again. Given an array A of N integers (1- indexed), you need to find the sum of (N- i) xor A[i] for all i from 1 to N.
Input
The first line of the input contains an integer N, the number of elements of the array.
The second line of the input contains N singly spaced integers of the array A[i].

Constraints
1 <= N <= 100000
1 <= A[i] <= 109
Output
Output a single integer, the answer to the problem.
Example
Sample Input
5
1 2 3 4 5

Sample Output
17

Explanation
(5-1)xor1 = 5, (5-2)xor2 = 1, (5-3)xor3 = 1, (5-4)xor4 = 5, (5-5)xor5 = 5.

Sample Input
5
1 1 0 4 6

Sample Output
20


-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long sum=0;
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++){
		sum= sum +((n-(i+1))^arr[i]);

	}
	System.out.println(sum);
	}
}




Question 03:

Pair Em Up (Contest)
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N elements where N is even. You have to pair up the elements into N/2 pairs such that each element is in exactly 1 pair. You need to find minimum possible X such that there exists a way to pair the N elements and for no pair sum of its elements is greater than X.
Input
First line contains N.
Second line contains N space separated integers, denoting array.

Constraints:
1 <= N <= 100000
1 <= elements of the array <= 1000000000
Output
Print a single integer, minimum possible X.
Example
Sample Input
4
3 1 1 4

Sample Output
5

Explanation: we can pair (1, 3) and (1, 4) so all pairs have sum less than or equal to 5.


-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		if(nums.length < 2) {
			return;
		}else if(nums.length==2) {
			System.out.println(nums[0] + nums[1]);
		}
		Arrays.sort(nums);

		int max=0;
		for(int i=0;i <(n )/2; i++) {
			max=Math.max(max,  nums[i] + nums[n-1-i]);
		}
		System.out.println(max);
	}
}





Question 04:

Walter White Easy
Hard

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Walter white is considered very intelligent person. He has a problem to solve. As he is suffering from cancer, can you help him solve it?
Given two integer arrays C and S of length c and s respectively. Index i of array S can be considered good if a subarray of length c can be formed starting from index i which is complimentary to array C.
Two arrays A, B of same length are considered complimentary if any cyclic permutation of A satisfies the property (A[i]- A[i-1]=B[i]-B[i-1]) for all i from 2 to length of A (1 indexing).
Calculate number of good positions in S .
Cyclic Permutation
1 2 3 4 has 4 cyclic permutations 2 3 4 1, 3 4 1 2, 4 1 2 3,1 2 3 4
Input
First line contains integer s (length of array S).
Second line contains s space separated integers of array S.
Third line contain integer c (length of array C).
Forth line contains c space separated integers of array C.

Constraints:
1 <= s <=1000000
1 <= c <=1000000
1 <= S[i], C[i] <= 10^9
Output
Print the answer.

Example
Input :
9
1 2 3 1 2 4 1 2 3
3
1 2 3

Output :
4
Explanation :
index 1- 1 2 3 matches with 1 2 3
index 2- 2 3 1 matches with 2 3 1(2 3 1 is cyclic permutation of 1 2 3)
index 3- 3 1 2 matches with 3 1 2(3 1 2 is cyclic permutation of 1 2 3)
index 7- 1 2 3 matches with 1 2 3

Input :
4
3 4 3 4
2
1 2

Output :
3


-->Approcah:




--> code:


-------------------------------------------------------------------------------------------
2-D Arrays, Maths - In Class
-------------------------------------------------------------------------------------------------

Question 01:

Simple-Determinant
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a 2X2 square matrix. You need to find the determinant of the matrix.
Input
The input contains two-line, each line contain two integers separated by spaces.

Each element of the matrix is from 1 to 100.
Output
Output a single integer, the determinant of the matrix.
Example
Sample Input
4 5
2 3

Sample Output
2

Sample Input
2 10
10 40

Sample Output
-20

-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int r=2;int c=2;
	int arr[][]=new int[r][c];
	for( int i=0;i<r;i++){
	for( int j=0;j<c;j++){
		arr[i][j]=sc.nextInt();
	}
	}
	int ans=(arr[0][0]*arr[1][1])-(arr[1][0]*arr[0][1]);
	 System.out.println(ans);
}
}




Question 02:

Simple-Transpose
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a NxN matrix. You need to find the transpose of the matrix.
The matrix is of form:
a b c ...
d e f ...
g h i ...
...........
There are N elements in each row.
Input
The first line of the input contains an integer N denoting the size of the square matrix.
The next N lines contain N single-spaced integers.

Constraints
1 <= N <= 100
1 <=Ai <= 100000
Output
Output the transpose of the matrix in similar format as that of the input.
Example
Sample Input
2
1 3
2 2

Sample Output
1 2
3 2

Sample Input:
1 2
3 4

Sample Output:
1 3
2 4


-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 int arr[][]=new int[N][N];
	 for(int i=0;i<N;i++){
		 for(int j=0;j<N;j++){
			 arr[i][j]=sc.nextInt();
		 }
	 }
	 for(int i=0;i<N;i++){
	 for(int j=0;j<N;j++){
		 System.out.print(arr[j][i] + " ");
	 }
      System.out.println();

	}
	}
}





Question 03:

Boundary Traversal of Matrix
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a matrix A of dimensions n x m. The task is to perform boundary traversal on the matrix in clockwise manner.
Input
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase two lines of input. The first line contains dimensions of the matrix A, n and m. The second line contains n*m elements separated by spaces.

Constraints:
1 <= T <= 100
1 <= n, m <= 30
0 <= A[i][j] <= 100
Output
For each testcase, in a new line, print the boundary traversal of the matrix A.
Example
Input:
4
4 4
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
3 4
12 11 10 9 8 7 6 5 4 3 2 1
1 4
1 2 3 4
4 1
1 2 3 4

Output:
1 2 3 4 8 12 16 15 14 13 9 5
12 11 10 9 5 1 2 3 4 8
1 2 3 4
1 2 3 4

Explanation:
Testcase1: The matrix is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
The boundary traversal is 1 2 3 4 8 12 16 15 14 13 9 5
Testcase 2: Boundary Traversal will be 12 11 10 9 5 1 2 3 4 8.
Testcase 3: Boundary Traversal will be 1 2 3 4.
Testcase 4: Boundary Traversal will be 1 2 3 4.


-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int testcase=sc.nextInt();
	while(testcase>0){
	int n=sc.nextInt();
	int m=sc.nextInt();
	int matrix [][]=new int [n][m];
	for( int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			matrix[i][j]=sc.nextInt();
		}
	}
	if(m==1){
		for(int i=0;i<n;i++){
      System.out.print(matrix[i][0]+" ");
		}
	}else if(n==1){
	for(int j=0;j<=m-1;j++){
	System.out.print(matrix[0][j]+" ");
	}
	}else{

	for(int j=0;j<m-1;j++){
     	System.out.print(matrix[0][j]+" "); // i made mistake when i take if ifelse thn again if
	}
	for(int i=0;i<n-1;i++){
     System.out.print(matrix[i][m-1]+" ");
	}
	for(int j=1;j<m;j++){
      System.out.print(matrix[n-1][m-j]+" ");
		}
		for(int i=1;i<n;i++){
		System.out.print(matrix[n-i][0]+" ");
		}
	}

		System.out.println();

		testcase--;
	}

	}
}


-----------------------------------------------------------------------------------------------
2-D Arrays - Post Class
-----------------------------------------------------------------------------------------------
Question 01:

A Boolean Matrix Problem
Easy

hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1.
Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to print the modified matrix.
Input
The first line of input contains T denoting the number of testcases. T testcases follow.
The first line of each testcase contains m and n denoting number of rows and number of columns.
Then next m lines contain n elements denoting the elements of the matrix.

Constraints:
1 <= T <= 20
1 <= m, n <= 700
Mat[I][j] ∈ {0,1}
Output
For each testcase, in a new line, print the modified matrix.
Example
Input:
2
5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
1 2
0 0

Output:
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
0 0

Explanation:
Testcase1: rows = 5 and columns = 4
The given matrix is
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
Evidently, the first row contains a 1 so fill the whole row with 1. The third row also contains a 1 so that row will be filled too. Finally, the last row contains a 1 and therefore it needs to be filled with 1 too.
The final matrix is
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1


-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static int MAX =1000;
	static int a[][] = new int[MAX][MAX];

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			String str[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			boolean b[] = new boolean[n];
			for(int i=0;i<n;i++){
				str = br.readLine().trim().split(" ");
				for(int j=0;j<m;j++){
					a[i][j] = Integer.parseInt(str[j]);
					if(a[i][j]==1){
						b[i]=true;
					}
				}
			}
			for(int i = 0; i < n; i++){
				if(b[i]){
					for(int j = 0; j < m; j++){
						System.out.print("1 ");
					}
				}
				else{
					for(int j = 0; j < m; j++){
						System.out.print("0 ");
					}
				}
				System.out.println();
			}
		}
	}
}





Question 02:

Chess Board
Medium

hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Tom loves Chess boards. He admires its symmetry and how the black and white colours are placed adjacently along both the axis.

More formally, a chessboard like coloring implies that no two adjacent cells have the same color and all the cells are painted either white or black.

On his birthday, Tom has been gifted a board which is in the form of a N*N grid. Every cell is painted either black or white. Since Tom loves the placement of colours in a chessboard, he will try to convert the board that has been gifted to him, identical to a chessboard. He has both black and white colours available to him. Help him find out the minimum number of the cell he will have to recolour to paint his board similar to chessboard.
Input
First line contains an integer N, denoting the size of the board
Each of the next N lines contains N space separated integers and each integer being either '0' or '1'
'1' represent black cell
'0' represents white cell

Constraints
1 <= N <= 1000
Output
A single integer that is the minimum number of cells that Tom will have to re-color in his board to convert the given board to a chess board like coloring.
Example
Input:
3
1 1 1
1 1 1
1 1 1

Output:
4

Explanation:
Convert to
1 0 1
0 1 0
1 0 1
Thus we will have to colour 4 cells.

Input:
3
0 1 0
1 0 1
0 1 0

Output:
0
It already has a chess board like coloring.


-->Approcah:




--> code:




Question 03:

Question
Status
Chessboard Formation
Hard

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
An N x N board contains only 0s and 1s. In each move, you can swap any 2 rows with each other, or any 2 columns with each other.

What is the minimum number of moves to transform the board into a "chessboard" - a board where no 0s and no 1s are 4-directionally adjacent? If the task is impossible, return -1.
Input
The input line contains T, denoting the number of test cases. Each test case contains two lines. First-line contains N, size of the matrix. Second-line contains N*N elements of binary matrix.

Constraints:
1 <= T <= 100
2 <= N <= 50
0 <= mat[i][j] <= 1
Output
For each testcase you need to print the minimum number of swaps required.
Example
Input:
2
4
0 1 1 0
0 1 1 0
1 0 0 1
1 0 0 1
3
0 1 0
1 0 1
1 1 0

Output:
2
-1

Explanation:
One potential sequence of moves is shown below, from left to right:

0110 1010 1010
0110 --> 1010 --> 0101
1001 0101 1010
1001 0101 0101

The first move swaps the first and second columns.
The second move swaps the second and third row.


-->Approcah:




--> code:


----------------------------------------------------------------------------------
Recursion(new) - In Class
-------------------------------------------------------------------------------------
Question 01:
Tower of Hanoi
From wiki-
The Tower of Hanoi is a mathematical puzzle where we have 3 rods and N disks. The puzzle starts with all the disks in ascending order of size on the first row. The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:

1. Only one disk can be moved at a time.
2. Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
3. No larger disk may be placed on top of a smaller disk.
-----x--x--x------

Let the rods have names A, B and C. Given N number of disks, numbered 1 to N from top to bottom, display all the moves required to move the disks from rod A to C in minimum number of steps.




-->Approcah:




--> code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void towerOfHanoi(int n,String source, String helper,String destination){
 //step 2
 if(n==1){  // base condition
	  System.out.println(n +":"+source+"->"+destination);
	  return;
 }
 // step1
  towerOfHanoi((n-1),source,destination,helper);
  System.out.println(n +":"+source+"->"+destination);
  towerOfHanoi((n-1),helper,source,destination);
	}
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		towerOfHanoi(n,"A","B","C");
                    
	}
}




Question 02:

Problem Statement
Given two numbers m and n, multiply them using only "addition" operations.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Multiply() that takes the integer M and N as a parameter.

Constraints:
1 ≤ T ≤ 100
0 ≤ M, N ≤ 100
Output
Return the product of N and M.



-->Approcah:
            1). add M,N times which will give =M*N value(recursive method); untill N become 0.

            02). direct miltiply



--> code:

static int  Multiply_by_recursion(int M, int N)
    {
      if(N==0){
        return 0;
      }
 int mul=M+Multiply_by_recursion(M, N-1);

 return mul;
    }


Question 03:

Palindrome [Recursive]
Easy

Problem Statement
Palindrome is a word, phrase, or sequence that reads the same backwards as forwards. Use recursion to check if a given string is palindrome or not.
Input
User Task:
Since this is a functional problem, you don't have to worry about the input, you just have to complete the function check_Palindrome() where you will get input string, starting index of string (which is 0) and the end index of string( which is str.length-1) as argument.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10000
Output
Return true if given string is palindrome else return false
Example
Sample Input
2
ab
aba

Sample Output
false
true


-->Approcah:
      point:--> A palindrome is a word, number, phrase, or other sequence of characters which
               reads the same backward as forward, such as madam or racecar.

               1). iterative mathed:
                  find string length e=str.length;
                 thn check weather i==(e-1-i) ..till middle of number i.e e/2 if true return true else return false using for loop

               by coverting string in chracter...means= 1). --->str.chart.At(i)==str.chart.At(e-1-i)

               1). reursiive mathed:
                      since s is starting index i.e 0 and e is string length
                      so base condition---> while(s<e)
                      check--> str.chart.At(i)==str.chart.At(e-1-i); / /   str.chart.At(i)!=str.chart.At(e-1-i);
                                                return true;                       return false;
                                                   s++; e--                           s++;e--
                                                   return false;                 return true;
--> code:
         method1:
    static boolean check_Palindrome(String str,int s, int e) {
        e=str.length();
         // use str.length finding length of string
         for(int i=0;i<(e/2);i++){
       // to change string to character use--->string name.charAt(i or variable)
       if(str.charAt(i)!=str.charAt(e-i-1)){
           return false;
       }

      // no need of else statement becoz we are out of loop thn we must return out side loop if we have to use
      }
      return true; // return shoulb be for main so here we return .
      }


method 2:

static boolean check_Palindrome(String str,int s, int e)
    {
while(s<=e){
    if(str.charAt(s)!=str.charAt(e)){
        return false;
    }
    s++;
    e--;

}
 return true;

   }

----------------------------
Recursion(new) - In Class
--------------------------
Question 01:
Compute power
Easy

Problem Statement
You are given two numbers n and p. You need to find n raised to the power p.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function RecursivePower that takes the integer n and p as a parameter.

Constraints:
1 <= T <= 10
1 <= n, p <= 9
Output
Return n^p.
Example
Sample Input:
3
2 3
9 9
2 9
Sample Output:
8
387420489
512
Explanation:
Test case 2: 387420489 is the value obtained when 9 is raised to the power of 9.
Test case 3: 512 is the value obtained when 2 is raised to the power of 9




-->Approcah:




--> code:

static int Power(int n,int p)
{
if(p==0){
      return 1; // don't return 0 --> in mul and div- return 1 & add and sub return-->0
}
int ans=n*Power(n,p-1);
return ans;
}



Question 02:
Print Pattern
Easy

Problem Statement
Print a sequence of numbers starting with N, without using loop, in which A[i+1] = A[i] - 5, if A[i]>0, else A[i+1] = A[i] + 5 repeat it until A[i]=N.

Note:- Once you change a operation you need to continue doing it.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function PrintPattern() that takes the integer N and the integer curr (curr = N) and bool flag (flag = true) as a parameter.

Constraints:
1<=T<=10
0 < N < 1000
Output
Print the pattern with space-separated integers.
Example
Sample Input:
2
16
10

Sample Output:
16 11 6 1 -4 1 6 11 16
10 5 0 5 10

Explanation:
We basically first reduce 5 one by one until we reach a negative or 0. After we reach 0 or negative, we one by one add 5 until we reach N.



-->Approcah:




--> code:
static void printPattern(int n,int curr, boolean flag){
  System.out.print(curr+" ");
if(flag==false && curr==n){
    return;
}
if(curr >0 && flag==true  ){
    printPattern(n,curr-5,true);
}else{
    printPattern(n,curr+5,false);

}

}
//1st method




Question 03:
Kth permutation
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
For a number N we have N! unique permutations. A permutation is a sequence of integers from 1 to N of length N containing each number exactly once.
For a positive integer X, X! = 1 * 2 * 3 *...* X-1 * X
Your task is to find the Kth smallest permutation when all possible permutations of size N are arranged in sorted order.
Input
Input contains only two integers, the value of N and K.

Constraints:-
1 <= N <= 10000
1 <= K <= min(N!,100000000)
Output
Print the Kth permutation in form of a string. i. e don't print spaces between two numbers.
Example
Sample Input:-
3 5

Sample Output:-
312

Explanation:-
All permutations of length 3 are:-
123
132
213
231
312
321

Sample Input:-
11 2

Sample Output:-
1234567891110



-->Approcah:




--> code:


----------------------
Recursion(new) - In Class
---------------------------
Question 01:
Fibonacci Numbers
Easy

Problem Statement
Given an integer N, find the Nth number in the fibonacci series. Consider 0 and 1 to be the seed values.

In the fibonacci series, each number (Fibonacci number) is the sum of the two preceding numbers. The series with 0 and 1 as seed values will go like -
0, 1, 1, 2, 3, 5 and so on..
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Fibonacci() that takes the integer N as a parameter.

Constraints:
1 ≤ T ≤ 10
1 ≤ N ≤ 30
Output
Return the Nth Fibonacci number.
Example
Sample Input
2
3
5

Sample Output
2
5

Explaination:
Test case 1-> N = 2
Seed values are 0 and 1
So, F1 = 0 + 1 = 1
F2 = 1 + F1 = 1 + 1 = 2




-->Approcah:




--> code:
static long  Fibonacci(long  n) 
    { 
         if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
        //Enter your code here
    }



Question 02:

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


-->Approcah:




--> code:
static long  Sum(long  n) 
    { 
      if(n==0){
        return 0;
      }
      long ans=n%10+Sum(n/10);
      
     return ans;
}




Question 03:
Palindrome Number
Easy

Problem Statement
Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backward as forward.
Input
User task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the function isPalindrome() which contains N as a parameter.

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



-->Approcah:




--> code:

Palindrome Number
Easy

Problem Statement
Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backward as forward.
Input
User task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the function isPalindrome() which contains N as a parameter.

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


Question 01:




-->Approcah:




--> code:





Question 01:




-->Approcah:




--> code:






Question 01:




-->Approcah:




--> code:




Question 01:




-->Approcah:




--> code:






Question 01:




-->Approcah:




--> code:






Question 01:




-->Approcah:




--> code:






Question 01:




-->Approcah:




--> code:






Question 01:




-->Approcah:




--> code:





Question 01:




-->Approcah:




--> code:




Question 01:




-->Approcah:




--> code:





Question 01:




-->Approcah:




--> code:





Question 01:




-->Approcah:




--> code:





Question 01:




-->Approcah:




--> code:





Question 01:




-->Approcah:




--> code:






Question 01:




-->Approcah:




--> code:






Question 01:




-->Approcah:




--> code:






Question 01:




-->Approcah:




--> code:






Question 01:




-->Approcah:




--> code:






Question 01:




-->Approcah:




--> code:







Question 01:




-->Approcah:




--> code:






Question 01:




-->Approcah:




--> code:






Question 01:




-->Approcah:




--> code:






Question 01:




-->Approcah:




--> code:



Question 01:





-->Approcah:




--> code:





Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:






Question 01:





-->Approcah:




--> code:






Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:









Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:






Question 01:





-->Approcah:




--> code:





Question 01:





-->Approcah:




--> code:







Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:






Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:









Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:







Question 01:





-->Approcah:




--> code:







Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:







Question 01:





-->Approcah:




--> code:







Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:







Question 01:





-->Approcah:




--> code:







Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:







Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:








Question 01:





-->Approcah:




--> code:







Question 01:





-->Approcah:




--> code:






Question 01:





-->Approcah:




--> code:









 */
