package com.hackerrank;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class BirthdayCakeCandles {
	 // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
    	int max_val = Integer.MIN_VALUE;
    	Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
    	
    	for(int a: ar) {
    		Integer j = intMap.get(a); 
    		intMap.put(a, (j == null) ? 1 : j + 1); 
    	}
    	
    	for (Entry<Integer, Integer> entry: intMap.entrySet()) {
    		if (entry.getKey() > max_val) {
    			max_val = entry.getKey();
    		}
    	}
    	
    	return intMap.get(max_val);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        System.out.println(String.valueOf(result));
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
