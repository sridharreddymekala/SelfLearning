package com.hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class BalancedString {

	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();

			char[] braces = input.toCharArray();
			Stack<Character> charStack = new Stack<Character>();
			for (int i = 0; i < braces.length; i++) {
				
				if (charStack.size() > 0) {
					
					char peek = charStack.peek();
					
					if ('{' == peek && '}' == braces[i]) {
						charStack.pop();
					} else if ('(' == peek && ')' == braces[i]) {
						charStack.pop();
					} else if ('[' == peek && ']' == braces[i]) {
						charStack.pop();
					} else {
						charStack.push(braces[i]);
					}
					
				} else {
					charStack.push(braces[i]);
				}
				
			}
			
			if (charStack.size() > 0) {
				System.out.println("false");
			} else {
				System.out.println("true");
			}
		}
		sc.close();
	}
}
