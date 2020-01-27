package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MatchingStrings {
	// Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
    	int[] res = new int[queries.length];

    	for (int i = 0; i < queries.length; i++) {
    		int cnt = 0;
    		for (int j = 0; j < strings.length; j++) {
    			if (queries[i].equalsIgnoreCase(strings[j])) {
    				cnt++;
    			}
    		}
    		res[i] = cnt;
    	}
    	
    	return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
//            bufferedWriter.write(String.valueOf(res[i]));
        	System.out.println(String.valueOf(res[i]));

            if (i != res.length - 1) {
//                bufferedWriter.write("\n");
            	System.out.println("\n");
            }
        }

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
