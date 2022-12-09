import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int k=Integer.parseInt(str[1]);
        int[] a=new int[n];
        str=sc.nextLine().split(" ");
        for(int i=0;i<n;i++){
        a[i]=Integer.parseInt(str[i]);
        }
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0; i < k; i++){
		map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
		int max=map.size();
		for(int i=k; i<n;i++){
		    map.put(a[i-k], map.get(a[i-k]) -1);
		    if(map.get(a[i-k]) ==0)
		    map.remove(a[i-k]);
		map.put(a[i], map.getOrDefault(a[i], 0) +1);
		max=Math.max(max, map.size());
		}
		System.out.println(max);
    }
}

/*
Colorful Boxes
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are N boxes and ci denotes the colour of the i- th box (1<=i<=N)

From this row, Bob can choose K consecutive boxes and get them. But Bob wants to get the maximum possible distinct colours of boxes.

Print the maximum possible number of distinct colours in the boxes he gets.
Input
The first line contains two integers, N and K.
The second line contains N integers c1, c2 ... cN.

Constraints
1 ≤ K ≤ N ≤ 3×10^5
1 ≤ ci ≤ 10^9
All values in input are integers.
Output
Print the maximum possible number of distinct colours in boxes Bob gets.
Example
Sample Input 1
7 3
1 2 1 2 3 3 1

Sample Output 1
3
If Bob gets the 3- rd through 5- th Boxes, they will have 3 distinct colors, which is the maximum possible number.

Sample Input 2
5 5
4 4 4 4 4

Sample Output 2
1
Bob can get all of these boxes, but they are in a single color.

Sample Input 3
10 6
304621362 506696497 304621362 506696497 834022578 304621362 414720753 304621362 304621362 414720753

Sample Output 3
4
*/
