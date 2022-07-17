/* Odd subarray
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr of N integers. Find the number of subarrays of this array which are powerful.

A subarray [L, R] (1 <= L <= R <= N) is said to be powerful if the product AL * AL+1 * ... * AR-1 * AR is odd.
Input
First line of input contains a single integer N
Second line of input contains N integers representing the elements of the array Arr


Constraints
1 <= N <= 100000
1 <= Arr[i] <= 100000
Output
Output the number of powerful subarrays of array Arr.
Example
Sample input 1
5
2 4 4 5 3

Sample output 1
3

Sample input 2
3
1 5 1

Sample Output 2
6

Explanation
Test Case1:- (3), (5), (3, 5) are the required subarrays.
Test Case2:- (1), (2), (1), (1, 5), (5, 1]) (1, 5, 1) are the required subarrays.
*/
// brute force approach 
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
       int result = 0;
        for (int i = 0; i <= n - 1; i++) {
            int val = 1;
            for (int j = i; j <= n - 1; j++) {
                val = val * arr[j];
                if (val % 2 != 0)
                    result++;
            }
        }
    System.out.println(result);
    }
}
// tc=0(n^2)  Ts=O(1)


// optimized method   
//   O(n) Time and O(1) Space Method [Efficient] 
/*Efficient Approach: An odd product is possible only by the product of odd numbers.
Thus, for every K continuous odd numbers in the array, the count of sub-arrays 
with the odd product increases by K*(K+1)/2. One way of counting continuous odd 
numbers is to calculate the difference between the indexes of every two consecutive
even numbers and subtract it by 1. For the calculation, -1 and N are considered as indexes of even numbers. 
Below is the implementation of the above approach:
*/

class Main {
   public static long countSubArrayWithOddProduct(int A[],int N){  
    // Initialize the count variable
   long  count = 0;
    // Initialize variable to store the
    // last index with even number
    int last = -1;
    // Initialize variable to store
    // count of continuous odd numbers
    long K = 0;
    // Loop through the array
    for(int i = 0; i < N; i++) {
       // Check if the number
       // is even or not
       if (A[i] % 2 == 0){
           // Calculate count of continuous
           // odd numbers
           K = (i - last - 1);
           // Increase the count of sub-arrays
           // with odd product
           count += (K * (K + 1) / 2);
           // Store the index of last
           // even number
           last = i;
       }
    }
    // N considered as index of
    // even number
    K = (N - last - 1);
    count += (K * (K + 1) / 2);
    return count;
}
 public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(countSubArrayWithOddProduct(arr,n));
    }
}
























