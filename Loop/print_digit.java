static void Print_Digits(int N){
String str=" ";
while(N>0){
    int ans=N%10;
    if(ans==0){
        str="zero "+str;
    }else if(ans==1){
        str="one "+str;
    }else if(ans==2){
        str="two "+str;
    }else if(ans==3){
        str="three "+str;
    }else if(ans==4){
        str="four "+str;
    }else if(ans==5){
        str="five "+str;
    }else if(ans==6){
        str="six "+str;
    }else if(ans==7){
        str="seven "+str;
    }else if(ans==8){
        str="eight "+str;
    }else if(ans==9){
        str="nine "+str;
    }
    N=N/10;
}
System.out.println(str);
}

/*
Print Digits
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a natural number N, your task is to print all the digits of the number in words. The words have to separated by space and in lowercase english letters.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Print_Digit() that takes integer N as a parameter.

Constraints:-
1 <= N <= 10000000
Output
Print the digits of the number as shown in the example.

Note:- Print all digits in lowercase English letters
Example
Sample Input:-
1024

Sample Output:-
one zero two four

Sample Input:-
2

Sample Output:-
two
*/
