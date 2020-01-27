package com.hackerrank;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();
		StringBuffer sb = new StringBuffer(A);
		sb.reverse();
		
		if (A.compareTo(sb.toString()) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
