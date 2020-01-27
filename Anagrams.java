package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagrams {

	static boolean isAnagram(String a, String b) {
        boolean flag = true;
        
        char[] a_chars = a.toUpperCase().toCharArray();
        java.util.Arrays.sort(a_chars);
        
        char[] b_chars = b.toUpperCase().toCharArray();
        java.util.Arrays.sort(b_chars);
        
        if (a_chars.length == b_chars.length) {
        	
        	for (int i = 0; i < b_chars.length; i++) {
        		
        		if (a_chars[i] != b_chars[i]) {
        			flag = false;
        			break;
        		}
        		
        	}
        	
        } else {
        	flag = false;
        }
        
        
        return flag;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
