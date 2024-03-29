import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       String[] s=str.split("");
       boolean flag=false;
       for(int i=0; i<s.length; i++){
           if(s[i].matches("[a-z]") && i % 2 ==0 ){
            flag=true;
          }else if(s[i].matches("[A-Z]") && i % 2 != 0){
            flag=true;
           }else {
            System.out.println("No");
            System.exit(0);
           }
       }
       if(flag)
       System.out.println("Yes");
    }
}

/*
String game
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A string is called a bad string, if it follows the two conditions:
1. All odd positions of the string contain lowercase letters.
2. All even positions of the string contain uppercase letters.

Determine whether a string S is bad.
Input
The first line contains the string S.

Constraints
S consists of uppercase and lowercase English letters.
The length of S is between 1 and 1000 (inclusive).
Output
If S is bad, print Yes; otherwise, print No.
Example
Sample Input 1
dIfFiCuLt

Sample Output 1
Yes

The odd- positioned characters are all lowercase and the even- positioned characters are all uppercase, so it is bad.

Sample Input 2
eASY

Sample Output 2
No

The 3- rd character is not lowercase, so it is not bad.

Sample Input 3
a

Sample Output 3
Yes
*/
