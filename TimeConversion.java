package com.hackerrank;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
	/*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String newTime = null;

        try {
			Date date = new SimpleDateFormat("hh:mm:ssa").parse(s);
			newTime = new SimpleDateFormat("HH:mm:ss").format(date);		
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        return newTime;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
//        bw.write(result);
//        bw.newLine();
//
//        bw.close();
    }
}
