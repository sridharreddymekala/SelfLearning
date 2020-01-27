package com.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GetTotalX {
	/*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {

    	int res = 0;
    	
    	for (int i = a.get(a.size() - 1), j = 1; i <= b.get(0); i = a.get(a.size() - 1) * ++j) {
    		boolean flag = Boolean.TRUE;
    		for (Integer a_var: a) {
    			
    			if (i%a_var != 0) {
    				flag = Boolean.FALSE;
    				break;
    			}
    		}
    		
    		if (!flag) {
    			continue;
    		}
    		
    		for (Integer b_var: b) {
    			
    			if (b_var%i != 0) {
    				flag = Boolean.FALSE;
    				break;
    			}
    		}
    		
    		if (flag) {
    			res++;
    		}
    	}
    	
    	return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = getTotalX(arr, brr);

        System.out.println(String.valueOf(total));
//        bufferedWriter.write(String.valueOf(total));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
