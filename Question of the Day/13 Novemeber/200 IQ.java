import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main (String[] args)  {
      	Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int[] arr=new int[n];
		  Arrays.fill(arr, -1);
          int x=sc.nextInt();
		  for(int m=x; m>0; --m){
			  int pi=sc.nextInt()-1;
			  int qi=sc.nextInt();
			  if(n > 1 && pi+qi ==0 || arr[pi] > 0 && arr[pi] != qi){
				  System.out.println(-1);
				  return;
			  }
			  arr[pi] = qi;
		  }
		  for(int i=0; i<n; ++i)
			  if(arr[i] < 0)
			  	arr[i] = i < 1 && n > 1? 1:0;
			System.out.println(Arrays.toString(arr).replaceAll("\\D", ""));
    }
}

/*
200 IQ
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Einstein challenges Newton in the battle of IQ.

He wants Newton to guess a number, N digit long. He gives X hints to Newton.

Each hint consists of 2 numbers, pi and qi (for all i from 1 to X). It means that at position pi (from left) the digit is qi.

Newton wants to tell the minimum number that passes all the hints. If no number satisfies, print -1

(Note: The number 0 is a 1 digit number. Also, any other number cannot have leading 0’s)
Input
The first line of the input contains two integers N and X.
The next X lines contain 2 integers each, pi and qi.

Constraints
1) 1 <= N <= 9
2) 1 <= X <= 18
3) 1 <= pi <= N
4) 0 <= qi <= 9
Output
Print the number.
Example
Sample Input 1:
4 4
2 7
1 4
3 2
2 7

Sample Output 1:
4720


Sample Input 2:
3 2
1 5
1 9

Sample Output 2:
-1


Sample Input 3:
4 1
1 0

Sample Output 3:
-1
*/
