package com.hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContiguousMax {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;
        Set<Integer> queueSet = new HashSet<Integer>(3);
        
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            queueSet.add(num);
            
            if (deque.size() == m) {
            	if (queueSet.size() > max) {
        			max = queueSet.size();
        		}
            	int peek = deque.pollFirst();
            	if (!deque.contains(peek)) {
            		queueSet.remove(peek);
            	}
            }
        }
        in.close();
        
        System.out.println(max);
    }
	
}
