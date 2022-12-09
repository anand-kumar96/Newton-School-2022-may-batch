import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
 class Main {
public static int gcd(int a, int b){
 if(a==0){
     return b;
 }
 return gcd(b%a,a);
}
public static int findGCD(int arr[], int n){
    int S=arr[0];
    for(int i=0;i<n;i++){
        S=gcd(S,arr[i]);
        if(S==1){
            return S;
        }
    }
    return S;
}
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int arr[]=new int[n+1];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    arr[n]=x;
    int arr1[]=new int[n+1];
    for(int i=0;i<n;i++){
        arr1[i]=Math.abs(arr[i+1]-arr[i]);
    }
    arr1[n]=Math.abs(arr[n]-arr[0]);
System.out.println(findGCD(arr1, n+1));
    }
}

/*
Newton Loves Different Cities
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are N distinct cities C1, C2,. . CN on a number line and Newton is currently in city X.

Now he wants to travel to all other cities.

So he wants to choose an integer S such that he can visit all the cities starting from city X using 2 operations:
1) Subtract S from the current city number and go to the resultant city.
2) Add S to the current city number and go to the resultant city.

Find the maximum S such that newton can visit all the N cities.

(Note: He may visit other cities (not in the N cities list) as well in the process to visit all N cities)
Input
The first line of the input consists of 2 integers N and X
The next line contains N different integers C0, C1,. . CN

Constraints:
1 <= N <= 105
1 <= X <= 109
1 <= Ci <= 109
Output
Find the maximum S
Example
Sample Input 1:
3 3
1 11 13

Sample Output 1:
2

Explanation:
Setting S=2 enables you to visit all the cities as follows, and this is the maximum possible S.
Perform Move 2 to travel to coordinate 1.
Perform Move 1 to travel to coordinate 3.
Perform Move 1 to travel to coordinate 5.
Perform Move 1 to travel to coordinate 7.
Perform Move 1 to travel to coordinate 9.
Perform Move 1 to travel to coordinate 11
Perform Move 1 to travel to coordinate 13


Sample Input 2:
3 81
33 129 57

Sample Output 2:
24
*/
