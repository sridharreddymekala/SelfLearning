package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Kangaroo {
	 // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
    	String res = "NO";
    	
    	float a1 = (float) (x1 - x2)/(v2 - v1);
    	float a2 = (float) (x2 - x1)/(v1 - v2);

    	if ((a1 > 0 && a1%1 == 0) || (a2 > 0 && a2%1 == 0)) {
    		res = "YES";
    	}
    	
    	return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        System.out.println(result);
        scanner.close();
    }
}
