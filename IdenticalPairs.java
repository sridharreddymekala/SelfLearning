package com.hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IdenticalPairs {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        s.close();
        Set<String> identicalPairs = new HashSet<String>();
        for (int i = 0; i < t; i++) {
            identicalPairs.add(pair_left[i]+ "#" + pair_right[i]);
            System.out.println(identicalPairs.size());
        }

    }
}
