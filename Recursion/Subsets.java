/*
Subsets
Hard

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of integers that might contain duplicates, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
The subsets must be sorted lexicographically.
Input
First line of input contains number of testcases T. For each testcase, there will be two line of input, 
first of which contains N and next contains N space seperated integers. Every test case has two lines. First line is N, size of array.

Constraints:
1 <= T <= 500
1 <= N <= 12
1 <= x <= 9
Output
One line per test case, every subset enclosed in () and in every set intergers should be space seperated.(See example)
Example
Sample Input:
2
3
1 2 2
4
1 2 3 3

Sample Output:
()(1)(1 2)(1 2 2)(2)(2 2)
()(1)(1 2)(1 2 3)(1 2 3 3)(1 3)(1 3 3)(2)(2 3)(2 3 3)(3)(3 3)

Explanation:
Testcase 1: Subsets are
[
[],
[1],
[1,2],
[1,2,2],
[2],
[2, 2]
]
*/
//code
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void subsets(int[] nums,int n,List<Integer> temp,List<List<Integer>> res)
    {
        if(n==nums.length)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[n]);
        subsets(nums,n+1,temp,res);
        temp.remove(temp.size()-1);
        subsets(nums,n+1,temp,res);
    }
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        subsets(nums,0,temp,res);
        return res;
    }
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int tc=sc.nextInt();
    for(int t=0;t<tc;t++){
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int ans=subsets(arr);
      System.out.print(ans+" ");
      System.out.println();
    }
    }
}
