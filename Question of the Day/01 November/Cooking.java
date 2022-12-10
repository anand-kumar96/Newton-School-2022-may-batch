import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        int k=Integer.parseInt(str[2]);
        int a[]=new int[n];
		int b[]=new int[m];
        str=br.readLine().split(" ");
        for(int i=0; i<n; i++){
        a[i]=Integer.parseInt(str[i]);
        }
        str=br.readLine().split(" ");
        for(int i=0;i<m;i++){
        b[i]=Integer.parseInt(str[i]);
        }
		long t=0;
		for(int i=0;i<m; i++){
		t +=b[i];
		}
		long  ans=0;
		int j=m;
		for(int i=0; i<=n; i++){
		while(j > 0 && t > k)
		{
		j--;
		t -= b[j];
		} 
		if(t > k)
		break; 
		ans=Math.max(ans, i+j);
		    if(i==n)
		    break; 
		    t += a[i];
		}
		System.out.println(ans);	 
    }
}

/*
Cooking
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
We have two chefs: A and B. Chef A wants to cook N dishes, and Chef B similarly wants to cook M dishes.

Chef A takes Ai minutes to cook the i- th dish(1≤i≤N), and Chef B takes Bi minutes to cook the i- th dish(1≤i≤M).

Consider the following action:
Choose a Chef with a dish remaining, and cook the topmost dish.

Note: A dish can only be cooked once.

We want to know that in K minutes, How many dishes can we cook at most by repeating this action?
Input
The first line contains three integers, N, M, and K.
The second line contains N integers A1, A2 ... AN.
The third line contains M integers B1, B2 ... BM.

Constraints
1 ≤ N, M ≤ 200000
1 ≤ K ≤ 10 ^ 9
1 ≤ Ai, Bi ≤ 10 ^ 9
All values in input are integers.
Output
Print an integer representing the maximum number of dishes that can be cooked.
Example
Sample Input 1
3 4 240
60 90 120
80 150 80 150

Sample Output 1
3
In this case, it takes us 60, 90, 120 minutes to cook the 1- st, 2- nd, 3- rd dishes from Chef A, and 80, 150, 80, 150 minutes to cook the 1- st, 2- nd, 3- rd, 4- th dishes from Chef B, respectively.

We can cook three dishes in 230 minutes, as shown below, and this is the maximum number of dishes we can cook within 240 minutes.

Cook the 1st dish from Chef A in 60 minutes.
Cook the 1st dish from Chef B in 80 minutes.
Cook the 2nd dish from Chef A in 90 minutes.

Sample Input 2
3 4 730
60 90 120
80 150 80 150

Sample Output 2
7

Sample Input 3
5 4 1
1000000000 1000000000 1000000000 1000000000 1000000000
1000000000 1000000000 1000000000 1000000000

Sample Output 3
0
Watch out for integer overflows.
*/
