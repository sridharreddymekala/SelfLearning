package com.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicArray {
	/*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    	List<Integer> list = new ArrayList<Integer>();
    	Map<Integer, List<Integer>> seqList = new HashMap<Integer, List<Integer>>();
    	int lastAnswer = 0;
    	
    	for (List<Integer> queryList: queries) {
    		int seq = 0;
    		List<Integer> temp_List = null;
    		
			seq = (queryList.get(1)^lastAnswer)%n;
			if (seqList.get(seq) == null) {
				seqList.put(seq, new ArrayList<Integer>());
			}
			temp_List = seqList.get(seq);
    			
			if (queryList.get(0) == 1) {
				
				temp_List.add(queryList.get(2));
				seqList.put(seq, temp_List);
				
			} else if (queryList.get(0) == 2) {
    			
    			lastAnswer = temp_List.get(queryList.get(2)%temp_List.size());
    			list.add(lastAnswer);
    		}
    	}
    	
    	return list;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> result = DynamicArray.dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
//            bufferedWriter.write(String.valueOf(result.get(i)));
        	System.out.println(String.valueOf(result.get(i)));
        	
            if (i != result.size() - 1) {
//                bufferedWriter.write("\n");
            	System.out.println("\n");
            }
        }

//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
