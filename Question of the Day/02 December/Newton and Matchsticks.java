import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int match[]={6,2,5,5,4,5,6,3,7,6};
		Hashhm<Integer, Integer> hm=new Hashhm<>();
		for(int i=0; i<M; i++){
		    int number=sc.nextInt();
		    hm.put(number, match[number]);
		}
		int digit[]=new int[N+1];
		Arrays.fill(digit, -100000);
		digit[0]=0;
		int arr[]=new int[N+1];
		for(int j=1; j<=N; j++){
		    for(int d: hm.keySet()){
		        if(j-hm.get(d) >=0 && digit[j] <= 1 + digit[j-hm.get(d)]){
		            digit[j]=1+digit[j-hm.get(d)];
		            arr[j]=d;
		        }
		    }
		}
		int m=N;
		while(m > 0{
		    System.out.print(arr[m]);
		    m -=match[arr[m]];
		}
		System.out.println();
    }
}
          
 /*
    Newton and Matchsticks
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton's friend Einstein has given him a puzzle. He has N matchsticks and wants to create numbers by arrange some matchsticks. (Refer the image below for the number of matchsticks used to make each number).

Einstein has also given Newton a list of M integers, T1, T2, ... , TM and wants Newton to make the largest number using possible using the N matchsticks and only form the digits included in the list.

It can be shown that there is a positive integer that can be made using all the N matchsticks under the given constraints.

Input
The first line of the input contains 2 positive integers N and M
The next line contains M different positive integers T1, T2, ... , TM

Constraints:
2 ≤ N ≤ 105
1 ≤ M ≤ 9
1 ≤ Ti ≤ 9
Output
Print the answer
Example
Sample Input 1:
20 2
3 7

Sample Output 1:
777773


Sample Input 2:
101 5
7 4 3 2 1

Sample Output 2:
71111111111111111111111111111111111111111111111111      
  */
