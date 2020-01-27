package com.hackerrank;

import java.util.Scanner;

public class TokenSplit {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        String[] splits = s.trim().split("[ !,?._'@]+");
        
        if (splits.length > 0 && !splits[0].equalsIgnoreCase("")) {
        	System.out.println(splits.length);
        } else {
        	System.out.println(0);
        }
        
        for (String split: splits) {
        	if (!split.trim().equalsIgnoreCase("")) {
        		System.out.println(split);
        	}
        	
        }
        
    }
}
