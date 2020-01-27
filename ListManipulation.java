package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListManipulation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		List<Integer> L = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			L.add(scan.nextInt());
		}
		
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {

			String s1 = scan.next();
			int x = scan.nextInt();
			
			if ("Insert".equalsIgnoreCase(s1)) {
				int y = scan.nextInt();
				
				L.add(x,y);
			} else if ("Delete".equalsIgnoreCase(s1)) {
				L.remove(x);
			}
			
		}
		scan.close();
		
		for (Integer i: L) {
			System.out.print(i + " ");
		}
		
	}
}
