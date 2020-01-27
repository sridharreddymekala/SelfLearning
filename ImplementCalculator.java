package com.hackerrank;

import java.util.Scanner;

class MyCalculator1 {
    public long power(int n, int p) throws Exception {
    	long res = 0;
    	try {
    		if (n < 0 || p < 0) {
    			throw new Exception("n or p should not be negative.");
    		} else if (n == 0 && p == 0) {
    			throw new Exception("n and p should not be zero.");
    		}
    		
			res = (long) Math.pow(n, p);
		} catch (Exception e) {
			throw e;
		}
    	
    	return res;
    }
    
}

public class ImplementCalculator {

	public static final MyCalculator1 my_calculator = new MyCalculator1();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
