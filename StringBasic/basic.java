package com.company.Newton_School.DSA2.String;

public class basic{
    public static void main(String[] args) {
        String s1="Anand";
        String s2="Anand";
        String s3="Anand kumar";
        String s4="   Anand  kumar  ";
        String s5="What is Your Name?";
        String str1=new String("Anand");
        String str2=new String("Anand kumar");
         // length of string s1
        int len=s1.length();
        System.out.println(len); // 5

          // lower case
         String low=s1.toLowerCase();
        System.out.println(low); // anand

        // upper case
        String up=s1.toUpperCase();
        System.out.println(up);//ANAND

        // trim use
        System.out.println(s4.trim());//Anand  kumar

        // substring
        System.out.println(s1.substring(2)); //and-->start from index 2 to till end
        System.out.println(s5.substring(3,12)); //t is Your--> give substring start from 3 and till 11 , 12 excluded

        // returning char of string
        System.out.println(s1.charAt(1));// n
        System.out.println(s1.charAt(3)); // n
        //System.out.println(s1.charAt(8)); // show error out of index

        // concatenation of string
        String concat=s1+s3; // concatenating two object
        System.out.println(concat);//AnandAnand kumar
        String conc="Anand"+"kumar"+"Aryan";
        System.out.println(conc);//AnandkumarAryan
        String con=s1.concat(s4);// using method
        System.out.println(con); //Anand   Anand  kumar

        // index of string first occur ance
        System.out.println(s1.indexOf("nd"));//3
        System.out.println(s4.indexOf("kumar"));//10
        // index of string first occur ance from specified index
        System.out.println(s4.indexOf("na",5));//-1  not found
        System.out.println(s4.indexOf("a",5));//5
        // index of string last occur ance
        System.out.println(s1.lastIndexOf("n"));//3

        // equality check
        //using method
        boolean x=s1.equals(s2); // true
        boolean y=s1.equals(str1); //true
        boolean z=s1.equals(str2);// false
        System.out.println(x+" "+y+" "+z); // true true false
        // means no role of string pool concept because this method check char to char
        // using == operator
        boolean x1=(s1==s2); // true // same string pool with same reference
        boolean y1=(s1==str1); // false due to string pool literal
        boolean z1=(s1==str2);// false
        System.out.println(x1+" "+y1+" "+z1); //true false false

        // compare to method
        System.out.println(s1.compareTo(s2));// 0-->becoz first letter of both is a -->a=1 and a=1-->1-1 =0
        System.out.println(s1.compareTo(s5)); // -22 -->1-23=-22
        System.out.println(s5.compareTo(s1));//22

        // replacing the char
        System.out.println(s1.replace("n","Singh")); //ASinghaSinghd
        System.out.println(s3.replace("a","2509"));//An2509nd kum2509r


        // checking char present or not
        System.out.println(s1.contains("and"));//true
        System.out.println(s1.contains("ravi"));//false
        System.out.println(s5.contains("What"));//true

     // empty string
        System.out.println(s1.isEmpty());// false
        String s0="";
        System.out.println(s0.isEmpty());// true





        }
}

