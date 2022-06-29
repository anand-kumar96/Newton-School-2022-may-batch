package com.company.Newton_School.Basic_programming.math;
import java.util.Scanner;
public class k_circle_sum {
   // method 01

//        static void  kCircleSum(int arr[],int n,int k){
//
//            for(int i=0;i<n;i++){
//                int sum=0;
//                for(int j=i;j<(i+k);j++){
//                    sum=sum+arr[j%n];
//                }
//                System.out.print(sum+ " ");
//            }
//        }


//    public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt();
//            int k=sc.nextInt();
//            int arr[]=new int[n];
//            for(int i=0;i<n;i++){
//                arr[i]=sc.nextInt();
//            }
//        kCircleSum(arr,n,k);
//
//
//    }
//
//}
 // tc=O(n^2)  so tle coming

// got tle error so optimize solution is below:
 // using sliding window concept

// method 02

    static void  kCircleSum(int arr[],int n,int k){
        int sum=0;
        for(int i=0;i<k;i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum+ " ");
            for(int i=1;i<n;i++){
                sum=sum-arr[i-1];
                sum=sum+arr[(i+k-1)%n];
                System.out.print(sum+ " ");
            }

        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        kCircleSum(arr,n,k);


    }

}
