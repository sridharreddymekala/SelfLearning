package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		List<List<Integer>> dynamicList = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			
			String[] s = sc.nextLine().split(" ");
			List<Integer> rowList = new ArrayList<Integer>();
			for (String s1: s) {
				rowList.add(Integer.parseInt(s1));
			}
			dynamicList.add(rowList);
		}

		int q = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < q; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (dynamicList.size() > x) {
				List<Integer> rowList = dynamicList.get(x - 1);
				
				if (rowList.size() > y) {
					System.out.println(rowList.get(y));
				} else {
					System.out.println("ERROR!");
				}
				
			} else {
				System.out.println("ERROR!");
			}
			
		}
		sc.close();
	}
}
