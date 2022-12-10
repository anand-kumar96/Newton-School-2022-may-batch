import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void lexicographically(int arr[], int k){
        for(int i=0; i<k; i++)
        System.out.print(arr[i] + " ");
        System.out.print("\n");
        
    }
  public static void recursivePrintSequence(int m, int n, int length, int arr[]){
        if(length == n){
        lexicographically(arr,n);
        return;
        }
        int i=(length ==0) ? 1 : arr[length-1] +1;
        length++;
        while(i<=m){
        arr[length-1] = i;
        recursivePrintSequence(m,n,length,arr);
        i++;
        }
        length--;
    }
    public static void printSequence(int m, int n){
        int arr[]=new int[n];
        int length=0;
        recursivePrintSequence(m,n,length,arr);
       }
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int m=sc.nextInt();
	   Main obj=new Main();
	   obj.printSequence(m, n);
    }
}

/*
Increasing Sequences
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob loves strictly increasing sequences. But he has elements between 1 and M (inclusive).
So he wants to find all strictly increasing integer sequences of length N having all elements between 1 and M (inclusive), in lexicographically ascending order.
Input
The first line of the input contains 2 integers, N and M.

Constraints:
2 <= N <= M <= 10
All values in input are integers
Output
Print the sought sequences in lexicographically ascending order, each in its own line
Example
Sample Input 1:
2 3

Sample Output 1:
1 2
1 3
2 3

Explanation 1:
The sought sequences are (1, 2), (1, 3), (2, 3), which should be printed in lexicographically ascending order


Sample Input 2:
3 5

Sample Output 2:
1 2 3
1 2 4
1 2 5
1 3 4
1 3 5
1 4 5
2 3 4
2 3 5
2 4 5
3 4 5
*/
