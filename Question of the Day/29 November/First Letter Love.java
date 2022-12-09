import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     String arr[]=new String[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.next();
     }
     for(int i=1;i<n;i++){
         if(arr[i-1].length()==0 || (arr[i-1].charAt((arr[i-1].length()-1))!=arr[i].charAt(0))){
             System.out.println("No");
             return;
         }
     }
     Arrays.sort(arr);
      for(int i=1;i<n;i++){
         if(arr[i-1].equals(arr[i])){
              System.out.println("No");
             return;
         }
     }
      System.out.println("Yes");
    }
}
/*
First Letter Love
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton has a sequence of N words. He wants to make sure that all the words after the first word follow a specific pattern i. e. they should start with letter same as the previous word ending letter and they should not have occurred before.

You are given all the words, tell whether they follow the pattern set by Newton or not. Print "Yes" if they follow, otherwise print "No"
Input
The first line of the input consists of an integer N
Each of the next N lines contains a string Si

Constraints:
2 <= N <= 105
1 <= |Si| <= 100
Output
Output the answer.
Example
Sample Input 1:
3
newton
school
discord

Sample Output 1:
No

Explanation:
2nd and 3rd word doesn't start with the previous word ending letter


Sample Input 2:
3
newton
newton
newton

Sample Output 2:
No

Explanation:
Same word "newton" occurring multiple times


Sample Input 3:
3
yash
hsay
yay

Sample Output 3:
Yes
*/
