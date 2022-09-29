//https://my.newtonschool.co/playground/code/7pbz6uf1u1gr/
      #include <bits/stdc++.h>
        #define int long long
        using namespace std;
        vector<int> f(int n){
            vector<int> a={};
            for(int i=1;i<floor(sqrt(n))+1;i++){
                if(n%i==0){
                    a.push_back(i);
                    a.push_back(n/i);
                }
            }
            return a;
        }
        int score(int a,int b){
            int Min=min(a,b);
            int Max=max(a,b);
            while(Min){
            int temp=Min;
            Min=Max%Min;
            Max=temp;
        }
        return a*b/Max;
        }
        signed main() {
        ios::sync_with_stdio(false);cin.tie(0);
        int n;
        cin>>n;
        int arr[n];
        int brr[n];
        for(int i=0;i<n;i++){
            int a,b;
            cin>>a>>b;
            arr[i]=a;
            brr[i]=b;
        }
        vector<int> aa=f(arr[0]);
        vector<int> bb=f(brr[0]);
        vector<pair<int,int>> candidate={};
        for(int i=0;i<aa.size();i++){
        for(int j=0;j<bb.size();j++){
        int tag=1;
        for(int k=0;k<n;k++){
        if(arr[k]%aa[i]==0 and brr[k]%bb[j]==0) continue;
        if(arr[k]%bb[j]==0 and brr[k]%aa[i]==0) continue;
        tag=0;
        }
        if(tag) candidate.push_back(make_pair(aa[i],bb[j]));
        }
        }
        int Max=0;
//cout<<candidate.size();
        for(auto i=candidate.begin();i!=candidate.end();++i){
//cout<<i->first<<" "<<i->second;
        Max=max(Max,score(i->first,i->second));
        }
        cout<<Max;
        }
// java code
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    private static long gcd(long a,long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
    static long lcm(long a, long b) {
        return ((a*b)/ gcd(a, b)); 
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        long A=sc.nextLong();
        long B=sc.nextLong();
        // if(A==0 || B==0){
        //     System.out.println("0");
        //     return;
        // }
        // if(n==1){
        //     System.out.println(lcm(A,B));
        //     return;
        // }
        // for(int i=1;i<n;i++) {
        //     long first=sc.nextLong();
        //     long second=sc.nextLong();
        //     if(gcd(A,first)>gcd(A,second)) {
        //         A=gcd(A,first);
        //         // System.out.println(A);
        //     } else {
        //         A=gcd(A,second);
        //        // System.out.println(A);
        //     }
        //     if(gcd(B,first)>gcd(B,second)) {
        //         B=gcd(B,first);
        //        // System.out.println(B);
        //     } else {
        //         B=gcd(B,second);
        //         //System.out.println(B);
        //     }
        // }
        for (int i=1;i<n;i++) { 
            long first=sc.nextLong();   
            long second=sc.nextLong();
            long A1=gcd(A,first);
            long A2=gcd (A,second); 
            long B1=gcd (B,first);
            long B2=gcd (B,second);
         if(A1+B2>A2+B1){
             A=A1;
             B=B2;
            }
              else{
              A=A2;
              B=B1;
               }
        }
        long result=lcm(A,B);
        System.out.println(result);

    }
    
}

// 1 test Case Failing--> if anyone got answer share with me

/*
Bad Boss (Public Contest: September 2022)
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There lives a boss and initially he has one child whose health is M. Also, initially your score is 0. You are now going to perform some number of moves.

In one move, you will select any alive creature with equal probability. For example, if at some instance there exists the boss and X children, then each of them can be selected with probability 1/(X + 1).

Case 1: The boss was selected. Your score increases by 1.
Case 2: A child was selected. Then, decrease his health by 1. Now if his health reaches 0, he dies. Otherwise, if he does not die and the current number of children is less than K, a new child is born whose health is M.

You are given Q queries. In each query, you are given an integer N. Your task is to find the expected score after completing N moves modulo 998244353.

It can be shown that the answer for each query can be expressed as an irreducible fraction A/B, where A and B are integers and gcd(B, 998244353) = 1. Print the expected score modulo 998244353, in other words, print AB-1 mod 998244353, for each query.
Input
The first line contains a single integer Q – the number of queries.
The second line contains two integers K and M.
Then Q lines follow, each containing a single integer N – the number of moves to perform.

Constraints
1 ≤ Q ≤ 104
1 ≤ K ≤ 6
1 ≤ M ≤ 2
1 ≤ N ≤ 109
Output
Print Q lines, the ith line containing a single integer – the answer to the ith query.
Example
Sample Input 1:
4
2 2
1
2
3
4

Sample Output 1:
499122177
415935148
901192820
603105965

Sample Explanation 1:
In the first move, the probability of selecting the boss is 1/2. Thus, the expected score after the first move is 1/2.

Sample Input 2:
4
2 1
1
2
3
4

Sample Output 2:
499122177
748683266
873463811
935854084
*/
