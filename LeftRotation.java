package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
	
	public static void leftRotate(int d, int[] arr) {
		int[] newArr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int newIndex = (i + (arr.length - d))%arr.length;
			newArr[newIndex] = arr[i];
		}
		
		for (int val: newArr) {
			System.out.print(val + " ");
		}
	}
	
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        leftRotate(d, a);
        
        scanner.close();
    }
}
