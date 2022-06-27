package loop;
import java.util.Scanner;
public class AdvancedLoopQuestion {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();


//   Question01
for(int i=1;i<=n;i++) {
for (int j=1;j<=m;j++){
System.out.print("* ");
}
System.out.println();
}
//4 5 --input
// output
//* * * * *
//* * * * *
//* * * * *
//* * * * *

//   Question02

/*
for (int i=1;i<=n;i++) {
for (int j=1;j<=m;j++) {
if(i==1 || i==n || j==1 || j==m){
System.out.print("*");// dont give here space means "* " donot do it
} else{
System.out.print(" ");
}
}
System.out.println();
}

 */

// 4 5   input
//*****
//*   *
//*   *
//*****


//   Question03
/*
int m = sc.nextInt();
for(int i=1;i<=m;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}


 */
//5 --input
//*
//**
//***
//****
//*****


//   Question04
/*
int m = sc.nextInt();
for(int i=1;i<=m;i++){
for(int j=i;j<=m;j++) {
System.out.print("*");
}
System.out.println();
}


 */
//5 --- input
//*****
//****
//***
//**
//*

//   Question05

/*
int m = sc.nextInt();
for(int i=1;i<=m;i++){
for(int j=1;j<=m;j++) {
if(j<=(m-i)){
System.out.print(" ");
}else{
System.out.print("*");
}
}
System.out.println();
}


 */

//5 ----input
//    *
//   **
//  ***
// ****
//*****


//   Question06
/*
int m = sc.nextInt();
 for(int i=1;i<=m;i++){
for(int j=1;j<=m;j++) {
if(j<=i) {
System.out.print(j);
}else{
System.out.print(" ");
}
}
System.out.println();
}

 */
//        9  -- input
//        1
//        12
//        123
//        1234
//        12345
//        123456
//        1234567
//        12345678
//        123456789

    //  Question 07
/*
int m = sc.nextInt();
for(int i=1;i<=m;i++){
for(int j=1;j<=(m-i+1);j++) {
System.out.print(j);
}
System.out.println();
}

 */
    //6
    //123456  ---- input
    //12345
    //1234
    //123
    //12
    //1


    //  Question 07 (b)  this is important question
/*
5 input----

   *
   *^*
   *^^*
   *^^^*
   ******

   */
/*
int N = sc.nextInt();
System.out.println("*");
for (int i = 1; i <= N - 2; i++) {
System.out.print("*");
for (int j = 1; j <= i; j++) {
System.out.print("^");
}
System.out.print("*");
System.out.println();
}
for (int k = 1; k <= N + 1; k++) {
System.out.print("*");
}


 */




    //  Question 08
/*
int m = sc.nextInt();
int num=1;
for(int i=1;i<=m;i++){
for(int j=1;j<=i;j++) {
System.out.print(num + " ");
num++;//num=num+1
}
System.out.println();
}


 */

    //6---input
    //1
    //2 3
    //4 5 6
    //7 8 9 10
    //11 12 13 14 15
    //16 17 18 19 20 21

    //  Question 09
/*
int m = sc.nextInt();
for(int i=1;i<=m;i++){
for(int j=1;j<=i;j++) {
if((i+j)%2==0) {
System.out.print("1 ");
}else{
System.out.print("0 ");
}
}
System.out.println();
}
}
}


 */

//5  --input
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1

}
}
