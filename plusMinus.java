package com.hackerrank;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class plusMinus {

	 // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	double[] res = new double[3];
    	
    	for (int val: arr) {
    		if(val > 0) {
    			res[0]++;
    		} else if(val < 0) {
    			res[1]++;
    		} else {
    			res[2]++;
    		}
    	}
    	
    	for (double val: res) {
    		System.out.printf("%.6f", (val/arr.length));
    		System.out.println("");
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
