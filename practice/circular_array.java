package com.company.Newton_School.Basic_programming.math;

public class circular_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=9;
        // print in 3 4 5 6 7 8  9 1 2  fashion
        for(int i=2;i<(2+n);i++){
            System.out.print(arr[i%n]+" ");
        }
    }
}
