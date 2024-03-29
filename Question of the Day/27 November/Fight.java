import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
     long h=sc.nextLong();
     int n=sc.nextInt();
     int monster[]=new int[n];
     for(int i=0;i<n;i++){
         monster[i]=sc.nextInt();
     }
     Arrays.sort(monster);
     int j=n-1;
     while(h>0 && j>=0){
     h=h-(long)monster[j];
     j--;
     if(h<=0){
         System.out.println("Yes");
         return;
     }
     }
    System.out.println("No");
    }
}
/*
Fight
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Spiderman is fighting with a monster.

The health of the monster is H.

Spiderman has N moves, if he uses the i-th move, then monster’s health decreases by Ai.
There is no other way to decrease the monster's health.

Monster is dead if it’s health becomes 0 or below.

Note: He can’t use same move more than one time.

If Spiderman can win, print Yes; otherwise, print No.
Input
The first line contains two integers, H and N.
The second line contains N integers A1, A2 ... AN.

Constraints:
1 <= H <= 109
1 <= N <= 105
1 <= Ai <= 104
Output
If spiderman can win, print Yes; otherwise, print No.
Example
Sample Input 1
10 3
4 5 6

Sample Output 1
Yes
The monster's health will become 0 or below after, for example, using the second and third moves.

Sample Input 2
20 3
4 5 6

Sample Output 2
No

Sample Input 3
210 5
31 41 59 26 53

Sample Output 3
Yes

Sample Input 4
211 5
31 41 59 26 53

Sample Output 4
No
*
