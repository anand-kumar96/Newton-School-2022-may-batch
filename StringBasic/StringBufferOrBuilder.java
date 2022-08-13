package com.company.Newton_School.DSA2.String;

public class StringBufferOrBuilder {
    public static String reverseString(String value){
        StringBuilder sb=new StringBuilder(value);
       sb.reverse();
        String result=sb.toString();
        return result;


    }
    public static void main(String[] args) {
        //mutate/modify -> stirng
        StringBuilder sb= new StringBuilder();

        // append(method)
        sb.append("Anand");
        System.out.println(sb);//Anand
        sb.append("2509");
        System.out.println(sb);//Anand2509

        // length
        System.out.println(sb.length());//9
        //capacity
        System.out.println(sb.capacity());//16-->default

        // insert method
        sb.insert(2,"Singh");
        System.out.println(sb); //AnSinghand2509

        // replace method
        sb.replace(1,3,"Aryan");
        System.out.println(sb);//AAryaninghand2509-->index 3 excluded
        // dlete method
        sb.delete(1,5);
        System.out.println(sb);//Aninghand2509  --> 5 excluded

        // give index of char of stringbuilder
        System.out.println(sb.charAt(6));//a

        //set char
        sb.setCharAt(2,'R');
        System.out.println(sb);//AnRnghand2509

        // reverse the String
        String name="Anand";
        String ans=reverseString(name);
        System.out.println(ans);//dnanA

        // using array reversing
        char cha[]=name.toCharArray();
        for(int i=cha.length-1;i>=0;i--){
            System.out.print(cha[i]+""); //dnanA
        }



    }

}
