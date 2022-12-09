import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long S=sc.nextLong();
        long D=sc.nextLong();
        for(int i=0; i<N; i++){
            long X=sc.nextLong();
            long Y=sc.nextLong();
            if(X < S && Y > D){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
/*
Attack
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton is fighting with a villain.
He has N special powers.

The i- th power takes Xi seconds to cast and has an attacking power Yi.

However, the villain has no effect of power taking S or more seconds to cast and powers with attacking powers D or less.

Can Newton does damage to the villain?
Input
The first line contains three integers N, S and D.
The next N lines contain 2 integers, Xi and Yi

Constraints
All values in input are integers.
1 ≤ N ≤ 100
1 ≤ Xi ≤ 109
1 ≤ Yi ≤ 109
1 ≤ S ≤ 109
1 ≤ D ≤ 109
Output
If Newton can do damage to the villain, print Yes; otherwise, print No.
Example
Sample Input 1
4 9 9
5 5
15 5
5 15
15 15

Sample Output 1
Yes

Explaination
The second and fourth powers take too much time to do damage.
Also, the first and second powers do not have enough attacking powers to do damage.
Thus, only the third power can do damage.


Sample Input 2
3 691 273
691 997
593 273
691 273

Sample Output 2
No


Sample Input 3
7 100 100
10 11
12 67
192 79
154 197
142 158
20 25
17 108

Sample Output 3
Yes

Explaination
Only the seventh power can do damage.
*/
