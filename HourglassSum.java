package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HourglassSum {
	
	static int getMatrixSum(int[][] arr) {
		int matrix_sum = 0;
		
		for (int i = 0; i < 3; i++) {
    		
    		for (int j = 0; j< 3; j++) {
    			
    			if (!(i == 1 && (j ==0 || j == 2))) {
    				matrix_sum += arr[i][j];
    			}
    			
    		}
		}
		
		return matrix_sum;
	}
	
	
	// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	int res = Integer.MIN_VALUE;
    	
    	
    	for (int i = 0; i < 4; i++) {
    		
    		for (int j = 0; j< 4; j++) {
    			int matrix_sum = 0;
    			int[][] subArray = new int[3][3];
    			
    			subArray[0] = Arrays.copyOfRange(arr[i], j, j + 3);
    			subArray[1] = Arrays.copyOfRange(arr[i + 1], j, j + 3);
    			subArray[2] = Arrays.copyOfRange(arr[i + 2], j, j + 3);
    			
    			matrix_sum = getMatrixSum(subArray);
    			if (matrix_sum > res) {
    				res = matrix_sum;
    			}
    			
    		}
    	}
    	
    	return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(String.valueOf(result));
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
