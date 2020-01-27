package com.hackerrank;

import java.util.Scanner;

public class JavaStdInStdOut2 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        double d = scan.nextDouble();	
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
	
}
