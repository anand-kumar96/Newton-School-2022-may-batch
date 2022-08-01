/*
Walter White Easy
Hard

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Walter white is considered very intelligent person. He has a problem to solve.
As he is suffering from cancer, can you help him solve it?
Given two integer arrays C and S of length c and s respectively.
Index i of array S can be considered good if a subarray of length c can be formed starting from index i which is complimentary to array C.
Two arrays A, B of same length are considered complimentary if any cyclic permutation of A satisfies the property (A[i]- A[i-1]=B[i]-B[i-1]) 
for all i from 2 to length of A (1 indexing).
Calculate number of good positions in S .
Cyclic Permutation
1 2 3 4 has 4 cyclic permutations 2 3 4 1, 3 4 1 2, 4 1 2 3,1 2 3 4
Input
First line contains integer s (length of array S).
Second line contains s space separated integers of array S.
Third line contain integer c (length of array C).
Forth line contains c space separated integers of array C.

Constraints:
1 <= s <=1000000
1 <= c <=1000000
1 <= S[i], C[i] <= 10^9
Output
Print the answer.

Example
Input :
9
1 2 3 1 2 4 1 2 3
3
1 2 3

Output :
4
Explanation :
index 1- 1 2 3 matches with 1 2 3
index 2- 2 3 1 matches with 2 3 1(2 3 1 is cyclic permutation of 1 2 3)
index 3- 3 1 2 matches with 3 1 2(3 1 2 is cyclic permutation of 1 2 3)
index 7- 1 2 3 matches with 1 2 3

Input :
4
3 4 3 4
2
1 2

Output :
3
*/

// code

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        int[] arr= new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        int arr_2nd[]=new int[c];
        for(int i=0;i<c;i++){
            arr_2nd[i]=sc.nextInt();
        }
        int count=0;        //counting no. of matching 
        for(int i=0;i<c;i++){       //for loop for comparison of every permutation of arr_2nd
            //first array_2nd check
            //System.out.println();
            for(int j=0;j<s-c-1;j++){// agr me j<=s-c+1 kr du to test case 16 bhi chalta h
                boolean flag =false;
                if(arr_2nd[0]==arr[j] ){
                    //code
                    for(int m=1;m<c;m++){
                        if(arr_2nd[m]==arr[j+m]){
                            if(m==(c-1)){
                                flag=true;
                            }
                        }
                        // else{
                        //     break;
                        // }
                    }
                    if(flag){
                        j=j+c-1;   //because flag true so thats why j increase by arr_2nd length
                        count++;
                    }
                }
            }
            // now cyclic perputation
            for(int j=1;j<c;j++){       //for loop for right shift
                int temp=arr_2nd[j];
                arr_2nd[j]=arr_2nd[j-1];
                arr_2nd[j-1]=temp;
            }
            // for(int k=0;k<c;k++){   //printing elements
            //     System.out.print(arr_2nd[k]+" ");
            // }
        }
        //System.out.println();
        System.out.print(count);
        
    }
}
