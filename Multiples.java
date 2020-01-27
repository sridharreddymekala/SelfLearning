package com.hackerrank;

import java.util.Scanner;

public class Multiples {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {
        	
        	System.out.printf(N + " x " + i + " = %d%n", N*i);
        	
        }
        
        scanner.close();
    }
}
