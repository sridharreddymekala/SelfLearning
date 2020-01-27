package com.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
	
	// Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	List<Integer> result = new ArrayList<Integer>();
        int a_res = 0;
        int b_res = 0;
        
        for (int i =0; i < 3; i++) {
        	
        	if (a.get(i) > b.get(i)) {
        		a_res++;
        	} else if (b.get(i) > a.get(i)) {
        		b_res++;
        	}
        }
        result.add(a_res);
        result.add(b_res);
    	
    	return result;
    }

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
//            bufferedWriter.write(String.valueOf(result.get(i)));
        	System.out.print(result.get(i));

            if (i != result.size() - 1) {
//                bufferedWriter.write(" ");
            	System.out.print(" ");
            }
        }

//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }

}
