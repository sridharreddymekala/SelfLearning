package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {
	// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	long res = 0;
    	int instances = 0;
    	for (char check: s.toCharArray()) {
    		if (check == 'a') {
    			instances++;
    		}
    	}
    	
    	long repetitions = n/s.length();
    	res = instances * repetitions;
    	for (int i = 0; i < n%s.length(); i++) {
    		if (s.charAt(i) == 'a') {
    			res++;
    		}
    	}
    	
    	return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(String.valueOf(result));
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
