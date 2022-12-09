import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Queue<Integer> monster =new PriorityQueue<>();
		for(int i=0; i<n; i++){
		    monster.add(sc.nextInt());
		}
		while(monster.size() >= 2){
		    int min=monster.poll();
		    int secondMin=monster.poll();
		    if(secondMin % min != 0){
		    monster.add(secondMin % min);
		    }
		    monster.add(min);
		}
		System.out.println(monster.peek());
    }
}
/*
Monster Pain
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are some monsters troubling Newton. He wants to get rid of as many monsters as possible.

Coincidentally the monsters also don't like each other. So Newton got an idea and he gathered all the N monsters together in a pit.

Now all the monsters started attacking each other. They all have some health and the health of the i- th monster is Hi. A monster dies when its health becomes less than 1. When a monster attacks another monster, the health of monster that is attacked is reduced by an amount that is equal to the health of the attacking monster.

Since a single monster will always remain alive in the end, find out the minimum possible health of the last alive monster.
Input
The first line of the input contains a single integer N
The second line of the input contains N space separated integers H1, H2,. ., HN
Output
Find the minimum possible final health of the last alive monster.
Example
Sample Input 1:
4
2 20 10 30

Sample Output 1:
2

Explanation
The first monster will attack and kill all the remaining monsters.


Sample Input 2:
4
5 13 8 20000

Sample Output 2:
1


Sample Input 2:
4
5 5 5 5

Sample Output 2:
5
*/
