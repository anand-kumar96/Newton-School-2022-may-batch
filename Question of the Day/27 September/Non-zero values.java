//https://my.newtonschool.co/playground/code/gyxq1sjmhl4y/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int count=0;
    int n=sc.nextInt();
    int m=sc.nextInt();
    for(int i=0;i<n*m;i++){
        if(sc.nextInt()!=0){
            count++;
        }
    }
    System.out.println(count);
    }
}

/*
Non-zero values
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Print the number of values in the array that are NOT zeros for a n*m dimensional array
Input
1st line : space separated values for n and m
Next n lines: m space separated values
Output
Number of nonzero values in the array
Example
Input:
3 3
0 0 0
0 0 1
1 0 2

Output:
3
*/
