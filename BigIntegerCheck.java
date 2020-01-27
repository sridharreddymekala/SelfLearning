package com.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerCheck {
	public static void main(String[] args) {
       
		Scanner scan = new Scanner(System.in);
		
		String s1 = scan.next();
		String s2 = scan.next();
		
		scan.close();
		
		BigInteger b1 = new BigInteger(s1);

		BigInteger b2 = new BigInteger(s2);
		
		System.out.println(b1.add(b2));
		System.out.println(b1.multiply(b2));
		
    }
}
