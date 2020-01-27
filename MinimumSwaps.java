package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MinimumSwaps {
	
	static boolean checkStatus(int[] arr) {
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) {
			if ((i+1) != arr[i]) {
				flag = true;
				break;
			}
		}
		
		return flag;
	}
	
	// Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	int res = 0;

    	while (checkStatus(arr)) {
    		for (int i = 0; i < arr.length; i++) {
        		
        		if ((i+1) != arr[i]) {
        			res++;
        			int temp_val = arr[arr[i] - 1];
        			arr[arr[i] - 1] = arr[i];
        			arr[i] = temp_val;
        			
        		}
        		
        	}
    	}
    	
    	
    	return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        System.out.println(String.valueOf(res));
//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
