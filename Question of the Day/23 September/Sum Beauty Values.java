import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  static long m=1000000007;
        public static long check(String query,int arr[],String str[]){
            long sum=0;
            for(int i=0;i<str.length;i++){
                if(str[i].startsWith(query)==true){
                    sum+=arr[i];
                }
            }
            return sum%m;
        }
        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int q=sc.nextInt();
            String str[]=new String[n];
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                str[i]=sc.next();
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<q;i++){
                System.out.println(check(sc.next(),arr,str));
            }
        }
    }


/*
Sum Beauty Values (QOTD)
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given N binary strings (strings consisting of only 1's and 0's) and each binary string has been assigned a beauty value.
Now you have to answer Q queries, each query contains a String S. You need to find the sum of beauty values of all those strings of which string S is a prefix. 
Sum can be very large so output the sum after modulo with 109 + 7.
Input
The first line contains N, number of strings and Q, the number of Queries.
The next N lines contain string A and its beauty value denoted by p.
The next Q lines contain string S.

Constraints:
1 <= N, Q <= 105
1 <= |A|, |S| <= 10
1 <= p <= 1012
Output
Print the sum of beauty values of all those strings of which string S is a prefix.
Example
Sample Input:
5 4
101 5
000 3
001 5
010 1
111 9
00
1
0
011

Sample Output:
8
14
9
0





//https://my.newtonschool.co/playground/code/lg4f1bow2x77/
*/
