package com.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfProgrammer {
	// Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
    	String res = null;
    	
    	int mon7 = 215;
    	int feb = 0;
    	
		if (year < 1918) // julian
			feb = (year%4 == 0) ? 29 : 28;
		else if (year > 1918) // gregorian
			feb = (year % 400 == 0) || (!(year % 100 == 0) && (year % 4 == 0)) ? 29 : 28;
		else // dreaded 1918
			feb = 15;
    	
		feb = 256 - (feb + mon7);
    	
		res = feb + ".09." + year;
    	return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        System.out.println(result);
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
