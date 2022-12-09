import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       int N=Integer.parseInt(br.readLine());
       int[] A=new int[N];
       int[] B=new int[N];
       int max_value=Integer.MAX_VALUE;
       int min=-1;
       for(int i=0; i<N; i++) {
           String[] str=br.readLine().split(" ");
           A[i]= Integer.parseInt(str[0]);
           B[i]= Integer.parseInt(str[1]);
           if(A[i] < max_value){
               max_value=A[i];
               min=i;
           }
       }

       int ans=Integer.MAX_VALUE;
       for(int i=0; i< N; i++) {
           if(i != min){
               int result=Math.max(max_value, B[i]);
               ans=Math.min(ans, result);
           }else{
               int result=A[i] + B[i];
               ans=Math.min(ans, result);
           }
       }
       System.out.println(ans);
    }
}
/*
Assignment
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A class has N students, called student 1 through N.
Teacher gave them two assignments, called assignment A and B.
Studenti can complete assignment A in Ai minutes and assignment B in Bi minutes.

Newton as a class monitor takes responsibility for completing the assignments in the shortest possible time.

Newton can assign each work to one student. You can assign both works to the same student, in which case the time it takes for him/her to complete them is the sum of the times it takes for him to do them individually.

If Newton assigns the works to different students, the time it takes for them to complete is the maximum of the time each student takes to complete their respective assignment.

Find the shortest possible time needed to complete the assignments.
Input
The first line contains one integer N.
The next N lines contain 2 integers, Ai and Bi.

Constraints
2 ≤ N ≤ 1000
1 ≤ Ai ≤ 105
1 ≤ Bi ≤ 105
All values in input are integers.
Output
Print the shortest possible time needed to complete the assignments, in minutes.
Example
Sample Input 1
3
8 5
4 4
7 9

Sample Output 1
5

Explaination
If Newton assigns Assignment A to Employee 2 and Assignment B to student 1, they will complete them in 4 and 5 minutes, respectively.
Since you assigned the Assignments to different students, it will take max(4, 5)=5 minutes for the two Assignments to be finished.
It is impossible to finish them earlier.


Sample Input 2
3
11 7
3 2
6 7

Sample Output 2
5

It is optimal to assign both Assignments to student 2.
Note that if Newton assigns both Assignments to the same student, the time it takes for him/her to complete them is the sum of the times it takes for him/her to do them individually.
*/
