package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BreakingRecords {
	// Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
    	int[] res = new int[2];
    	
    	int lowIndex = scores[0];
		int highIndex = scores[0];
    	for (int i = 1; i < scores.length; i++) {
    		
    		if (scores[i] > highIndex) {
    			highIndex = scores[i];
    			res[0]++;
    		}
    		
    		if (scores[i] < lowIndex) {
    			lowIndex = scores[i];
    			res[1]++;
    		}
    		
    	}
    	
    	return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
        	System.out.println(String.valueOf(result[i]));

            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
            	System.out.println(" ");
            }
        }

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
