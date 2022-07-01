package com.company.Newton_School.collection;
import java.util.Scanner;
public class Array_add_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter element to be added at end");
        int p=sc.nextInt();
        System.out.println("Enter the array element");
        int arr1[]=new int[n];
        int arr2[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        arr2[n]=p;
        arr1 = arr2; // copying all value of arr2 in arr1or arr1 and arr2 becoming copy of each other
        for(int i=0;i<n+1;i++){
            System.out.print(arr1[i]+" ");
        }
  }
}
