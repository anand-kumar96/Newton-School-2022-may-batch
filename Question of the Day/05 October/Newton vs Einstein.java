//https://my.newtonschool.co/playground/code/lfi6kugo76j1/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int P=sc.nextInt();
    int Q=sc.nextInt();
    int R=sc.nextInt();
    int S=sc.nextInt();
    if(Q==0 && S!=0){
    System.out.println("No");
    return;
    }
    if(Q!=0 && S==0){
    System.out.println("Yes");
    return;
    }
    while(P>0 && R>0){
        R=R-Q;
        if(R<=0){
    System.out.println("Yes");
    return;
        }
    P=P-S; 
    if(P<=0){
    System.out.println("No");
    return;
    }
    }
    // if(R%Q<=P%S){
    //     System.out.println("Yes");
    // }else
    //  System.out.println("No");
    }
}

/*
Newton vs Einstein
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton and Einstein are fighting each other and each has some healthpoints and some attackpoints.

Newton has P HealthPoints and Q AttackPoints whereas Einstein has R HealthPoints and S AttackPoints.

Newton attacks first followed by Einstein. They attack alternately then.
Each attack on a person decreases his healthpoints by a total amount of the attacking points of the attacker.

A person would lose if his healthpoints become 0 or less than 0.

Print "Yes" is Newton wins, otherwise "No" (The output is case sensitive)
Input
The first and the only line of the input consists of 4 integers, P, Q, R and S

Constraints:
1 <= P, Q, R, S <= 100
Output
Output the answer in a single line
Example
Sample Input 1:
10 9 10 10

Sample Output 1:
No


Sample Input 2:
46 4 40 5

Sample Output 2:
Yes
*/
