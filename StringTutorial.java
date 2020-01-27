package com.hackerrank;

import java.util.Scanner;

public class StringTutorial {

	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        sc.close();
	        
	        int sum = A.length() + B.length();
	        System.out.println(sum);
	        
	        if (A.compareTo(B) <= 0) {
	        	 System.out.println("No");
	        } else {
	        	 System.out.println("Yes");
	        }
	        
	        A = A.replace(A.substring(0,1), A.substring(0,1).toUpperCase());
	        B = B.replace(B.substring(0,1), B.substring(0,1).toUpperCase());
	       
	        System.out.println(A + " " + B);
	    }
	 
}
