package com.hackerrank;

import java.util.Scanner;

public class LeapGame {

	private static boolean canJump(int leap, int[] game, int i) {
		boolean canJump = false;
		if (i < 0 || game[i] == 1)
			return false;
		if ((i == game.length - 1) || (i + leap >= game.length)) {
			return true;
		}

		game[i] = 1;

		if (leap > 0 && game[i + leap] == 0) {
			i = i + leap;
			canJump = canJump(leap, game, i);
		} 
		
		if (!canJump && game[i + 1] == 0) {
			i = i + 1;
			return canJump(leap, game, i);
		} 

		if (!canJump && (i - 1) >= 0 && game[i - 1] == 0) {
			i = i - 1;
			return canJump(leap, game, i);
		} 

		return canJump;
	}

	public static boolean canWin(int leap, int[] game) {
		boolean win = false;

		for (int i = 0; i < game.length;) {

			return canJump(leap, game, i);
		}

		return win;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}
}
