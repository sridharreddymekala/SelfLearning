package com.hackerrank;

import java.util.BitSet;
import java.util.Scanner;

public class BitwiseOperators {
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		BitSet[] bsArray = new BitSet[3];
		BitSet B1 = new BitSet(n);
		BitSet B2 = new BitSet(n);
		bsArray[1] = B1;
		bsArray[2] = B2;
		
		for (int i = 0; i< m; i++) {
			
			String operation = scan.next();
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			if ("AND".equalsIgnoreCase(operation)) {
				bsArray[x].and(bsArray[y]);
				System.out.println(bsArray[1].cardinality() + " " + bsArray[2].cardinality());
			} else if ("OR".equalsIgnoreCase(operation)) {
				bsArray[x].or(bsArray[y]);
				System.out.println(bsArray[1].cardinality() + " " + bsArray[2].cardinality());
			} else if ("XOR".equalsIgnoreCase(operation)) {
				bsArray[x].xor(bsArray[y]);
				System.out.println(bsArray[1].cardinality() + " " + bsArray[2].cardinality());
			} else if ("FLIP".equalsIgnoreCase(operation)) {
				bsArray[x].flip(y);
				System.out.println(bsArray[1].cardinality() + " " + bsArray[2].cardinality());
			} else if ("SET".equalsIgnoreCase(operation)) {
				bsArray[x].set(y);
				System.out.println(bsArray[1].cardinality() + " " + bsArray[2].cardinality());
			}
		}
		scan.close();
    }
}
