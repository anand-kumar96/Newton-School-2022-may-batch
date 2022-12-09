import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       String str1=sc.next();
       String str2=sc.next();
       int count=0;
       for(int i=0; i<str1.length(); i++){
           if(str1.charAt(i) != str2.charAt(i))
           count++;
       }
       System.out.println(count);
    }

}
/*
Replace characters
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Two strings are given, S and T.
Find the minimum number of characters we need to replace in S with a different character to convert into T.
Input
The first line contains the string S. The second line contains the string T.

Constraints
S and T have lengths between 1 and 2*105(inclusive).
S and T consist of lowercase English letters.
S and T have equal lengths.
Output
Print the answer.
Example
Sample Input 1
cupofcoffee
cupofhottea

Sample Output 1
4

Explanation:
We can achieve the objective by replacing four characters, such as the following:

First, replace the sixth character c with h.
Second, replace the eighth character f with t.
Third, replace the ninth character f with t.
Fourth, replace the eleventh character e with a.

Sample Input 2
abcde
bcdea

Sample Output 2
5

Sample Input 3
apple
apple

Sample Output 3
0

Explanation
No replacements may be needed to achieve the objective.
*/
