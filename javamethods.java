package com.softwaretestinghelp;
 
public class DemoClass{
 
 public static void main (String[] args){
    System.out.println("Hello , this is sample program");   
    double d = Math.random();
    System.out.println("Random Number:"+d);
 }

 //hdfc101 changes by satya
 public static void sampleMethod(int a, int b) throws ArithmeticException{
        System.out.println("Hello, this is sample method");
        int c = a/b; //  int c = 4/2 which gets calculated as 2 
        System.out.println("c:"+c); // c: 2
   } 
 //hdfc100 changes
 public static void main (String[] args){
    DemoClass.sampleMethod(4,2);     
 }
 
}
