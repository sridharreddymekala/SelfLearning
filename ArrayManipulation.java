package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulation {
	// Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
    	long res = Long.MIN_VALUE;
    	long[] indexArr = new long[n + 2];
    	
    	for (int i = 0; i < queries.length; i++) {
			
			indexArr[queries[i][0]] += queries[i][2];
			indexArr[queries[i][1] + 1] -= queries[i][2];
			
    	}
    	
    	long max = 0;
    	for (long val: indexArr) {
    		max += val;
    		if (max > res) {
    			res = max;
    		}
    	}
    	
    	return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    	Calendar startTime = Calendar.getInstance();
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);
        System.out.println(String.valueOf(result));
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
        Calendar endTime = Calendar.getInstance();
        System.out.println("Time: " + endTime.compareTo(startTime));
    }
}
