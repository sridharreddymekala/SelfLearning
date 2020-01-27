package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SockMerchant {
	// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	int res = 0;
    	List<String> sockMisPaired = new ArrayList<String>();
    	
    	for (int i = 0; i < ar.length; i++) {
    		
    		if (!sockMisPaired.contains("" + ar[i])) {
    			sockMisPaired.add("" + ar[i]);
    		} else {
    			sockMisPaired.remove("" + ar[i]);
    		}
    	}
    	
    	res = (ar.length - sockMisPaired.size())/2;
    	
    	return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(String.valueOf(result));
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
