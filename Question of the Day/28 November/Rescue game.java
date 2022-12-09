import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    if(k>=n){
        System.out.println("0");
        return;
    }
    int monster[]=new int[n];
    for(int i=0;i<n;i++){
        monster[i]=sc.nextInt();
    }
    Arrays.sort(monster);
    int j=n-1;
    while(k>0){
        monster[j]=-1;
        j--;
        k--;
    }
    long sum=0;
    for(int i=0;i<(n-k);i++){
        if(monster[i]!=-1){
            sum+=monster[i];
        }
    }
    System.out.println(sum);
    }
}

/*
Rescue game
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
To rescue a hostage, Spiderman has to fight with N monsters.

The health of the i-th monster is Hi.

Spiderman can do the following two operations:
Operation 1: Chooses one monster and decrease it’s health by 1.
Operation 2: Chooses one monster and his health will become 0.

Spiderman wins when all the monster's healths become 0 or below.
Note: he can use operation 2 only at most K times.

Find the minimum number of times Spiderman needs to do operation1 before winning.
Input
The first line contains two integers, N and K.
The second line contains N integers A1, A2 ... AN.

Constraints:
1 <= N <= 2×105
0 <= K <= 2×105
1 <= Hi <= 109
Output
Find the minimum number of times Spiderman needs to do operation1 before winning.
Example
Sample Input 1
3 1
4 1 5

Sample Output 1
5
By using operation2 on the third monster, and doing operation1 four times on the first monster and once on the second monster, spiderman can win with five operation1.

Sample Input 2
8 9
7 9 3 2 3 8 4 6

Sample Output 2
0
He can use operation2 on all the monsters.

Sample Input 3
3 0
1000000000 1000000000 1000000000

Sample Output 3
3000000000
Watch out for overflow.
*/
