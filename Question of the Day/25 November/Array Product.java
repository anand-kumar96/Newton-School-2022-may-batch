import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long result =1;
       for(int i=0; i<n; ++i){
          long ans=sc.nextLong();
          if(Math.log10(ans)+Math.log10(result) <18){
            result *=ans;
          }else if(ans==0){
            result=0;
          }else{
            result=-1; 
          }
       }
       System.out.println(result);
    }
}
/*
Array Product
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob has an array of N numbers. He wants to calculate the product of array, but does not want integers greater than 1018. So, if the result exceeds 1018, print -1 instead.
Input
Constraints:
2 <= N <= 105
0 <= Ai <= 1018
All values in input are integers.
Output
Print the value of A1×A2....×AN as an integer, or -1 if the value exceeds 1018.
Example
Sample Input 1
2
1000000000 1000000000

Sample Output 1
1000000000000000000
We have 1000000000×1000000000=1000000000000000000.

Sample Input 2
3
101 9901 999999000001

Sample Output 2
-1
We have 101×9901×999999000001=1000000000000000001, which exceeds 1018, so we should print -1 instead.

Sample Input 3
31
4 1 5 9 2 6 5 3 5 8 9 7 9 3 2 3 8 4 6 2 6 4 3 3 8 3 2 7 9 5 0

Sample Output 3
0
Generate Expected Outp
*/
