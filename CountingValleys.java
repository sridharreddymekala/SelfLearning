package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {
	// Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	int res = 0;
    	int step = 0;
    	
    	for (char hike: s.toCharArray()) {
    		
    		if (hike == 'U') {
    			if (step == -1 && (step + 1) == 0) {
    				res++;
    			}
    			step++;    			
    		} else {
    			step--;
    		}
    	
    	}
    	
    	return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(String.valueOf(result));
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
