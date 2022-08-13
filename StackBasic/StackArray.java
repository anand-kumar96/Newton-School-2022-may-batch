package com.company.Newton_School.DSA2.stack;
import java.util.Stack;
 class ArrayStack{
     int size;
     int stack[];// creating stack array
     int top=-1;
     ArrayStack(int sz){
         size=sz;
         stack=new int[size]; // initializing array size

     }
     //operation
     void push(int val){ // add value
         if(top==size-1) {  // stack full  // or--> top+1==size
             System.out.println("Stack is full");
         }else
         top++;
         stack[top]=val;
     }
     void pop(){ // delete top or remove top of element
         if(top==-1) { // stack is empty
             System.out.println("Stack ios empty");
         }
         else {
             top--;
         }

     }
     int peek(){ // give top or peak value
         int val=-1;
         if(top<0){
             System.out.println("Stack is empty");
         }else
             val=stack[top];
         return val;

     }

 }
public class StackArray {
    public static void main(String[] args) {
       // ArrayStack stack=new ArrayStack(3);
       // stack.pop();
//        stack. push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.pop();
      //  System.out.println(stack.peek());
        //using package
        Stack<Integer>stack=new Stack<>(); // using package
        stack. push(10); // add value
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop(); // delete top or remove top of element
        System.out.println(stack.peek());
        System.out.println(stack); //[10, 20, 30]
        System.out.println(stack.isEmpty()); // boolean check empty stack or not
        int pos=stack.search(20);
        System.out.println(pos); // 2
       /// System.out.println(stack.search(20));


       // int search(Object element) Searches for element in the stack.
        // If found, its offset from the top of the stack is returned. Otherwise, -1 is returned.


    }
}
