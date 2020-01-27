package com.hackerrank;

import java.util.Scanner;

public class JavaLoops2 {
	
	static void createSeries(int a, int b, int n) {
		
		
		for (int i =0; i < n; i++) {
			long sum = a;
			for (int j =0; j <= i; j++) {
				sum += b*Math.pow(2, j);
			}
			System.out.print(sum);
			if (i < n) {
				System.out.print(" ");
			}
		}
		
	}
	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            createSeries(a, b, n);
            System.out.println("");
        }
        in.close();
        
    }
}
