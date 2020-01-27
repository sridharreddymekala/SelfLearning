package com.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class GetDay {
	
	/*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	String res = "";
    	
    	Calendar cal = new GregorianCalendar();
    	cal.set(Calendar.YEAR, year);
    	cal.set(Calendar.MONTH, month - 1);
    	cal.set(Calendar.DATE, day);
    	
    	int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
    	
    	System.out.println(cal.getTime());
    	
    	switch (dayOfWeek) {
		case 1:
			res = "SUNDAY";
			break;
		case 2:
			res = "MONDAY";
			break;
		case 3:
			res = "TUESDAY";
			break;
		case 4:
			res = "WEDNESDAY";
			break;
		case 5:
			res = "THURSDAY";
			break;
		case 6:
			res = "FRIDAY";
			break;
		case 7:
			res = "SATURDAY";
			break;
		}
    	
    	return res;
    }

    
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);

        System.out.println(res);
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
