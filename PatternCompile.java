package com.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternCompile {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String regex = in.nextLine();
          	try {
          		testCases--;
				Pattern pattern2 = Pattern.compile(regex);
			} catch (Exception e) {
				System.out.println("Invalid");
				continue;
			}
          	System.out.println("Valid");
		}
		in.close();
	}
}
