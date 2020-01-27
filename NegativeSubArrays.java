package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeSubArrays {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();

		int res = 0;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if ((i+ j < n)) {
					int[] temp = Arrays.copyOfRange(arr, j, i + j + 1);
					int sum = 0;
					for (int x = 0; x < temp.length; x++) {
						sum += temp[x];
					}
					
					if (sum < 0) {
						res++;
					}
				}
			}
		}
		
		System.out.println(res);
		
		
	}
}
