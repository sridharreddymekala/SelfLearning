package com.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLTagsParsers {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			boolean flag = false;
			
	      	Pattern pattern = Pattern.compile("\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>");
	      	Matcher matcher = pattern.matcher(line);
	      	
	      	while (matcher.find()) {
	      		flag = true;
	      		String temp_line = matcher.group();
	      		temp_line = temp_line.substring(temp_line.indexOf(">") + 1,temp_line.lastIndexOf("<"));
	      		System.out.println(temp_line);
	      	}
	      	
	      	if (!flag) {
	      		System.out.println("None");
	      	}
			
			testCases--;
		}
		in.close();
	}
}
