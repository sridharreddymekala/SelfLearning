package com.hackerrank;

import java.util.Scanner;

public class OutputFormatting {
	 public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.next();
             int x=sc.nextInt();

             System.out.printf("%-15s%03d", s1, x);
             System.out.println("");
             
         }
         sc.close();
         System.out.println("================================");

 }
}
